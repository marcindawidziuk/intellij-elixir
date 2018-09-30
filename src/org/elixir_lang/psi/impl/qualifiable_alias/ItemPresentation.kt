package org.elixir_lang.psi.impl.qualifiable_alias

import com.intellij.navigation.ItemPresentation
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNamedElement
import org.elixir_lang.psi.*
import org.elixir_lang.psi.call.Call
import org.elixir_lang.psi.call.name.Function.ALIAS
import org.elixir_lang.psi.call.name.Module.KERNEL
import org.elixir_lang.psi.impl.call.finalArguments
import org.elixir_lang.psi.impl.hasKeywordKey
import org.elixir_lang.psi.impl.locationString
import org.elixir_lang.reference.module.UnaliasedName
import javax.swing.Icon

class ItemPresentation(private val qualifiableAlias: QualifiableAlias) : ItemPresentation {
    override fun getLocationString(): String = _locationString
    override fun getIcon(unused: Boolean): Icon? = null
    override fun getPresentableText(): String? = _presentableText

    private val _locationString by lazy {
        qualifiableAlias.containingFile.locationString(qualifiableAlias.project)
    }

    private val _presentableText by lazy {
        qualifiableAlias.parent.let { parent ->
                when (parent) {
                    is ElixirAccessExpression -> getPresentableText(parent)
                    else -> qualifiableAlias.fullyQualifiedName()
                }
            }
    }

    private tailrec fun getPresentableText(ancestor: PsiElement): String? =
            when (ancestor) {
                is Call ->
                        if (ancestor.isCalling(KERNEL, ALIAS)) {
                            "alias ${UnaliasedName.unaliasedName(qualifiableAlias)}"
                        } else {
                            qualifiableAlias.fullyQualifiedName()
                        }
                is Arguments,
                is ElixirAccessExpression,
                is ElixirMatchedParenthesesArguments,
                is ElixirMultipleAliases,
                is QualifiedMultipleAliases->
                    getPresentableText(ancestor.parent)
                is QuotableKeywordPair -> {
                    if (ancestor.hasKeywordKey("as")) {
                        aliasFirstArgument(ancestor)?.let { aliasFirstArgument ->
                            "alias ${UnaliasedName.unaliasedName(aliasFirstArgument)}, as: ${qualifiableAlias.name}"
                        } ?: qualifiableAlias.name
                    } else {
                        null
                    }
                }
                else ->
                    qualifiableAlias.fullyQualifiedName()
            }

    private tailrec fun aliasFirstArgument(ancestor: PsiElement): PsiNamedElement? =
            when (ancestor) {
                is Arguments,
                is QuotableKeywordList,
                is QuotableKeywordPair ->
                    aliasFirstArgument(ancestor.parent)
                is Call -> {
                    if (ancestor.isCalling(KERNEL, ALIAS)) {
                        ancestor.finalArguments()!![0] as? PsiNamedElement
                    } else {
                        null
                    }
                }
                else -> null
            }
}
