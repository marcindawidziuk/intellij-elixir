// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ElixirMatchedMultiplicationOperation extends PsiElement {

  @NotNull
  List<ElixirAlias> getAliasList();

  @NotNull
  List<ElixirAtCharTokenOrNumberOperation> getAtCharTokenOrNumberOperationList();

  @NotNull
  List<ElixirAtom> getAtomList();

  @NotNull
  List<ElixirCaptureCharTokenOrNumberOperation> getCaptureCharTokenOrNumberOperationList();

  @NotNull
  List<ElixirCharList> getCharListList();

  @NotNull
  List<ElixirCharListHeredoc> getCharListHeredocList();

  @NotNull
  List<ElixirEscapedCharacter> getEscapedCharacterList();

  @NotNull
  List<ElixirHexadecimalEscapeSequence> getHexadecimalEscapeSequenceList();

  @Nullable
  ElixirInterpolatedCharListBody getInterpolatedCharListBody();

  @NotNull
  List<ElixirInterpolatedCharListSigilHeredoc> getInterpolatedCharListSigilHeredocList();

  @Nullable
  ElixirInterpolatedStringBody getInterpolatedStringBody();

  @NotNull
  List<ElixirInterpolation> getInterpolationList();

  @NotNull
  List<ElixirList> getListList();

  @NotNull
  List<ElixirMatchedAtOperation> getMatchedAtOperationList();

  @NotNull
  List<ElixirMatchedHatOperation> getMatchedHatOperationList();

  @Nullable
  ElixirMatchedMultiplicationOperation getMatchedMultiplicationOperation();

  @NotNull
  List<ElixirMatchedNonNumericCaptureOperation> getMatchedNonNumericCaptureOperationList();

  @NotNull
  List<ElixirMatchedUnaryOperation> getMatchedUnaryOperationList();

  @NotNull
  ElixirMultiplicationInfixOperator getMultiplicationInfixOperator();

  @Nullable
  ElixirNoParenthesesManyArgumentsQualifiedCall getNoParenthesesManyArgumentsQualifiedCall();

  @Nullable
  ElixirNoParenthesesManyArgumentsUnqualifiedCall getNoParenthesesManyArgumentsUnqualifiedCall();

  @NotNull
  List<ElixirNoParenthesesNoArgumentsQualifiedCall> getNoParenthesesNoArgumentsQualifiedCallList();

  @NotNull
  List<ElixirNoParenthesesNoArgumentsUnqualifiedCallOrVariable> getNoParenthesesNoArgumentsUnqualifiedCallOrVariableList();

  @NotNull
  List<ElixirNumber> getNumberList();

  @NotNull
  List<ElixirQualifiedAlias> getQualifiedAliasList();

  @NotNull
  List<ElixirString> getStringList();

  @NotNull
  List<ElixirStringHeredoc> getStringHeredocList();

  @NotNull
  List<ElixirUnaryCharTokenOrNumberOperation> getUnaryCharTokenOrNumberOperationList();

}
