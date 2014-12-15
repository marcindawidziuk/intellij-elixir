// This is a generated file. Not intended for manual editing.
package org.elixir_lang.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static org.elixir_lang.psi.ElixirTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class ElixirParser implements PsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ADJACENT_EXPRESSION) {
      r = adjacentExpression(b, 0);
    }
    else if (t == AT_MATCHED_EXPRESSION_OPERATION) {
      r = atMatchedExpressionOperation(b, 0);
    }
    else if (t == AT_NO_PARENTHESES_EXPRESSION_OPERATION) {
      r = atNoParenthesesExpressionOperation(b, 0);
    }
    else if (t == ATOM) {
      r = atom(b, 0);
    }
    else if (t == BINARY_WHOLE_NUMBER) {
      r = binaryWholeNumber(b, 0);
    }
    else if (t == CALL_ARGUMENTS_NO_PARENTHESES_KEYWORDS) {
      r = callArgumentsNoParenthesesKeywords(b, 0);
    }
    else if (t == CALL_ARGUMENTS_NO_PARENTHESES_KEYWORDS_EXPRESSION) {
      r = callArgumentsNoParenthesesKeywordsExpression(b, 0);
    }
    else if (t == CALL_ARGUMENTS_NO_PARENTHESES_MANY) {
      r = callArgumentsNoParenthesesMany(b, 0);
    }
    else if (t == CAPTURE_MATCHED_EXPRESSION_OPERATION) {
      r = captureMatchedExpressionOperation(b, 0);
    }
    else if (t == CAPTURE_NO_PARENTHESES_EXPRESSION_OPERATION) {
      r = captureNoParenthesesExpressionOperation(b, 0);
    }
    else if (t == CHAR_LIST) {
      r = charList(b, 0);
    }
    else if (t == CHAR_LIST_HEREDOC) {
      r = charListHeredoc(b, 0);
    }
    else if (t == DECIMAL_FLOAT) {
      r = decimalFloat(b, 0);
    }
    else if (t == DECIMAL_NUMBER) {
      r = decimalNumber(b, 0);
    }
    else if (t == DECIMAL_WHOLE_NUMBER) {
      r = decimalWholeNumber(b, 0);
    }
    else if (t == EMPTY_PARENTHESES) {
      r = emptyParentheses(b, 0);
    }
    else if (t == END_OF_EXPRESSION) {
      r = endOfExpression(b, 0);
    }
    else if (t == EXPRESSION) {
      r = expression(b, 0);
    }
    else if (t == HEXADECIMAL_WHOLE_NUMBER) {
      r = hexadecimalWholeNumber(b, 0);
    }
    else if (t == IDENTIFIER_EXPRESSION) {
      r = identifierExpression(b, 0);
    }
    else if (t == INTERPOLATION) {
      r = interpolation(b, 0);
    }
    else if (t == KEYWORD_KEY) {
      r = keywordKey(b, 0);
    }
    else if (t == KEYWORD_PAIR) {
      r = keywordPair(b, 0);
    }
    else if (t == KEYWORD_VALUE) {
      r = keywordValue(b, 0);
    }
    else if (t == LIST) {
      r = list(b, 0);
    }
    else if (t == MATCHED_EXPRESSION) {
      r = matchedExpression(b, 0, -1);
    }
    else if (t == MATCHED_EXPRESSION_ACCESS_EXPRESSION) {
      r = matchedExpressionAccessExpression(b, 0);
    }
    else if (t == MATCHED_EXPRESSION_ADDITION_MATCHED_EXPRESSION_OPERATION) {
      r = matchedExpression(b, 0, 12);
    }
    else if (t == MATCHED_EXPRESSION_ADDITION_NO_PARENTHESES_EXPRESSION_OPERATION) {
      r = matchedExpressionAdditionNoParenthesesExpressionOperation(b, 0);
    }
    else if (t == MATCHED_EXPRESSION_AND_MATCHED_EXPRESSION_OPERATION) {
      r = matchedExpression(b, 0, 6);
    }
    else if (t == MATCHED_EXPRESSION_AND_NO_PARENTHESES_EXPRESSION_OPERATION) {
      r = matchedExpressionAndNoParenthesesExpressionOperation(b, 0);
    }
    else if (t == MATCHED_EXPRESSION_ARROW_MATCHED_EXPRESSION_OPERATION) {
      r = matchedExpression(b, 0, 9);
    }
    else if (t == MATCHED_EXPRESSION_ARROW_NO_PARENTHESES_EXPRESSION_OPERATION) {
      r = matchedExpressionArrowNoParenthesesExpressionOperation(b, 0);
    }
    else if (t == MATCHED_EXPRESSION_COMPARISON_MATCHED_EXPRESSION_OPERATION) {
      r = matchedExpression(b, 0, 7);
    }
    else if (t == MATCHED_EXPRESSION_COMPARISON_NO_PARENTHESES_EXPRESSION_OPERATION) {
      r = matchedExpressionComparisonNoParenthesesExpressionOperation(b, 0);
    }
    else if (t == MATCHED_EXPRESSION_DOT_ALIAS) {
      r = matchedExpression(b, 0, 16);
    }
    else if (t == MATCHED_EXPRESSION_DOT_IDENTIFIER) {
      r = matchedExpression(b, 0, 17);
    }
    else if (t == MATCHED_EXPRESSION_HAT_MATCHED_EXPRESSION_OPERATION) {
      r = matchedExpression(b, 0, 14);
    }
    else if (t == MATCHED_EXPRESSION_HAT_NO_PARENTHESES_EXPRESSION_OPERATION) {
      r = matchedExpressionHatNoParenthesesExpressionOperation(b, 0);
    }
    else if (t == MATCHED_EXPRESSION_IN_MATCH_MATCHED_EXPRESSION_OPERATION) {
      r = matchedExpression(b, 0, 0);
    }
    else if (t == MATCHED_EXPRESSION_IN_MATCH_NO_PARENTHESES_EXPRESSION_OPERATION) {
      r = matchedExpressionInMatchNoParenthesesExpressionOperation(b, 0);
    }
    else if (t == MATCHED_EXPRESSION_IN_MATCHED_EXPRESSION_OPERATION) {
      r = matchedExpression(b, 0, 10);
    }
    else if (t == MATCHED_EXPRESSION_IN_NO_PARENTHESES_EXPRESSION_OPERATION) {
      r = matchedExpressionInNoParenthesesExpressionOperation(b, 0);
    }
    else if (t == MATCHED_EXPRESSION_MATCH_MATCHED_EXPRESSION_OPERATION) {
      r = matchedExpression(b, 0, 4);
    }
    else if (t == MATCHED_EXPRESSION_MATCH_NO_PARENTHESES_EXPRESSION_OPERATION) {
      r = matchedExpressionMatchNoParenthesesExpressionOperation(b, 0);
    }
    else if (t == MATCHED_EXPRESSION_MAX_EXPRESSION) {
      r = matchedExpressionMaxExpression(b, 0);
    }
    else if (t == MATCHED_EXPRESSION_MULTIPLICATION_MATCHED_EXPRESSION_OPERATION) {
      r = matchedExpression(b, 0, 13);
    }
    else if (t == MATCHED_EXPRESSION_MULTIPLICATION_NO_PARENTHESES_EXPRESSION_OPERATION) {
      r = matchedExpressionMultiplicationNoParenthesesExpressionOperation(b, 0);
    }
    else if (t == MATCHED_EXPRESSION_OR_MATCHED_EXPRESSION_OPERATION) {
      r = matchedExpression(b, 0, 5);
    }
    else if (t == MATCHED_EXPRESSION_OR_NO_PARENTHESES_EXPRESSION_OPERATION) {
      r = matchedExpressionOrNoParenthesesExpressionOperation(b, 0);
    }
    else if (t == MATCHED_EXPRESSION_PIPE_MATCHED_EXPRESSION_OPERATION) {
      r = matchedExpression(b, 0, 3);
    }
    else if (t == MATCHED_EXPRESSION_PIPE_NO_PARENTHESES_EXPRESSION_OPERATION) {
      r = matchedExpressionPipeNoParenthesesExpressionOperation(b, 0);
    }
    else if (t == MATCHED_EXPRESSION_RELATIONAL_MATCHED_EXPRESSION_OPERATION) {
      r = matchedExpression(b, 0, 8);
    }
    else if (t == MATCHED_EXPRESSION_RELATIONAL_NO_PARENTHESES_EXPRESSION_OPERATION) {
      r = matchedExpressionRelationalNoParenthesesExpressionOperation(b, 0);
    }
    else if (t == MATCHED_EXPRESSION_TWO_MATCHED_EXPRESSION_OPERATION) {
      r = matchedExpression(b, 0, 11);
    }
    else if (t == MATCHED_EXPRESSION_TWO_NO_PARENTHESES_EXPRESSION_OPERATION) {
      r = matchedExpressionTwoNoParenthesesExpressionOperation(b, 0);
    }
    else if (t == MATCHED_EXPRESSION_TYPE_MATCHED_EXPRESSION_OPERATION) {
      r = matchedExpression(b, 0, 2);
    }
    else if (t == MATCHED_EXPRESSION_TYPE_NO_PARENTHESES_EXPRESSION_OPERATION) {
      r = matchedExpressionTypeNoParenthesesExpressionOperation(b, 0);
    }
    else if (t == MATCHED_EXPRESSION_WHEN_MATCHED_EXPRESSION_OPERATION) {
      r = matchedExpression(b, 0, 1);
    }
    else if (t == MATCHED_EXPRESSION_WHEN_NO_PARENTHESES_EXPRESSION_OPERATION) {
      r = matchedExpressionWhenNoParenthesesExpressionOperation(b, 0);
    }
    else if (t == NO_PARENTHESES_EXPRESSION) {
      r = noParenthesesExpression(b, 0);
    }
    else if (t == NO_PARENTHESES_MANY_STRICT_NO_PARENTHESES_EXPRESSION) {
      r = noParenthesesManyStrictNoParenthesesExpression(b, 0);
    }
    else if (t == NO_PARENTHESES_MAYBE_QUALIFIED_IDENTIFIER) {
      r = noParenthesesMaybeQualifiedIdentifier(b, 0);
    }
    else if (t == NO_PARENTHESES_QUALIFIER) {
      r = noParenthesesQualifier(b, 0);
    }
    else if (t == NO_PARENTHESES_QUALIFIER_AT_OPERATION) {
      r = noParenthesesQualifierAtOperation(b, 0);
    }
    else if (t == NO_PARENTHESES_QUALIFIER_NUMBER_AT_OPERATION) {
      r = noParenthesesQualifierNumberAtOperation(b, 0);
    }
    else if (t == NO_PARENTHESES_QUALIFIER_NUMBER_CAPTURE_OPERATION) {
      r = noParenthesesQualifierNumberCaptureOperation(b, 0);
    }
    else if (t == NO_PARENTHESES_QUALIFIER_NUMBER_UNARY_OPERATION) {
      r = noParenthesesQualifierNumberUnaryOperation(b, 0);
    }
    else if (t == NO_PARENTHESES_STRICT) {
      r = noParenthesesStrict(b, 0);
    }
    else if (t == NUMBER) {
      r = number(b, 0);
    }
    else if (t == NUMBER_UNARY_OPERATION) {
      r = numberUnaryOperation(b, 0);
    }
    else if (t == OCTAL_WHOLE_NUMBER) {
      r = octalWholeNumber(b, 0);
    }
    else if (t == SIGIL) {
      r = sigil(b, 0);
    }
    else if (t == STRING) {
      r = string(b, 0);
    }
    else if (t == STRING_HEREDOC) {
      r = stringHeredoc(b, 0);
    }
    else if (t == UNARY_MATCHED_EXPRESSION_OPERATION) {
      r = unaryMatchedExpressionOperation(b, 0);
    }
    else if (t == UNARY_NO_PARENTHESES_EXPRESSION_OPERATION) {
      r = unaryNoParenthesesExpressionOperation(b, 0);
    }
    else if (t == UNKNOWN_BASE_WHOLE_NUMBER) {
      r = unknownBaseWholeNumber(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return elixirFile(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(ATOM, MATCHED_EXPRESSION_MAX_EXPRESSION),
    create_token_set_(DECIMAL_FLOAT, DECIMAL_NUMBER),
    create_token_set_(BINARY_WHOLE_NUMBER, DECIMAL_FLOAT, DECIMAL_NUMBER, DECIMAL_WHOLE_NUMBER,
      HEXADECIMAL_WHOLE_NUMBER, NUMBER, OCTAL_WHOLE_NUMBER, UNKNOWN_BASE_WHOLE_NUMBER),
    create_token_set_(ATOM, BINARY_WHOLE_NUMBER, CHAR_LIST, CHAR_LIST_HEREDOC,
      DECIMAL_FLOAT, DECIMAL_NUMBER, DECIMAL_WHOLE_NUMBER, HEXADECIMAL_WHOLE_NUMBER,
      LIST, MATCHED_EXPRESSION_ACCESS_EXPRESSION, MATCHED_EXPRESSION_MAX_EXPRESSION, NUMBER,
      NUMBER_UNARY_OPERATION, OCTAL_WHOLE_NUMBER, SIGIL, STRING,
      STRING_HEREDOC, UNKNOWN_BASE_WHOLE_NUMBER),
    create_token_set_(AT_NO_PARENTHESES_EXPRESSION_OPERATION, CAPTURE_NO_PARENTHESES_EXPRESSION_OPERATION, MATCHED_EXPRESSION_ADDITION_NO_PARENTHESES_EXPRESSION_OPERATION, MATCHED_EXPRESSION_AND_NO_PARENTHESES_EXPRESSION_OPERATION,
      MATCHED_EXPRESSION_ARROW_NO_PARENTHESES_EXPRESSION_OPERATION, MATCHED_EXPRESSION_COMPARISON_NO_PARENTHESES_EXPRESSION_OPERATION, MATCHED_EXPRESSION_HAT_NO_PARENTHESES_EXPRESSION_OPERATION, MATCHED_EXPRESSION_IN_MATCH_NO_PARENTHESES_EXPRESSION_OPERATION,
      MATCHED_EXPRESSION_IN_NO_PARENTHESES_EXPRESSION_OPERATION, MATCHED_EXPRESSION_MATCH_NO_PARENTHESES_EXPRESSION_OPERATION, MATCHED_EXPRESSION_MULTIPLICATION_NO_PARENTHESES_EXPRESSION_OPERATION, MATCHED_EXPRESSION_OR_NO_PARENTHESES_EXPRESSION_OPERATION,
      MATCHED_EXPRESSION_PIPE_NO_PARENTHESES_EXPRESSION_OPERATION, MATCHED_EXPRESSION_RELATIONAL_NO_PARENTHESES_EXPRESSION_OPERATION, MATCHED_EXPRESSION_TWO_NO_PARENTHESES_EXPRESSION_OPERATION, MATCHED_EXPRESSION_TYPE_NO_PARENTHESES_EXPRESSION_OPERATION,
      MATCHED_EXPRESSION_WHEN_NO_PARENTHESES_EXPRESSION_OPERATION, NO_PARENTHESES_EXPRESSION, UNARY_NO_PARENTHESES_EXPRESSION_OPERATION),
    create_token_set_(ATOM, AT_MATCHED_EXPRESSION_OPERATION, BINARY_WHOLE_NUMBER, CAPTURE_MATCHED_EXPRESSION_OPERATION,
      CHAR_LIST, CHAR_LIST_HEREDOC, DECIMAL_FLOAT, DECIMAL_NUMBER,
      DECIMAL_WHOLE_NUMBER, HEXADECIMAL_WHOLE_NUMBER, IDENTIFIER_EXPRESSION, LIST,
      MATCHED_EXPRESSION, MATCHED_EXPRESSION_ACCESS_EXPRESSION, MATCHED_EXPRESSION_ADDITION_MATCHED_EXPRESSION_OPERATION, MATCHED_EXPRESSION_AND_MATCHED_EXPRESSION_OPERATION,
      MATCHED_EXPRESSION_ARROW_MATCHED_EXPRESSION_OPERATION, MATCHED_EXPRESSION_COMPARISON_MATCHED_EXPRESSION_OPERATION, MATCHED_EXPRESSION_DOT_ALIAS, MATCHED_EXPRESSION_DOT_IDENTIFIER,
      MATCHED_EXPRESSION_HAT_MATCHED_EXPRESSION_OPERATION, MATCHED_EXPRESSION_IN_MATCHED_EXPRESSION_OPERATION, MATCHED_EXPRESSION_IN_MATCH_MATCHED_EXPRESSION_OPERATION, MATCHED_EXPRESSION_MATCH_MATCHED_EXPRESSION_OPERATION,
      MATCHED_EXPRESSION_MAX_EXPRESSION, MATCHED_EXPRESSION_MULTIPLICATION_MATCHED_EXPRESSION_OPERATION, MATCHED_EXPRESSION_OR_MATCHED_EXPRESSION_OPERATION, MATCHED_EXPRESSION_PIPE_MATCHED_EXPRESSION_OPERATION,
      MATCHED_EXPRESSION_RELATIONAL_MATCHED_EXPRESSION_OPERATION, MATCHED_EXPRESSION_TWO_MATCHED_EXPRESSION_OPERATION, MATCHED_EXPRESSION_TYPE_MATCHED_EXPRESSION_OPERATION, MATCHED_EXPRESSION_WHEN_MATCHED_EXPRESSION_OPERATION,
      NUMBER, NUMBER_UNARY_OPERATION, OCTAL_WHOLE_NUMBER, SIGIL,
      STRING, STRING_HEREDOC, UNARY_MATCHED_EXPRESSION_OPERATION, UNKNOWN_BASE_WHOLE_NUMBER),
    create_token_set_(ATOM, AT_MATCHED_EXPRESSION_OPERATION, AT_NO_PARENTHESES_EXPRESSION_OPERATION, BINARY_WHOLE_NUMBER,
      CAPTURE_MATCHED_EXPRESSION_OPERATION, CAPTURE_NO_PARENTHESES_EXPRESSION_OPERATION, CHAR_LIST, CHAR_LIST_HEREDOC,
      DECIMAL_FLOAT, DECIMAL_NUMBER, DECIMAL_WHOLE_NUMBER, EMPTY_PARENTHESES,
      EXPRESSION, HEXADECIMAL_WHOLE_NUMBER, IDENTIFIER_EXPRESSION, LIST,
      MATCHED_EXPRESSION, MATCHED_EXPRESSION_ACCESS_EXPRESSION, MATCHED_EXPRESSION_ADDITION_MATCHED_EXPRESSION_OPERATION, MATCHED_EXPRESSION_ADDITION_NO_PARENTHESES_EXPRESSION_OPERATION,
      MATCHED_EXPRESSION_AND_MATCHED_EXPRESSION_OPERATION, MATCHED_EXPRESSION_AND_NO_PARENTHESES_EXPRESSION_OPERATION, MATCHED_EXPRESSION_ARROW_MATCHED_EXPRESSION_OPERATION, MATCHED_EXPRESSION_ARROW_NO_PARENTHESES_EXPRESSION_OPERATION,
      MATCHED_EXPRESSION_COMPARISON_MATCHED_EXPRESSION_OPERATION, MATCHED_EXPRESSION_COMPARISON_NO_PARENTHESES_EXPRESSION_OPERATION, MATCHED_EXPRESSION_DOT_ALIAS, MATCHED_EXPRESSION_DOT_IDENTIFIER,
      MATCHED_EXPRESSION_HAT_MATCHED_EXPRESSION_OPERATION, MATCHED_EXPRESSION_HAT_NO_PARENTHESES_EXPRESSION_OPERATION, MATCHED_EXPRESSION_IN_MATCHED_EXPRESSION_OPERATION, MATCHED_EXPRESSION_IN_MATCH_MATCHED_EXPRESSION_OPERATION,
      MATCHED_EXPRESSION_IN_MATCH_NO_PARENTHESES_EXPRESSION_OPERATION, MATCHED_EXPRESSION_IN_NO_PARENTHESES_EXPRESSION_OPERATION, MATCHED_EXPRESSION_MATCH_MATCHED_EXPRESSION_OPERATION, MATCHED_EXPRESSION_MATCH_NO_PARENTHESES_EXPRESSION_OPERATION,
      MATCHED_EXPRESSION_MAX_EXPRESSION, MATCHED_EXPRESSION_MULTIPLICATION_MATCHED_EXPRESSION_OPERATION, MATCHED_EXPRESSION_MULTIPLICATION_NO_PARENTHESES_EXPRESSION_OPERATION, MATCHED_EXPRESSION_OR_MATCHED_EXPRESSION_OPERATION,
      MATCHED_EXPRESSION_OR_NO_PARENTHESES_EXPRESSION_OPERATION, MATCHED_EXPRESSION_PIPE_MATCHED_EXPRESSION_OPERATION, MATCHED_EXPRESSION_PIPE_NO_PARENTHESES_EXPRESSION_OPERATION, MATCHED_EXPRESSION_RELATIONAL_MATCHED_EXPRESSION_OPERATION,
      MATCHED_EXPRESSION_RELATIONAL_NO_PARENTHESES_EXPRESSION_OPERATION, MATCHED_EXPRESSION_TWO_MATCHED_EXPRESSION_OPERATION, MATCHED_EXPRESSION_TWO_NO_PARENTHESES_EXPRESSION_OPERATION, MATCHED_EXPRESSION_TYPE_MATCHED_EXPRESSION_OPERATION,
      MATCHED_EXPRESSION_TYPE_NO_PARENTHESES_EXPRESSION_OPERATION, MATCHED_EXPRESSION_WHEN_MATCHED_EXPRESSION_OPERATION, MATCHED_EXPRESSION_WHEN_NO_PARENTHESES_EXPRESSION_OPERATION, NO_PARENTHESES_EXPRESSION,
      NUMBER, NUMBER_UNARY_OPERATION, OCTAL_WHOLE_NUMBER, SIGIL,
      STRING, STRING_HEREDOC, UNARY_MATCHED_EXPRESSION_OPERATION, UNARY_NO_PARENTHESES_EXPRESSION_OPERATION,
      UNKNOWN_BASE_WHOLE_NUMBER),
  };

  /* ********************************************************** */
  // expression
  public static boolean adjacentExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "adjacentExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<adjacent expression>");
    r = expression(b, l + 1);
    exit_section_(b, l, m, ADJACENT_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // AT_OPERATOR EOL* noParenthesesExpression
  public static boolean atNoParenthesesExpressionOperation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atNoParenthesesExpressionOperation")) return false;
    if (!nextTokenIs(b, AT_OPERATOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AT_OPERATOR);
    r = r && atNoParenthesesExpressionOperation_1(b, l + 1);
    r = r && noParenthesesExpression(b, l + 1);
    exit_section_(b, m, AT_NO_PARENTHESES_EXPRESSION_OPERATION, r);
    return r;
  }

  // EOL*
  private static boolean atNoParenthesesExpressionOperation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atNoParenthesesExpressionOperation_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "atNoParenthesesExpressionOperation_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // COLON (ATOM_FRAGMENT | quote)
  public static boolean atom(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atom")) return false;
    if (!nextTokenIs(b, COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && atom_1(b, l + 1);
    exit_section_(b, m, ATOM, r);
    return r;
  }

  // ATOM_FRAGMENT | quote
  private static boolean atom_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atom_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ATOM_FRAGMENT);
    if (!r) r = quote(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // string | stringHeredoc
  static boolean binaryString(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binaryString")) return false;
    if (!nextTokenIs(b, "", STRING_HEREDOC_PROMOTER, STRING_PROMOTER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = string(b, l + 1);
    if (!r) r = stringHeredoc(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BASE_WHOLE_NUMBER_PREFIX (BINARY_WHOLE_NUMBER_BASE | OBSOLETE_BINARY_WHOLE_NUMBER_BASE) (INVALID_BINARY_DIGITS | VALID_BINARY_DIGITS)+
  public static boolean binaryWholeNumber(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binaryWholeNumber")) return false;
    if (!nextTokenIs(b, BASE_WHOLE_NUMBER_PREFIX)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, BASE_WHOLE_NUMBER_PREFIX);
    r = r && binaryWholeNumber_1(b, l + 1);
    p = r; // pin = 2
    r = r && binaryWholeNumber_2(b, l + 1);
    exit_section_(b, l, m, BINARY_WHOLE_NUMBER, r, p, null);
    return r || p;
  }

  // BINARY_WHOLE_NUMBER_BASE | OBSOLETE_BINARY_WHOLE_NUMBER_BASE
  private static boolean binaryWholeNumber_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binaryWholeNumber_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BINARY_WHOLE_NUMBER_BASE);
    if (!r) r = consumeToken(b, OBSOLETE_BINARY_WHOLE_NUMBER_BASE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (INVALID_BINARY_DIGITS | VALID_BINARY_DIGITS)+
  private static boolean binaryWholeNumber_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binaryWholeNumber_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = binaryWholeNumber_2_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!binaryWholeNumber_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "binaryWholeNumber_2", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // INVALID_BINARY_DIGITS | VALID_BINARY_DIGITS
  private static boolean binaryWholeNumber_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binaryWholeNumber_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INVALID_BINARY_DIGITS);
    if (!r) r = consumeToken(b, VALID_BINARY_DIGITS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // matchedExpression (COMMA EOL* callArgumentsNoParenthesesExpression)+
  static boolean callArgumentsNoParenthesesCommaExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callArgumentsNoParenthesesCommaExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = matchedExpression(b, l + 1, -1);
    r = r && callArgumentsNoParenthesesCommaExpression_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA EOL* callArgumentsNoParenthesesExpression)+
  private static boolean callArgumentsNoParenthesesCommaExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callArgumentsNoParenthesesCommaExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = callArgumentsNoParenthesesCommaExpression_1_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!callArgumentsNoParenthesesCommaExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "callArgumentsNoParenthesesCommaExpression_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA EOL* callArgumentsNoParenthesesExpression
  private static boolean callArgumentsNoParenthesesCommaExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callArgumentsNoParenthesesCommaExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && callArgumentsNoParenthesesCommaExpression_1_0_1(b, l + 1);
    r = r && callArgumentsNoParenthesesExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EOL*
  private static boolean callArgumentsNoParenthesesCommaExpression_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callArgumentsNoParenthesesCommaExpression_1_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "callArgumentsNoParenthesesCommaExpression_1_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // emptyParentheses |
  //                                                  /* Must be before matchedExpression because noParenthesesExpression is
  //                                                     `matchedExpressionDotIdentifier callArgumentsNoParenthesesManyStrict`
  //                                                     which is longer than `matchedExpressionDotIdentifier` in
  //                                                     matchedExpression. */
  //                                                  /* This will be marked as an error by
  //                                                     {@link org.elixir_lang.inspection.NoParenthesesManyStrict} */
  //                                                  noParenthesesManyStrictNoParenthesesExpression |
  //                                                  matchedExpression !KEYWORD_PAIR_COLON
  static boolean callArgumentsNoParenthesesExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callArgumentsNoParenthesesExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = emptyParentheses(b, l + 1);
    if (!r) r = noParenthesesManyStrictNoParenthesesExpression(b, l + 1);
    if (!r) r = callArgumentsNoParenthesesExpression_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // matchedExpression !KEYWORD_PAIR_COLON
  private static boolean callArgumentsNoParenthesesExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callArgumentsNoParenthesesExpression_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = matchedExpression(b, l + 1, -1);
    r = r && callArgumentsNoParenthesesExpression_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !KEYWORD_PAIR_COLON
  private static boolean callArgumentsNoParenthesesExpression_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callArgumentsNoParenthesesExpression_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_, null);
    r = !consumeToken(b, KEYWORD_PAIR_COLON);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // callArgumentsNoParenthesesKeywordsExpression (COMMA EOL* callArgumentsNoParenthesesKeywordsExpression)*
  public static boolean callArgumentsNoParenthesesKeywords(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callArgumentsNoParenthesesKeywords")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<call arguments no parentheses keywords>");
    r = callArgumentsNoParenthesesKeywordsExpression(b, l + 1);
    r = r && callArgumentsNoParenthesesKeywords_1(b, l + 1);
    exit_section_(b, l, m, CALL_ARGUMENTS_NO_PARENTHESES_KEYWORDS, r, false, null);
    return r;
  }

  // (COMMA EOL* callArgumentsNoParenthesesKeywordsExpression)*
  private static boolean callArgumentsNoParenthesesKeywords_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callArgumentsNoParenthesesKeywords_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!callArgumentsNoParenthesesKeywords_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "callArgumentsNoParenthesesKeywords_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA EOL* callArgumentsNoParenthesesKeywordsExpression
  private static boolean callArgumentsNoParenthesesKeywords_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callArgumentsNoParenthesesKeywords_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && callArgumentsNoParenthesesKeywords_1_0_1(b, l + 1);
    r = r && callArgumentsNoParenthesesKeywordsExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EOL*
  private static boolean callArgumentsNoParenthesesKeywords_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callArgumentsNoParenthesesKeywords_1_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "callArgumentsNoParenthesesKeywords_1_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // keywordKeyColonEOL callArgumentsNoParenthesesExpression
  public static boolean callArgumentsNoParenthesesKeywordsExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callArgumentsNoParenthesesKeywordsExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<call arguments no parentheses keywords expression>");
    r = keywordKeyColonEOL(b, l + 1);
    r = r && callArgumentsNoParenthesesExpression(b, l + 1);
    exit_section_(b, l, m, CALL_ARGUMENTS_NO_PARENTHESES_KEYWORDS_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // matchedExpression COMMA EOL* callArgumentsNoParenthesesKeywords |
  //                                    callArgumentsNoParenthesesCommaExpression (COMMA EOL* callArgumentsNoParenthesesKeywords)?
  public static boolean callArgumentsNoParenthesesMany(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callArgumentsNoParenthesesMany")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<call arguments no parentheses many>");
    r = callArgumentsNoParenthesesMany_0(b, l + 1);
    if (!r) r = callArgumentsNoParenthesesMany_1(b, l + 1);
    exit_section_(b, l, m, CALL_ARGUMENTS_NO_PARENTHESES_MANY, r, false, null);
    return r;
  }

  // matchedExpression COMMA EOL* callArgumentsNoParenthesesKeywords
  private static boolean callArgumentsNoParenthesesMany_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callArgumentsNoParenthesesMany_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = matchedExpression(b, l + 1, -1);
    r = r && consumeToken(b, COMMA);
    r = r && callArgumentsNoParenthesesMany_0_2(b, l + 1);
    r = r && callArgumentsNoParenthesesKeywords(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EOL*
  private static boolean callArgumentsNoParenthesesMany_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callArgumentsNoParenthesesMany_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "callArgumentsNoParenthesesMany_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // callArgumentsNoParenthesesCommaExpression (COMMA EOL* callArgumentsNoParenthesesKeywords)?
  private static boolean callArgumentsNoParenthesesMany_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callArgumentsNoParenthesesMany_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = callArgumentsNoParenthesesCommaExpression(b, l + 1);
    r = r && callArgumentsNoParenthesesMany_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA EOL* callArgumentsNoParenthesesKeywords)?
  private static boolean callArgumentsNoParenthesesMany_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callArgumentsNoParenthesesMany_1_1")) return false;
    callArgumentsNoParenthesesMany_1_1_0(b, l + 1);
    return true;
  }

  // COMMA EOL* callArgumentsNoParenthesesKeywords
  private static boolean callArgumentsNoParenthesesMany_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callArgumentsNoParenthesesMany_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && callArgumentsNoParenthesesMany_1_1_0_1(b, l + 1);
    r = r && callArgumentsNoParenthesesKeywords(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EOL*
  private static boolean callArgumentsNoParenthesesMany_1_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callArgumentsNoParenthesesMany_1_1_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "callArgumentsNoParenthesesMany_1_1_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // callArgumentsNoParenthesesMany |
  //                                                  noParenthesesStrict
  static boolean callArgumentsNoParenthesesManyStrict(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callArgumentsNoParenthesesManyStrict")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = callArgumentsNoParenthesesMany(b, l + 1);
    if (!r) r = noParenthesesStrict(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CAPTURE_OPERATOR EOL* noParenthesesExpression
  public static boolean captureNoParenthesesExpressionOperation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "captureNoParenthesesExpressionOperation")) return false;
    if (!nextTokenIs(b, CAPTURE_OPERATOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CAPTURE_OPERATOR);
    r = r && captureNoParenthesesExpressionOperation_1(b, l + 1);
    r = r && noParenthesesExpression(b, l + 1);
    exit_section_(b, m, CAPTURE_NO_PARENTHESES_EXPRESSION_OPERATION, r);
    return r;
  }

  // EOL*
  private static boolean captureNoParenthesesExpressionOperation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "captureNoParenthesesExpressionOperation_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "captureNoParenthesesExpressionOperation_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // CHAR_LIST_PROMOTER
  //              interpolatedCharListBody
  //              CHAR_LIST_TERMINATOR
  public static boolean charList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "charList")) return false;
    if (!nextTokenIs(b, CHAR_LIST_PROMOTER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CHAR_LIST_PROMOTER);
    r = r && interpolatedCharListBody(b, l + 1);
    r = r && consumeToken(b, CHAR_LIST_TERMINATOR);
    exit_section_(b, m, CHAR_LIST, r);
    return r;
  }

  /* ********************************************************** */
  // CHAR_LIST_HEREDOC_PROMOTER EOL
  //                     interpolatedCharListBody
  //                     CHAR_LIST_HEREDOC_TERMINATOR
  public static boolean charListHeredoc(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "charListHeredoc")) return false;
    if (!nextTokenIs(b, CHAR_LIST_HEREDOC_PROMOTER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CHAR_LIST_HEREDOC_PROMOTER, EOL);
    r = r && interpolatedCharListBody(b, l + 1);
    r = r && consumeToken(b, CHAR_LIST_HEREDOC_TERMINATOR);
    exit_section_(b, m, CHAR_LIST_HEREDOC, r);
    return r;
  }

  /* ********************************************************** */
  // emptyParentheses
  static boolean containerExpression(PsiBuilder b, int l) {
    return emptyParentheses(b, l + 1);
  }

  /* ********************************************************** */
  // decimalWholeNumber DECIMAL_MARK decimalWholeNumber (EXPONENT_MARK DUAL_OPERATOR? decimalWholeNumber)?
  public static boolean decimalFloat(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decimalFloat")) return false;
    if (!nextTokenIs(b, VALID_DECIMAL_DIGITS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = decimalWholeNumber(b, l + 1);
    r = r && consumeToken(b, DECIMAL_MARK);
    r = r && decimalWholeNumber(b, l + 1);
    r = r && decimalFloat_3(b, l + 1);
    exit_section_(b, m, DECIMAL_FLOAT, r);
    return r;
  }

  // (EXPONENT_MARK DUAL_OPERATOR? decimalWholeNumber)?
  private static boolean decimalFloat_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decimalFloat_3")) return false;
    decimalFloat_3_0(b, l + 1);
    return true;
  }

  // EXPONENT_MARK DUAL_OPERATOR? decimalWholeNumber
  private static boolean decimalFloat_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decimalFloat_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EXPONENT_MARK);
    r = r && decimalFloat_3_0_1(b, l + 1);
    r = r && decimalWholeNumber(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // DUAL_OPERATOR?
  private static boolean decimalFloat_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decimalFloat_3_0_1")) return false;
    consumeToken(b, DUAL_OPERATOR);
    return true;
  }

  /* ********************************************************** */
  // decimalFloat |
  //                   decimalWholeNumber
  public static boolean decimalNumber(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decimalNumber")) return false;
    if (!nextTokenIs(b, VALID_DECIMAL_DIGITS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, null);
    r = decimalFloat(b, l + 1);
    if (!r) r = decimalWholeNumber(b, l + 1);
    exit_section_(b, l, m, DECIMAL_NUMBER, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // {VALID_DECIMAL_DIGITS} ({DECIMAL_SEPARATOR}? (INVALID_DECIMAL_DIGITS | VALID_DECIMAL_DIGITS))*
  public static boolean decimalWholeNumber(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decimalWholeNumber")) return false;
    if (!nextTokenIs(b, VALID_DECIMAL_DIGITS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VALID_DECIMAL_DIGITS);
    r = r && decimalWholeNumber_1(b, l + 1);
    exit_section_(b, m, DECIMAL_WHOLE_NUMBER, r);
    return r;
  }

  // ({DECIMAL_SEPARATOR}? (INVALID_DECIMAL_DIGITS | VALID_DECIMAL_DIGITS))*
  private static boolean decimalWholeNumber_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decimalWholeNumber_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!decimalWholeNumber_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "decimalWholeNumber_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // {DECIMAL_SEPARATOR}? (INVALID_DECIMAL_DIGITS | VALID_DECIMAL_DIGITS)
  private static boolean decimalWholeNumber_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decimalWholeNumber_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = decimalWholeNumber_1_0_0(b, l + 1);
    r = r && decimalWholeNumber_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // {DECIMAL_SEPARATOR}?
  private static boolean decimalWholeNumber_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decimalWholeNumber_1_0_0")) return false;
    consumeToken(b, DECIMAL_SEPARATOR);
    return true;
  }

  // INVALID_DECIMAL_DIGITS | VALID_DECIMAL_DIGITS
  private static boolean decimalWholeNumber_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decimalWholeNumber_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INVALID_DECIMAL_DIGITS);
    if (!r) r = consumeToken(b, VALID_DECIMAL_DIGITS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // endOfExpression* (expressionList endOfExpression*)?
  static boolean elixirFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elixirFile")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = elixirFile_0(b, l + 1);
    r = r && elixirFile_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // endOfExpression*
  private static boolean elixirFile_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elixirFile_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!endOfExpression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "elixirFile_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (expressionList endOfExpression*)?
  private static boolean elixirFile_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elixirFile_1")) return false;
    elixirFile_1_0(b, l + 1);
    return true;
  }

  // expressionList endOfExpression*
  private static boolean elixirFile_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elixirFile_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expressionList(b, l + 1);
    r = r && elixirFile_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // endOfExpression*
  private static boolean elixirFile_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elixirFile_1_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!endOfExpression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "elixirFile_1_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // OPENING_PARENTHESIS EOL* CLOSING_PARENTHESIS
  public static boolean emptyParentheses(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "emptyParentheses")) return false;
    if (!nextTokenIs(b, OPENING_PARENTHESIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPENING_PARENTHESIS);
    r = r && emptyParentheses_1(b, l + 1);
    r = r && consumeToken(b, CLOSING_PARENTHESIS);
    exit_section_(b, m, EMPTY_PARENTHESES, r);
    return r;
  }

  // EOL*
  private static boolean emptyParentheses_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "emptyParentheses_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "emptyParentheses_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // EOL* SEMICOLON EOL* | EOL
  public static boolean endOfExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "endOfExpression")) return false;
    if (!nextTokenIs(b, "<end of expression>", EOL, SEMICOLON)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<end of expression>");
    r = endOfExpression_0(b, l + 1);
    if (!r) r = consumeToken(b, EOL);
    exit_section_(b, l, m, END_OF_EXPRESSION, r, false, null);
    return r;
  }

  // EOL* SEMICOLON EOL*
  private static boolean endOfExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "endOfExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = endOfExpression_0_0(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    r = r && endOfExpression_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EOL*
  private static boolean endOfExpression_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "endOfExpression_0_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "endOfExpression_0_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean endOfExpression_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "endOfExpression_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "endOfExpression_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // emptyParentheses |
  //                /* Must be before matchedExpression because noParenthesesExpression is
  //                   `matchedExpressionDotIdentifier callArgumentsNoParenthesesManyStrict` which is longer than
  //                   `matchedExpressionDotIdentifier` in matchedExpression. */
  //                noParenthesesExpression |
  //                matchedExpression
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, "<expression>");
    r = emptyParentheses(b, l + 1);
    if (!r) r = noParenthesesExpression(b, l + 1);
    if (!r) r = matchedExpression(b, l + 1, -1);
    exit_section_(b, l, m, EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // expression (endOfExpression+ expression | adjacentExpression)*
  static boolean expressionList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expressionList")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    r = r && expressionList_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (endOfExpression+ expression | adjacentExpression)*
  private static boolean expressionList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expressionList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!expressionList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expressionList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // endOfExpression+ expression | adjacentExpression
  private static boolean expressionList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expressionList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expressionList_1_0_0(b, l + 1);
    if (!r) r = adjacentExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // endOfExpression+ expression
  private static boolean expressionList_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expressionList_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expressionList_1_0_0_0(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // endOfExpression+
  private static boolean expressionList_1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expressionList_1_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = endOfExpression(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!endOfExpression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expressionList_1_0_0_0", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BASE_WHOLE_NUMBER_PREFIX (HEXADECIMAL_WHOLE_NUMBER_BASE | OBSOLETE_HEXADECIMAL_WHOLE_NUMBER_BASE) (INVALID_HEXADECIMAL_DIGITS | VALID_HEXADECIMAL_DIGITS)+
  public static boolean hexadecimalWholeNumber(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "hexadecimalWholeNumber")) return false;
    if (!nextTokenIs(b, BASE_WHOLE_NUMBER_PREFIX)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, BASE_WHOLE_NUMBER_PREFIX);
    r = r && hexadecimalWholeNumber_1(b, l + 1);
    p = r; // pin = 2
    r = r && hexadecimalWholeNumber_2(b, l + 1);
    exit_section_(b, l, m, HEXADECIMAL_WHOLE_NUMBER, r, p, null);
    return r || p;
  }

  // HEXADECIMAL_WHOLE_NUMBER_BASE | OBSOLETE_HEXADECIMAL_WHOLE_NUMBER_BASE
  private static boolean hexadecimalWholeNumber_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "hexadecimalWholeNumber_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, HEXADECIMAL_WHOLE_NUMBER_BASE);
    if (!r) r = consumeToken(b, OBSOLETE_HEXADECIMAL_WHOLE_NUMBER_BASE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (INVALID_HEXADECIMAL_DIGITS | VALID_HEXADECIMAL_DIGITS)+
  private static boolean hexadecimalWholeNumber_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "hexadecimalWholeNumber_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = hexadecimalWholeNumber_2_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!hexadecimalWholeNumber_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "hexadecimalWholeNumber_2", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // INVALID_HEXADECIMAL_DIGITS | VALID_HEXADECIMAL_DIGITS
  private static boolean hexadecimalWholeNumber_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "hexadecimalWholeNumber_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INVALID_HEXADECIMAL_DIGITS);
    if (!r) r = consumeToken(b, VALID_HEXADECIMAL_DIGITS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (interpolation | CHAR_LIST_FRAGMENT | VALID_ESCAPE_SEQUENCE)*
  static boolean interpolatedCharListBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedCharListBody")) return false;
    int c = current_position_(b);
    while (true) {
      if (!interpolatedCharListBody_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "interpolatedCharListBody", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // interpolation | CHAR_LIST_FRAGMENT | VALID_ESCAPE_SEQUENCE
  private static boolean interpolatedCharListBody_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedCharListBody_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = interpolation(b, l + 1);
    if (!r) r = consumeToken(b, CHAR_LIST_FRAGMENT);
    if (!r) r = consumeToken(b, VALID_ESCAPE_SEQUENCE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TILDE INTERPOLATING_CHAR_LIST_SIGIL_NAME CHAR_LIST_SIGIL_PROMOTER interpolatedCharListBody CHAR_LIST_SIGIL_TERMINATOR
  static boolean interpolatedCharListSigil(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedCharListSigil")) return false;
    if (!nextTokenIs(b, TILDE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TILDE, INTERPOLATING_CHAR_LIST_SIGIL_NAME, CHAR_LIST_SIGIL_PROMOTER);
    r = r && interpolatedCharListBody(b, l + 1);
    r = r && consumeToken(b, CHAR_LIST_SIGIL_TERMINATOR);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TILDE INTERPOLATING_CHAR_LIST_SIGIL_NAME CHAR_LIST_SIGIL_HEREDOC_PROMOTER EOL
  //                                              interpolatedCharListBody
  //                                              CHAR_LIST_SIGIL_HEREDOC_TERMINATOR
  static boolean interpolatedHeredocCharListSigil(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedHeredocCharListSigil")) return false;
    if (!nextTokenIs(b, TILDE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TILDE, INTERPOLATING_CHAR_LIST_SIGIL_NAME, CHAR_LIST_SIGIL_HEREDOC_PROMOTER, EOL);
    r = r && interpolatedCharListBody(b, l + 1);
    r = r && consumeToken(b, CHAR_LIST_SIGIL_HEREDOC_TERMINATOR);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TILDE INTERPOLATING_REGEX_SIGIL_NAME REGEX_HEREDOC_PROMOTER EOL
  //                                      interpolatedRegexBody
  //                                      REGEX_HEREDOC_TERMINATOR SIGIL_MODIFIER*
  static boolean interpolatedHeredocRegex(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedHeredocRegex")) return false;
    if (!nextTokenIs(b, TILDE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TILDE, INTERPOLATING_REGEX_SIGIL_NAME, REGEX_HEREDOC_PROMOTER, EOL);
    r = r && interpolatedRegexBody(b, l + 1);
    r = r && consumeToken(b, REGEX_HEREDOC_TERMINATOR);
    r = r && interpolatedHeredocRegex_6(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SIGIL_MODIFIER*
  private static boolean interpolatedHeredocRegex_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedHeredocRegex_6")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SIGIL_MODIFIER)) break;
      if (!empty_element_parsed_guard_(b, "interpolatedHeredocRegex_6", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // TILDE INTERPOLATING_SIGIL_NAME SIGIL_HEREDOC_PROMOTER EOL
  //                                      interpolatedSigilBody
  //                                      SIGIL_HEREDOC_PROMOTER SIGIL_MODIFIER*
  static boolean interpolatedHeredocSigil(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedHeredocSigil")) return false;
    if (!nextTokenIs(b, TILDE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TILDE, INTERPOLATING_SIGIL_NAME, SIGIL_HEREDOC_PROMOTER, EOL);
    r = r && interpolatedSigilBody(b, l + 1);
    r = r && consumeToken(b, SIGIL_HEREDOC_PROMOTER);
    r = r && interpolatedHeredocSigil_6(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SIGIL_MODIFIER*
  private static boolean interpolatedHeredocSigil_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedHeredocSigil_6")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SIGIL_MODIFIER)) break;
      if (!empty_element_parsed_guard_(b, "interpolatedHeredocSigil_6", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // TILDE INTERPOLATING_STRING_SIGIL_NAME STRING_SIGIL_HEREDOC_PROMOTER EOL
  //                                            interpolatedStringBody
  //                                            STRING_SIGIL_HEREDOC_TERMINATOR
  static boolean interpolatedHeredocStringSigil(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedHeredocStringSigil")) return false;
    if (!nextTokenIs(b, TILDE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TILDE, INTERPOLATING_STRING_SIGIL_NAME, STRING_SIGIL_HEREDOC_PROMOTER, EOL);
    r = r && interpolatedStringBody(b, l + 1);
    r = r && consumeToken(b, STRING_SIGIL_HEREDOC_TERMINATOR);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TILDE INTERPOLATING_WORDS_SIGIL_NAME WORDS_HEREDOC_PROMOTER EOL
  //                                      interpolatedWordsBody
  //                                      WORDS_HEREDOC_TERMINATOR SIGIL_MODIFIER*
  static boolean interpolatedHeredocWords(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedHeredocWords")) return false;
    if (!nextTokenIs(b, TILDE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TILDE, INTERPOLATING_WORDS_SIGIL_NAME, WORDS_HEREDOC_PROMOTER, EOL);
    r = r && interpolatedWordsBody(b, l + 1);
    r = r && consumeToken(b, WORDS_HEREDOC_TERMINATOR);
    r = r && interpolatedHeredocWords_6(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SIGIL_MODIFIER*
  private static boolean interpolatedHeredocWords_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedHeredocWords_6")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SIGIL_MODIFIER)) break;
      if (!empty_element_parsed_guard_(b, "interpolatedHeredocWords_6", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // TILDE INTERPOLATING_REGEX_SIGIL_NAME REGEX_PROMOTER interpolatedRegexBody REGEX_TERMINATOR SIGIL_MODIFIER*
  static boolean interpolatedRegex(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedRegex")) return false;
    if (!nextTokenIs(b, TILDE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TILDE, INTERPOLATING_REGEX_SIGIL_NAME, REGEX_PROMOTER);
    r = r && interpolatedRegexBody(b, l + 1);
    r = r && consumeToken(b, REGEX_TERMINATOR);
    r = r && interpolatedRegex_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SIGIL_MODIFIER*
  private static boolean interpolatedRegex_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedRegex_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SIGIL_MODIFIER)) break;
      if (!empty_element_parsed_guard_(b, "interpolatedRegex_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // (interpolation | REGEX_FRAGMENT | VALID_ESCAPE_SEQUENCE)*
  static boolean interpolatedRegexBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedRegexBody")) return false;
    int c = current_position_(b);
    while (true) {
      if (!interpolatedRegexBody_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "interpolatedRegexBody", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // interpolation | REGEX_FRAGMENT | VALID_ESCAPE_SEQUENCE
  private static boolean interpolatedRegexBody_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedRegexBody_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = interpolation(b, l + 1);
    if (!r) r = consumeToken(b, REGEX_FRAGMENT);
    if (!r) r = consumeToken(b, VALID_ESCAPE_SEQUENCE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TILDE INTERPOLATING_SIGIL_NAME SIGIL_PROMOTER interpolatedSigilBody SIGIL_TERMINATOR SIGIL_MODIFIER*
  static boolean interpolatedSigil(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedSigil")) return false;
    if (!nextTokenIs(b, TILDE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TILDE, INTERPOLATING_SIGIL_NAME, SIGIL_PROMOTER);
    r = r && interpolatedSigilBody(b, l + 1);
    r = r && consumeToken(b, SIGIL_TERMINATOR);
    r = r && interpolatedSigil_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SIGIL_MODIFIER*
  private static boolean interpolatedSigil_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedSigil_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SIGIL_MODIFIER)) break;
      if (!empty_element_parsed_guard_(b, "interpolatedSigil_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // (interpolation | SIGIL_FRAGMENT | VALID_ESCAPE_SEQUENCE)*
  static boolean interpolatedSigilBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedSigilBody")) return false;
    int c = current_position_(b);
    while (true) {
      if (!interpolatedSigilBody_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "interpolatedSigilBody", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // interpolation | SIGIL_FRAGMENT | VALID_ESCAPE_SEQUENCE
  private static boolean interpolatedSigilBody_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedSigilBody_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = interpolation(b, l + 1);
    if (!r) r = consumeToken(b, SIGIL_FRAGMENT);
    if (!r) r = consumeToken(b, VALID_ESCAPE_SEQUENCE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (interpolation | STRING_FRAGMENT | VALID_ESCAPE_SEQUENCE)*
  static boolean interpolatedStringBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedStringBody")) return false;
    int c = current_position_(b);
    while (true) {
      if (!interpolatedStringBody_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "interpolatedStringBody", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // interpolation | STRING_FRAGMENT | VALID_ESCAPE_SEQUENCE
  private static boolean interpolatedStringBody_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedStringBody_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = interpolation(b, l + 1);
    if (!r) r = consumeToken(b, STRING_FRAGMENT);
    if (!r) r = consumeToken(b, VALID_ESCAPE_SEQUENCE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TILDE INTERPOLATING_STRING_SIGIL_NAME STRING_SIGIL_PROMOTER interpolatedStringBody STRING_SIGIL_TERMINATOR
  static boolean interpolatedStringSigil(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedStringSigil")) return false;
    if (!nextTokenIs(b, TILDE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TILDE, INTERPOLATING_STRING_SIGIL_NAME, STRING_SIGIL_PROMOTER);
    r = r && interpolatedStringBody(b, l + 1);
    r = r && consumeToken(b, STRING_SIGIL_TERMINATOR);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (interpolation | WORDS_FRAGMENT | VALID_ESCAPE_SEQUENCE)*
  static boolean interpolatedWordsBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedWordsBody")) return false;
    int c = current_position_(b);
    while (true) {
      if (!interpolatedWordsBody_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "interpolatedWordsBody", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // interpolation | WORDS_FRAGMENT | VALID_ESCAPE_SEQUENCE
  private static boolean interpolatedWordsBody_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedWordsBody_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = interpolation(b, l + 1);
    if (!r) r = consumeToken(b, WORDS_FRAGMENT);
    if (!r) r = consumeToken(b, VALID_ESCAPE_SEQUENCE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // INTERPOLATION_START expressionList? INTERPOLATION_END
  public static boolean interpolation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolation")) return false;
    if (!nextTokenIs(b, INTERPOLATION_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTERPOLATION_START);
    r = r && interpolation_1(b, l + 1);
    r = r && consumeToken(b, INTERPOLATION_END);
    exit_section_(b, m, INTERPOLATION, r);
    return r;
  }

  // expressionList?
  private static boolean interpolation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolation_1")) return false;
    expressionList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ALIAS |
  //                AND_OPERATOR |
  //                ARROW_OPERATOR |
  //                ASSOCIATION_OPERATOR |
  //                AT_OPERATOR |
  //                BIT_STRING_OPERATOR |
  //                CAPTURE_OPERATOR |
  //                COMPARISON_OPERATOR |
  //                DUAL_OPERATOR |
  //                HAT_OPERATOR |
  //                IDENTIFIER |
  //                IN_MATCH_OPERATOR |
  //                IN_OPERATOR |
  //                MAP_OPERATOR |
  //                MATCH_OPERATOR |
  //                MULTIPLICATION_OPERATOR |
  //                OR_OPERATOR |
  //                PIPE_OPERATOR |
  //                RELATIONAL_OPERATOR |
  //                STAB_OPERATOR |
  //                STRUCT_OPERATOR |
  //                TUPLE_OPERATOR |
  //                TWO_OPERATOR |
  //                UNARY_OPERATOR |
  //                WHEN_OPERATOR |
  //                quote
  public static boolean keywordKey(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "keywordKey")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<keyword key>");
    r = consumeToken(b, ALIAS);
    if (!r) r = consumeToken(b, AND_OPERATOR);
    if (!r) r = consumeToken(b, ARROW_OPERATOR);
    if (!r) r = consumeToken(b, ASSOCIATION_OPERATOR);
    if (!r) r = consumeToken(b, AT_OPERATOR);
    if (!r) r = consumeToken(b, BIT_STRING_OPERATOR);
    if (!r) r = consumeToken(b, CAPTURE_OPERATOR);
    if (!r) r = consumeToken(b, COMPARISON_OPERATOR);
    if (!r) r = consumeToken(b, DUAL_OPERATOR);
    if (!r) r = consumeToken(b, HAT_OPERATOR);
    if (!r) r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, IN_MATCH_OPERATOR);
    if (!r) r = consumeToken(b, IN_OPERATOR);
    if (!r) r = consumeToken(b, MAP_OPERATOR);
    if (!r) r = consumeToken(b, MATCH_OPERATOR);
    if (!r) r = consumeToken(b, MULTIPLICATION_OPERATOR);
    if (!r) r = consumeToken(b, OR_OPERATOR);
    if (!r) r = consumeToken(b, PIPE_OPERATOR);
    if (!r) r = consumeToken(b, RELATIONAL_OPERATOR);
    if (!r) r = consumeToken(b, STAB_OPERATOR);
    if (!r) r = consumeToken(b, STRUCT_OPERATOR);
    if (!r) r = consumeToken(b, TUPLE_OPERATOR);
    if (!r) r = consumeToken(b, TWO_OPERATOR);
    if (!r) r = consumeToken(b, UNARY_OPERATOR);
    if (!r) r = consumeToken(b, WHEN_OPERATOR);
    if (!r) r = quote(b, l + 1);
    exit_section_(b, l, m, KEYWORD_KEY, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // keywordKey KEYWORD_PAIR_COLON EOL*
  static boolean keywordKeyColonEOL(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "keywordKeyColonEOL")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = keywordKey(b, l + 1);
    r = r && consumeToken(b, KEYWORD_PAIR_COLON);
    r = r && keywordKeyColonEOL_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EOL*
  private static boolean keywordKeyColonEOL_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "keywordKeyColonEOL_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "keywordKeyColonEOL_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // keywordKeyColonEOL keywordValue
  public static boolean keywordPair(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "keywordPair")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<keyword pair>");
    r = keywordKeyColonEOL(b, l + 1);
    r = r && keywordValue(b, l + 1);
    exit_section_(b, l, m, KEYWORD_PAIR, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // containerExpression
  public static boolean keywordValue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "keywordValue")) return false;
    if (!nextTokenIs(b, OPENING_PARENTHESIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = containerExpression(b, l + 1);
    exit_section_(b, m, KEYWORD_VALUE, r);
    return r;
  }

  /* ********************************************************** */
  // OPENING_BRACKET EOL* (keywordPair (COMMA EOL* keywordPair)* COMMA?)? CLOSING_BRACKET
  public static boolean list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list")) return false;
    if (!nextTokenIs(b, OPENING_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPENING_BRACKET);
    r = r && list_1(b, l + 1);
    r = r && list_2(b, l + 1);
    r = r && consumeToken(b, CLOSING_BRACKET);
    exit_section_(b, m, LIST, r);
    return r;
  }

  // EOL*
  private static boolean list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "list_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (keywordPair (COMMA EOL* keywordPair)* COMMA?)?
  private static boolean list_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_2")) return false;
    list_2_0(b, l + 1);
    return true;
  }

  // keywordPair (COMMA EOL* keywordPair)* COMMA?
  private static boolean list_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = keywordPair(b, l + 1);
    r = r && list_2_0_1(b, l + 1);
    r = r && list_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA EOL* keywordPair)*
  private static boolean list_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_2_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!list_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "list_2_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA EOL* keywordPair
  private static boolean list_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && list_2_0_1_0_1(b, l + 1);
    r = r && keywordPair(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EOL*
  private static boolean list_2_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_2_0_1_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "list_2_0_1_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA?
  private static boolean list_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_2_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // charList | charListHeredoc
  static boolean listString(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "listString")) return false;
    if (!nextTokenIs(b, "", CHAR_LIST_HEREDOC_PROMOTER, CHAR_LIST_PROMOTER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = charList(b, l + 1);
    if (!r) r = charListHeredoc(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CHAR_LIST_FRAGMENT*
  static boolean literalCharListBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalCharListBody")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, CHAR_LIST_FRAGMENT)) break;
      if (!empty_element_parsed_guard_(b, "literalCharListBody", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // TILDE LITERAL_CHAR_LIST_SIGIL_NAME CHAR_LIST_SIGIL_PROMOTER literalCharListBody CHAR_LIST_SIGIL_TERMINATOR
  static boolean literalCharListSigil(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalCharListSigil")) return false;
    if (!nextTokenIs(b, TILDE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TILDE, LITERAL_CHAR_LIST_SIGIL_NAME, CHAR_LIST_SIGIL_PROMOTER);
    r = r && literalCharListBody(b, l + 1);
    r = r && consumeToken(b, CHAR_LIST_SIGIL_TERMINATOR);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TILDE LITERAL_REGEX_SIGIL_NAME REGEX_HEREDOC_PROMOTER EOL
  //                                 literalRegexBody
  //                                 REGEX_HEREDOC_TERMINATOR SIGIL_MODIFIER*
  static boolean literalHeredocRegex(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalHeredocRegex")) return false;
    if (!nextTokenIs(b, TILDE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TILDE, LITERAL_REGEX_SIGIL_NAME, REGEX_HEREDOC_PROMOTER, EOL);
    r = r && literalRegexBody(b, l + 1);
    r = r && consumeToken(b, REGEX_HEREDOC_TERMINATOR);
    r = r && literalHeredocRegex_6(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SIGIL_MODIFIER*
  private static boolean literalHeredocRegex_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalHeredocRegex_6")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SIGIL_MODIFIER)) break;
      if (!empty_element_parsed_guard_(b, "literalHeredocRegex_6", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // TILDE LITERAL_SIGIL_NAME SIGIL_HEREDOC_PROMOTER EOL
  //                                 literalSigilBody
  //                                 SIGIL_HEREDOC_TERMINATOR SIGIL_MODIFIER*
  static boolean literalHeredocSigil(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalHeredocSigil")) return false;
    if (!nextTokenIs(b, TILDE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TILDE, LITERAL_SIGIL_NAME, SIGIL_HEREDOC_PROMOTER, EOL);
    r = r && literalSigilBody(b, l + 1);
    r = r && consumeToken(b, SIGIL_HEREDOC_TERMINATOR);
    r = r && literalHeredocSigil_6(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SIGIL_MODIFIER*
  private static boolean literalHeredocSigil_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalHeredocSigil_6")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SIGIL_MODIFIER)) break;
      if (!empty_element_parsed_guard_(b, "literalHeredocSigil_6", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // TILDE LITERAL_STRING_SIGIL_NAME STRING_SIGIL_HEREDOC_PROMOTER EOL
  //                                       literalStringBody
  //                                       STRING_SIGIL_HEREDOC_TERMINATOR
  static boolean literalHeredocStringSigil(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalHeredocStringSigil")) return false;
    if (!nextTokenIs(b, TILDE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TILDE, LITERAL_STRING_SIGIL_NAME, STRING_SIGIL_HEREDOC_PROMOTER, EOL);
    r = r && literalStringBody(b, l + 1);
    r = r && consumeToken(b, STRING_SIGIL_HEREDOC_TERMINATOR);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TILDE LITERAL_WORDS_SIGIL_NAME WORDS_HEREDOC_PROMOTER EOL
  //                                 literalWordsBody
  //                                 WORDS_HEREDOC_TERMINATOR SIGIL_MODIFIER*
  static boolean literalHeredocWords(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalHeredocWords")) return false;
    if (!nextTokenIs(b, TILDE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TILDE, LITERAL_WORDS_SIGIL_NAME, WORDS_HEREDOC_PROMOTER, EOL);
    r = r && literalWordsBody(b, l + 1);
    r = r && consumeToken(b, WORDS_HEREDOC_TERMINATOR);
    r = r && literalHeredocWords_6(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SIGIL_MODIFIER*
  private static boolean literalHeredocWords_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalHeredocWords_6")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SIGIL_MODIFIER)) break;
      if (!empty_element_parsed_guard_(b, "literalHeredocWords_6", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // TILDE LITERAL_SIGIL_NAME REGEX_PROMOTER literalRegexBody REGEX_TERMINATOR SIGIL_MODIFIER*
  static boolean literalRegex(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalRegex")) return false;
    if (!nextTokenIs(b, TILDE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TILDE, LITERAL_SIGIL_NAME, REGEX_PROMOTER);
    r = r && literalRegexBody(b, l + 1);
    r = r && consumeToken(b, REGEX_TERMINATOR);
    r = r && literalRegex_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SIGIL_MODIFIER*
  private static boolean literalRegex_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalRegex_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SIGIL_MODIFIER)) break;
      if (!empty_element_parsed_guard_(b, "literalRegex_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // REGEX_FRAGMENT*
  static boolean literalRegexBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalRegexBody")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, REGEX_FRAGMENT)) break;
      if (!empty_element_parsed_guard_(b, "literalRegexBody", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // TILDE LITERAL_SIGIL_NAME SIGIL_PROMOTER literalSigilBody SIGIL_TERMINATOR SIGIL_MODIFIER*
  static boolean literalSigil(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalSigil")) return false;
    if (!nextTokenIs(b, TILDE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TILDE, LITERAL_SIGIL_NAME, SIGIL_PROMOTER);
    r = r && literalSigilBody(b, l + 1);
    r = r && consumeToken(b, SIGIL_TERMINATOR);
    r = r && literalSigil_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SIGIL_MODIFIER*
  private static boolean literalSigil_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalSigil_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SIGIL_MODIFIER)) break;
      if (!empty_element_parsed_guard_(b, "literalSigil_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // SIGIL_FRAGMENT*
  static boolean literalSigilBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalSigilBody")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SIGIL_FRAGMENT)) break;
      if (!empty_element_parsed_guard_(b, "literalSigilBody", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // STRING_FRAGMENT*
  static boolean literalStringBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalStringBody")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, STRING_FRAGMENT)) break;
      if (!empty_element_parsed_guard_(b, "literalStringBody", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // TILDE LITERAL_STRING_SIGIL_NAME STRING_SIGIL_PROMOTER literalStringBody STRING_SIGIL_TERMINATOR
  static boolean literalStringSigil(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalStringSigil")) return false;
    if (!nextTokenIs(b, TILDE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TILDE, LITERAL_STRING_SIGIL_NAME, STRING_SIGIL_PROMOTER);
    r = r && literalStringBody(b, l + 1);
    r = r && consumeToken(b, STRING_SIGIL_TERMINATOR);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TILDE LITERAL_SIGIL_NAME WORDS_PROMOTER literal WORDS_TERMINATOR SIGIL_MODIFIER*
  static boolean literalWords(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalWords")) return false;
    if (!nextTokenIs(b, TILDE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TILDE, LITERAL_SIGIL_NAME, WORDS_PROMOTER, LITERAL, WORDS_TERMINATOR);
    r = r && literalWords_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SIGIL_MODIFIER*
  private static boolean literalWords_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalWords_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SIGIL_MODIFIER)) break;
      if (!empty_element_parsed_guard_(b, "literalWords_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // WORDS_FRAGMENT*
  static boolean literalWordsBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalWordsBody")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, WORDS_FRAGMENT)) break;
      if (!empty_element_parsed_guard_(b, "literalWordsBody", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // matchedExpression EOL* DUAL_OPERATOR EOL* noParenthesesExpression
  public static boolean matchedExpressionAdditionNoParenthesesExpressionOperation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionAdditionNoParenthesesExpressionOperation")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<matched expression addition no parentheses expression operation>");
    r = matchedExpression(b, l + 1, -1);
    r = r && matchedExpressionAdditionNoParenthesesExpressionOperation_1(b, l + 1);
    r = r && consumeToken(b, DUAL_OPERATOR);
    r = r && matchedExpressionAdditionNoParenthesesExpressionOperation_3(b, l + 1);
    r = r && noParenthesesExpression(b, l + 1);
    exit_section_(b, l, m, MATCHED_EXPRESSION_ADDITION_NO_PARENTHESES_EXPRESSION_OPERATION, r, false, null);
    return r;
  }

  // EOL*
  private static boolean matchedExpressionAdditionNoParenthesesExpressionOperation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionAdditionNoParenthesesExpressionOperation_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionAdditionNoParenthesesExpressionOperation_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean matchedExpressionAdditionNoParenthesesExpressionOperation_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionAdditionNoParenthesesExpressionOperation_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionAdditionNoParenthesesExpressionOperation_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // matchedExpression EOL* AND_OPERATOR EOL* noParenthesesExpression
  public static boolean matchedExpressionAndNoParenthesesExpressionOperation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionAndNoParenthesesExpressionOperation")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<matched expression and no parentheses expression operation>");
    r = matchedExpression(b, l + 1, -1);
    r = r && matchedExpressionAndNoParenthesesExpressionOperation_1(b, l + 1);
    r = r && consumeToken(b, AND_OPERATOR);
    r = r && matchedExpressionAndNoParenthesesExpressionOperation_3(b, l + 1);
    r = r && noParenthesesExpression(b, l + 1);
    exit_section_(b, l, m, MATCHED_EXPRESSION_AND_NO_PARENTHESES_EXPRESSION_OPERATION, r, false, null);
    return r;
  }

  // EOL*
  private static boolean matchedExpressionAndNoParenthesesExpressionOperation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionAndNoParenthesesExpressionOperation_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionAndNoParenthesesExpressionOperation_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean matchedExpressionAndNoParenthesesExpressionOperation_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionAndNoParenthesesExpressionOperation_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionAndNoParenthesesExpressionOperation_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // matchedExpression EOL* ARROW_OPERATOR EOL* noParenthesesExpression
  public static boolean matchedExpressionArrowNoParenthesesExpressionOperation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionArrowNoParenthesesExpressionOperation")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<matched expression arrow no parentheses expression operation>");
    r = matchedExpression(b, l + 1, -1);
    r = r && matchedExpressionArrowNoParenthesesExpressionOperation_1(b, l + 1);
    r = r && consumeToken(b, ARROW_OPERATOR);
    r = r && matchedExpressionArrowNoParenthesesExpressionOperation_3(b, l + 1);
    r = r && noParenthesesExpression(b, l + 1);
    exit_section_(b, l, m, MATCHED_EXPRESSION_ARROW_NO_PARENTHESES_EXPRESSION_OPERATION, r, false, null);
    return r;
  }

  // EOL*
  private static boolean matchedExpressionArrowNoParenthesesExpressionOperation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionArrowNoParenthesesExpressionOperation_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionArrowNoParenthesesExpressionOperation_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean matchedExpressionArrowNoParenthesesExpressionOperation_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionArrowNoParenthesesExpressionOperation_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionArrowNoParenthesesExpressionOperation_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // matchedExpression EOL* COMPARISON_OPERATOR EOL* noParenthesesExpression
  public static boolean matchedExpressionComparisonNoParenthesesExpressionOperation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionComparisonNoParenthesesExpressionOperation")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<matched expression comparison no parentheses expression operation>");
    r = matchedExpression(b, l + 1, -1);
    r = r && matchedExpressionComparisonNoParenthesesExpressionOperation_1(b, l + 1);
    r = r && consumeToken(b, COMPARISON_OPERATOR);
    r = r && matchedExpressionComparisonNoParenthesesExpressionOperation_3(b, l + 1);
    r = r && noParenthesesExpression(b, l + 1);
    exit_section_(b, l, m, MATCHED_EXPRESSION_COMPARISON_NO_PARENTHESES_EXPRESSION_OPERATION, r, false, null);
    return r;
  }

  // EOL*
  private static boolean matchedExpressionComparisonNoParenthesesExpressionOperation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionComparisonNoParenthesesExpressionOperation_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionComparisonNoParenthesesExpressionOperation_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean matchedExpressionComparisonNoParenthesesExpressionOperation_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionComparisonNoParenthesesExpressionOperation_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionComparisonNoParenthesesExpressionOperation_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // matchedExpression EOL* HAT_OPERATOR EOL* noParenthesesExpression
  public static boolean matchedExpressionHatNoParenthesesExpressionOperation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionHatNoParenthesesExpressionOperation")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<matched expression hat no parentheses expression operation>");
    r = matchedExpression(b, l + 1, -1);
    r = r && matchedExpressionHatNoParenthesesExpressionOperation_1(b, l + 1);
    r = r && consumeToken(b, HAT_OPERATOR);
    r = r && matchedExpressionHatNoParenthesesExpressionOperation_3(b, l + 1);
    r = r && noParenthesesExpression(b, l + 1);
    exit_section_(b, l, m, MATCHED_EXPRESSION_HAT_NO_PARENTHESES_EXPRESSION_OPERATION, r, false, null);
    return r;
  }

  // EOL*
  private static boolean matchedExpressionHatNoParenthesesExpressionOperation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionHatNoParenthesesExpressionOperation_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionHatNoParenthesesExpressionOperation_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean matchedExpressionHatNoParenthesesExpressionOperation_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionHatNoParenthesesExpressionOperation_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionHatNoParenthesesExpressionOperation_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // matchedExpression EOL* IN_MATCH_OPERATOR EOL* noParenthesesExpression
  public static boolean matchedExpressionInMatchNoParenthesesExpressionOperation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionInMatchNoParenthesesExpressionOperation")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<matched expression in match no parentheses expression operation>");
    r = matchedExpression(b, l + 1, -1);
    r = r && matchedExpressionInMatchNoParenthesesExpressionOperation_1(b, l + 1);
    r = r && consumeToken(b, IN_MATCH_OPERATOR);
    r = r && matchedExpressionInMatchNoParenthesesExpressionOperation_3(b, l + 1);
    r = r && noParenthesesExpression(b, l + 1);
    exit_section_(b, l, m, MATCHED_EXPRESSION_IN_MATCH_NO_PARENTHESES_EXPRESSION_OPERATION, r, false, null);
    return r;
  }

  // EOL*
  private static boolean matchedExpressionInMatchNoParenthesesExpressionOperation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionInMatchNoParenthesesExpressionOperation_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionInMatchNoParenthesesExpressionOperation_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean matchedExpressionInMatchNoParenthesesExpressionOperation_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionInMatchNoParenthesesExpressionOperation_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionInMatchNoParenthesesExpressionOperation_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // matchedExpression EOL* IN_OPERATOR EOL* noParenthesesExpression
  public static boolean matchedExpressionInNoParenthesesExpressionOperation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionInNoParenthesesExpressionOperation")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<matched expression in no parentheses expression operation>");
    r = matchedExpression(b, l + 1, -1);
    r = r && matchedExpressionInNoParenthesesExpressionOperation_1(b, l + 1);
    r = r && consumeToken(b, IN_OPERATOR);
    r = r && matchedExpressionInNoParenthesesExpressionOperation_3(b, l + 1);
    r = r && noParenthesesExpression(b, l + 1);
    exit_section_(b, l, m, MATCHED_EXPRESSION_IN_NO_PARENTHESES_EXPRESSION_OPERATION, r, false, null);
    return r;
  }

  // EOL*
  private static boolean matchedExpressionInNoParenthesesExpressionOperation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionInNoParenthesesExpressionOperation_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionInNoParenthesesExpressionOperation_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean matchedExpressionInNoParenthesesExpressionOperation_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionInNoParenthesesExpressionOperation_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionInNoParenthesesExpressionOperation_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // matchedExpression EOL* MATCH_OPERATOR EOL* noParenthesesExpression
  public static boolean matchedExpressionMatchNoParenthesesExpressionOperation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionMatchNoParenthesesExpressionOperation")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<matched expression match no parentheses expression operation>");
    r = matchedExpression(b, l + 1, -1);
    r = r && matchedExpressionMatchNoParenthesesExpressionOperation_1(b, l + 1);
    r = r && consumeToken(b, MATCH_OPERATOR);
    r = r && matchedExpressionMatchNoParenthesesExpressionOperation_3(b, l + 1);
    r = r && noParenthesesExpression(b, l + 1);
    exit_section_(b, l, m, MATCHED_EXPRESSION_MATCH_NO_PARENTHESES_EXPRESSION_OPERATION, r, false, null);
    return r;
  }

  // EOL*
  private static boolean matchedExpressionMatchNoParenthesesExpressionOperation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionMatchNoParenthesesExpressionOperation_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionMatchNoParenthesesExpressionOperation_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean matchedExpressionMatchNoParenthesesExpressionOperation_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionMatchNoParenthesesExpressionOperation_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionMatchNoParenthesesExpressionOperation_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // atom |
  //                                    ALIAS
  public static boolean matchedExpressionMaxExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionMaxExpression")) return false;
    if (!nextTokenIs(b, "<matched expression max expression>", ALIAS, COLON)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, "<matched expression max expression>");
    r = atom(b, l + 1);
    if (!r) r = consumeToken(b, ALIAS);
    exit_section_(b, l, m, MATCHED_EXPRESSION_MAX_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // matchedExpression EOL* MULTIPLICATION_OPERATOR EOL* noParenthesesExpression
  public static boolean matchedExpressionMultiplicationNoParenthesesExpressionOperation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionMultiplicationNoParenthesesExpressionOperation")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<matched expression multiplication no parentheses expression operation>");
    r = matchedExpression(b, l + 1, -1);
    r = r && matchedExpressionMultiplicationNoParenthesesExpressionOperation_1(b, l + 1);
    r = r && consumeToken(b, MULTIPLICATION_OPERATOR);
    r = r && matchedExpressionMultiplicationNoParenthesesExpressionOperation_3(b, l + 1);
    r = r && noParenthesesExpression(b, l + 1);
    exit_section_(b, l, m, MATCHED_EXPRESSION_MULTIPLICATION_NO_PARENTHESES_EXPRESSION_OPERATION, r, false, null);
    return r;
  }

  // EOL*
  private static boolean matchedExpressionMultiplicationNoParenthesesExpressionOperation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionMultiplicationNoParenthesesExpressionOperation_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionMultiplicationNoParenthesesExpressionOperation_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean matchedExpressionMultiplicationNoParenthesesExpressionOperation_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionMultiplicationNoParenthesesExpressionOperation_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionMultiplicationNoParenthesesExpressionOperation_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // matchedExpression EOL* OR_OPERATOR EOL* noParenthesesExpression
  public static boolean matchedExpressionOrNoParenthesesExpressionOperation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionOrNoParenthesesExpressionOperation")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<matched expression or no parentheses expression operation>");
    r = matchedExpression(b, l + 1, -1);
    r = r && matchedExpressionOrNoParenthesesExpressionOperation_1(b, l + 1);
    r = r && consumeToken(b, OR_OPERATOR);
    r = r && matchedExpressionOrNoParenthesesExpressionOperation_3(b, l + 1);
    r = r && noParenthesesExpression(b, l + 1);
    exit_section_(b, l, m, MATCHED_EXPRESSION_OR_NO_PARENTHESES_EXPRESSION_OPERATION, r, false, null);
    return r;
  }

  // EOL*
  private static boolean matchedExpressionOrNoParenthesesExpressionOperation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionOrNoParenthesesExpressionOperation_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionOrNoParenthesesExpressionOperation_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean matchedExpressionOrNoParenthesesExpressionOperation_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionOrNoParenthesesExpressionOperation_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionOrNoParenthesesExpressionOperation_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // matchedExpression EOL* PIPE_OPERATOR EOL* noParenthesesExpression
  public static boolean matchedExpressionPipeNoParenthesesExpressionOperation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionPipeNoParenthesesExpressionOperation")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<matched expression pipe no parentheses expression operation>");
    r = matchedExpression(b, l + 1, -1);
    r = r && matchedExpressionPipeNoParenthesesExpressionOperation_1(b, l + 1);
    r = r && consumeToken(b, PIPE_OPERATOR);
    r = r && matchedExpressionPipeNoParenthesesExpressionOperation_3(b, l + 1);
    r = r && noParenthesesExpression(b, l + 1);
    exit_section_(b, l, m, MATCHED_EXPRESSION_PIPE_NO_PARENTHESES_EXPRESSION_OPERATION, r, false, null);
    return r;
  }

  // EOL*
  private static boolean matchedExpressionPipeNoParenthesesExpressionOperation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionPipeNoParenthesesExpressionOperation_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionPipeNoParenthesesExpressionOperation_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean matchedExpressionPipeNoParenthesesExpressionOperation_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionPipeNoParenthesesExpressionOperation_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionPipeNoParenthesesExpressionOperation_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // matchedExpression EOL* RELATIONAL_OPERATOR EOL* noParenthesesExpression
  public static boolean matchedExpressionRelationalNoParenthesesExpressionOperation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionRelationalNoParenthesesExpressionOperation")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<matched expression relational no parentheses expression operation>");
    r = matchedExpression(b, l + 1, -1);
    r = r && matchedExpressionRelationalNoParenthesesExpressionOperation_1(b, l + 1);
    r = r && consumeToken(b, RELATIONAL_OPERATOR);
    r = r && matchedExpressionRelationalNoParenthesesExpressionOperation_3(b, l + 1);
    r = r && noParenthesesExpression(b, l + 1);
    exit_section_(b, l, m, MATCHED_EXPRESSION_RELATIONAL_NO_PARENTHESES_EXPRESSION_OPERATION, r, false, null);
    return r;
  }

  // EOL*
  private static boolean matchedExpressionRelationalNoParenthesesExpressionOperation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionRelationalNoParenthesesExpressionOperation_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionRelationalNoParenthesesExpressionOperation_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean matchedExpressionRelationalNoParenthesesExpressionOperation_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionRelationalNoParenthesesExpressionOperation_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionRelationalNoParenthesesExpressionOperation_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // matchedExpression EOL* TWO_OPERATOR EOL* noParenthesesExpression
  public static boolean matchedExpressionTwoNoParenthesesExpressionOperation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionTwoNoParenthesesExpressionOperation")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<matched expression two no parentheses expression operation>");
    r = matchedExpression(b, l + 1, -1);
    r = r && matchedExpressionTwoNoParenthesesExpressionOperation_1(b, l + 1);
    r = r && consumeToken(b, TWO_OPERATOR);
    r = r && matchedExpressionTwoNoParenthesesExpressionOperation_3(b, l + 1);
    r = r && noParenthesesExpression(b, l + 1);
    exit_section_(b, l, m, MATCHED_EXPRESSION_TWO_NO_PARENTHESES_EXPRESSION_OPERATION, r, false, null);
    return r;
  }

  // EOL*
  private static boolean matchedExpressionTwoNoParenthesesExpressionOperation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionTwoNoParenthesesExpressionOperation_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionTwoNoParenthesesExpressionOperation_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean matchedExpressionTwoNoParenthesesExpressionOperation_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionTwoNoParenthesesExpressionOperation_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionTwoNoParenthesesExpressionOperation_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // matchedExpression EOL* TYPE_OPERATOR EOL* noParenthesesExpression
  public static boolean matchedExpressionTypeNoParenthesesExpressionOperation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionTypeNoParenthesesExpressionOperation")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<matched expression type no parentheses expression operation>");
    r = matchedExpression(b, l + 1, -1);
    r = r && matchedExpressionTypeNoParenthesesExpressionOperation_1(b, l + 1);
    r = r && consumeToken(b, TYPE_OPERATOR);
    r = r && matchedExpressionTypeNoParenthesesExpressionOperation_3(b, l + 1);
    r = r && noParenthesesExpression(b, l + 1);
    exit_section_(b, l, m, MATCHED_EXPRESSION_TYPE_NO_PARENTHESES_EXPRESSION_OPERATION, r, false, null);
    return r;
  }

  // EOL*
  private static boolean matchedExpressionTypeNoParenthesesExpressionOperation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionTypeNoParenthesesExpressionOperation_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionTypeNoParenthesesExpressionOperation_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean matchedExpressionTypeNoParenthesesExpressionOperation_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionTypeNoParenthesesExpressionOperation_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionTypeNoParenthesesExpressionOperation_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // matchedExpression EOL* WHEN_OPERATOR EOL* noParenthesesExpression
  public static boolean matchedExpressionWhenNoParenthesesExpressionOperation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionWhenNoParenthesesExpressionOperation")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<matched expression when no parentheses expression operation>");
    r = matchedExpression(b, l + 1, -1);
    r = r && matchedExpressionWhenNoParenthesesExpressionOperation_1(b, l + 1);
    r = r && consumeToken(b, WHEN_OPERATOR);
    r = r && matchedExpressionWhenNoParenthesesExpressionOperation_3(b, l + 1);
    r = r && noParenthesesExpression(b, l + 1);
    exit_section_(b, l, m, MATCHED_EXPRESSION_WHEN_NO_PARENTHESES_EXPRESSION_OPERATION, r, false, null);
    return r;
  }

  // EOL*
  private static boolean matchedExpressionWhenNoParenthesesExpressionOperation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionWhenNoParenthesesExpressionOperation_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionWhenNoParenthesesExpressionOperation_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean matchedExpressionWhenNoParenthesesExpressionOperation_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionWhenNoParenthesesExpressionOperation_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionWhenNoParenthesesExpressionOperation_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // captureNoParenthesesExpressionOperation |
  //                             matchedExpressionInMatchNoParenthesesExpressionOperation |
  //                             matchedExpressionWhenNoParenthesesExpressionOperation |
  //                             matchedExpressionTypeNoParenthesesExpressionOperation |
  //                             matchedExpressionPipeNoParenthesesExpressionOperation |
  //                             matchedExpressionMatchNoParenthesesExpressionOperation |
  //                             matchedExpressionOrNoParenthesesExpressionOperation |
  //                             matchedExpressionAndNoParenthesesExpressionOperation |
  //                             matchedExpressionComparisonNoParenthesesExpressionOperation |
  //                             matchedExpressionRelationalNoParenthesesExpressionOperation |
  //                             matchedExpressionArrowNoParenthesesExpressionOperation |
  //                             matchedExpressionInNoParenthesesExpressionOperation |
  //                             matchedExpressionTwoNoParenthesesExpressionOperation |
  //                             matchedExpressionAdditionNoParenthesesExpressionOperation |
  //                             matchedExpressionMultiplicationNoParenthesesExpressionOperation |
  //                             matchedExpressionHatNoParenthesesExpressionOperation |
  //                             unaryNoParenthesesExpressionOperation |
  //                             atNoParenthesesExpressionOperation |
  //                             noParenthesesMaybeQualifiedIdentifier callArgumentsNoParenthesesManyStrict
  public static boolean noParenthesesExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, "<no parentheses expression>");
    r = captureNoParenthesesExpressionOperation(b, l + 1);
    if (!r) r = matchedExpressionInMatchNoParenthesesExpressionOperation(b, l + 1);
    if (!r) r = matchedExpressionWhenNoParenthesesExpressionOperation(b, l + 1);
    if (!r) r = matchedExpressionTypeNoParenthesesExpressionOperation(b, l + 1);
    if (!r) r = matchedExpressionPipeNoParenthesesExpressionOperation(b, l + 1);
    if (!r) r = matchedExpressionMatchNoParenthesesExpressionOperation(b, l + 1);
    if (!r) r = matchedExpressionOrNoParenthesesExpressionOperation(b, l + 1);
    if (!r) r = matchedExpressionAndNoParenthesesExpressionOperation(b, l + 1);
    if (!r) r = matchedExpressionComparisonNoParenthesesExpressionOperation(b, l + 1);
    if (!r) r = matchedExpressionRelationalNoParenthesesExpressionOperation(b, l + 1);
    if (!r) r = matchedExpressionArrowNoParenthesesExpressionOperation(b, l + 1);
    if (!r) r = matchedExpressionInNoParenthesesExpressionOperation(b, l + 1);
    if (!r) r = matchedExpressionTwoNoParenthesesExpressionOperation(b, l + 1);
    if (!r) r = matchedExpressionAdditionNoParenthesesExpressionOperation(b, l + 1);
    if (!r) r = matchedExpressionMultiplicationNoParenthesesExpressionOperation(b, l + 1);
    if (!r) r = matchedExpressionHatNoParenthesesExpressionOperation(b, l + 1);
    if (!r) r = unaryNoParenthesesExpressionOperation(b, l + 1);
    if (!r) r = atNoParenthesesExpressionOperation(b, l + 1);
    if (!r) r = noParenthesesExpression_18(b, l + 1);
    exit_section_(b, l, m, NO_PARENTHESES_EXPRESSION, r, false, null);
    return r;
  }

  // noParenthesesMaybeQualifiedIdentifier callArgumentsNoParenthesesManyStrict
  private static boolean noParenthesesExpression_18(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesExpression_18")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = noParenthesesMaybeQualifiedIdentifier(b, l + 1);
    r = r && callArgumentsNoParenthesesManyStrict(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // noParenthesesExpression
  public static boolean noParenthesesManyStrictNoParenthesesExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesManyStrictNoParenthesesExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<no parentheses many strict no parentheses expression>");
    r = noParenthesesExpression(b, l + 1);
    exit_section_(b, l, m, NO_PARENTHESES_MANY_STRICT_NO_PARENTHESES_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // noParenthesesQualifier* IDENTIFIER
  public static boolean noParenthesesMaybeQualifiedIdentifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesMaybeQualifiedIdentifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<no parentheses maybe qualified identifier>");
    r = noParenthesesMaybeQualifiedIdentifier_0(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, NO_PARENTHESES_MAYBE_QUALIFIED_IDENTIFIER, r, false, null);
    return r;
  }

  // noParenthesesQualifier*
  private static boolean noParenthesesMaybeQualifiedIdentifier_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesMaybeQualifiedIdentifier_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!noParenthesesQualifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "noParenthesesMaybeQualifiedIdentifier_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // noParenthesesQualifierHead noParenthesesQualifierTail*
  public static boolean noParenthesesQualifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesQualifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<no parentheses qualifier>");
    r = noParenthesesQualifierHead(b, l + 1);
    r = r && noParenthesesQualifier_1(b, l + 1);
    exit_section_(b, l, m, NO_PARENTHESES_QUALIFIER, r, false, null);
    return r;
  }

  // noParenthesesQualifierTail*
  private static boolean noParenthesesQualifier_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesQualifier_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!noParenthesesQualifierTail(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "noParenthesesQualifier_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // AT_OPERATOR EOL* noParenthesesQualifierHead
  public static boolean noParenthesesQualifierAtOperation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesQualifierAtOperation")) return false;
    if (!nextTokenIs(b, AT_OPERATOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AT_OPERATOR);
    r = r && noParenthesesQualifierAtOperation_1(b, l + 1);
    r = r && noParenthesesQualifierHead(b, l + 1);
    exit_section_(b, m, NO_PARENTHESES_QUALIFIER_AT_OPERATION, r);
    return r;
  }

  // EOL*
  private static boolean noParenthesesQualifierAtOperation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesQualifierAtOperation_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "noParenthesesQualifierAtOperation_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // (
  //                                 noParenthesesQualifierAtOperation |
  //                                 noParenthesesQualifierNumberCaptureOperation |
  //                                 noParenthesesQualifierNumberUnaryOperation |
  //                                 noParenthesesQualifierNumberAtOperation |
  //                                 OPENING_PARENTHESIS EOL* SEMICOLON EOL* CLOSING_PARENTHESIS |
  //                                 CHAR_TOKEN |
  //                                 number |
  //                                 list |
  //                                 binaryString |
  //                                 listString |
  //                                 sigil |
  //                                 FALSE |
  //                                 NIL |
  //                                 TRUE |
  //                                 atom |
  //                                 ALIAS |
  //                                 IDENTIFER
  //                                ) EOL* DOT_OPERATOR EOL* &(noParenthesesQualifierTail | IDENTIFIER)
  static boolean noParenthesesQualifierHead(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesQualifierHead")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = noParenthesesQualifierHead_0(b, l + 1);
    r = r && noParenthesesQualifierHead_1(b, l + 1);
    r = r && consumeToken(b, DOT_OPERATOR);
    r = r && noParenthesesQualifierHead_3(b, l + 1);
    r = r && noParenthesesQualifierHead_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // noParenthesesQualifierAtOperation |
  //                                 noParenthesesQualifierNumberCaptureOperation |
  //                                 noParenthesesQualifierNumberUnaryOperation |
  //                                 noParenthesesQualifierNumberAtOperation |
  //                                 OPENING_PARENTHESIS EOL* SEMICOLON EOL* CLOSING_PARENTHESIS |
  //                                 CHAR_TOKEN |
  //                                 number |
  //                                 list |
  //                                 binaryString |
  //                                 listString |
  //                                 sigil |
  //                                 FALSE |
  //                                 NIL |
  //                                 TRUE |
  //                                 atom |
  //                                 ALIAS |
  //                                 IDENTIFER
  private static boolean noParenthesesQualifierHead_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesQualifierHead_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = noParenthesesQualifierAtOperation(b, l + 1);
    if (!r) r = noParenthesesQualifierNumberCaptureOperation(b, l + 1);
    if (!r) r = noParenthesesQualifierNumberUnaryOperation(b, l + 1);
    if (!r) r = noParenthesesQualifierNumberAtOperation(b, l + 1);
    if (!r) r = noParenthesesQualifierHead_0_4(b, l + 1);
    if (!r) r = consumeToken(b, CHAR_TOKEN);
    if (!r) r = number(b, l + 1);
    if (!r) r = list(b, l + 1);
    if (!r) r = binaryString(b, l + 1);
    if (!r) r = listString(b, l + 1);
    if (!r) r = sigil(b, l + 1);
    if (!r) r = consumeToken(b, FALSE);
    if (!r) r = consumeToken(b, NIL);
    if (!r) r = consumeToken(b, TRUE);
    if (!r) r = atom(b, l + 1);
    if (!r) r = consumeToken(b, ALIAS);
    if (!r) r = consumeToken(b, IDENTIFER);
    exit_section_(b, m, null, r);
    return r;
  }

  // OPENING_PARENTHESIS EOL* SEMICOLON EOL* CLOSING_PARENTHESIS
  private static boolean noParenthesesQualifierHead_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesQualifierHead_0_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPENING_PARENTHESIS);
    r = r && noParenthesesQualifierHead_0_4_1(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    r = r && noParenthesesQualifierHead_0_4_3(b, l + 1);
    r = r && consumeToken(b, CLOSING_PARENTHESIS);
    exit_section_(b, m, null, r);
    return r;
  }

  // EOL*
  private static boolean noParenthesesQualifierHead_0_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesQualifierHead_0_4_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "noParenthesesQualifierHead_0_4_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean noParenthesesQualifierHead_0_4_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesQualifierHead_0_4_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "noParenthesesQualifierHead_0_4_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean noParenthesesQualifierHead_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesQualifierHead_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "noParenthesesQualifierHead_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean noParenthesesQualifierHead_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesQualifierHead_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "noParenthesesQualifierHead_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // &(noParenthesesQualifierTail | IDENTIFIER)
  private static boolean noParenthesesQualifierHead_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesQualifierHead_4")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_, null);
    r = noParenthesesQualifierHead_4_0(b, l + 1);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  // noParenthesesQualifierTail | IDENTIFIER
  private static boolean noParenthesesQualifierHead_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesQualifierHead_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = noParenthesesQualifierTail(b, l + 1);
    if (!r) r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // AT_OPERATOR EOL* number
  public static boolean noParenthesesQualifierNumberAtOperation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesQualifierNumberAtOperation")) return false;
    if (!nextTokenIs(b, AT_OPERATOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AT_OPERATOR);
    r = r && noParenthesesQualifierNumberAtOperation_1(b, l + 1);
    r = r && number(b, l + 1);
    exit_section_(b, m, NO_PARENTHESES_QUALIFIER_NUMBER_AT_OPERATION, r);
    return r;
  }

  // EOL*
  private static boolean noParenthesesQualifierNumberAtOperation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesQualifierNumberAtOperation_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "noParenthesesQualifierNumberAtOperation_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // CAPTURE_OPERATOR EOL* number
  public static boolean noParenthesesQualifierNumberCaptureOperation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesQualifierNumberCaptureOperation")) return false;
    if (!nextTokenIs(b, CAPTURE_OPERATOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CAPTURE_OPERATOR);
    r = r && noParenthesesQualifierNumberCaptureOperation_1(b, l + 1);
    r = r && number(b, l + 1);
    exit_section_(b, m, NO_PARENTHESES_QUALIFIER_NUMBER_CAPTURE_OPERATION, r);
    return r;
  }

  // EOL*
  private static boolean noParenthesesQualifierNumberCaptureOperation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesQualifierNumberCaptureOperation_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "noParenthesesQualifierNumberCaptureOperation_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // (DUAL_OPERATOR | UNARY_OPERATOR) EOL* number
  public static boolean noParenthesesQualifierNumberUnaryOperation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesQualifierNumberUnaryOperation")) return false;
    if (!nextTokenIs(b, "<no parentheses qualifier number unary operation>", DUAL_OPERATOR, UNARY_OPERATOR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<no parentheses qualifier number unary operation>");
    r = noParenthesesQualifierNumberUnaryOperation_0(b, l + 1);
    r = r && noParenthesesQualifierNumberUnaryOperation_1(b, l + 1);
    r = r && number(b, l + 1);
    exit_section_(b, l, m, NO_PARENTHESES_QUALIFIER_NUMBER_UNARY_OPERATION, r, false, null);
    return r;
  }

  // DUAL_OPERATOR | UNARY_OPERATOR
  private static boolean noParenthesesQualifierNumberUnaryOperation_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesQualifierNumberUnaryOperation_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DUAL_OPERATOR);
    if (!r) r = consumeToken(b, UNARY_OPERATOR);
    exit_section_(b, m, null, r);
    return r;
  }

  // EOL*
  private static boolean noParenthesesQualifierNumberUnaryOperation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesQualifierNumberUnaryOperation_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "noParenthesesQualifierNumberUnaryOperation_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // (
  //                                 binaryString |
  //                                 listString |
  //                                 sigil |
  //                                 FALSE |
  //                                 NIL |
  //                                 TRUE |
  //                                 atom |
  //                                 ALIAS |
  //                                 IDENTIFIER
  //                                ) EOL* DOT_OPERATOR EOL &(noParenthesesQualifierTail | IDENTIFIER)
  static boolean noParenthesesQualifierTail(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesQualifierTail")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = noParenthesesQualifierTail_0(b, l + 1);
    r = r && noParenthesesQualifierTail_1(b, l + 1);
    r = r && consumeTokens(b, 0, DOT_OPERATOR, EOL);
    r = r && noParenthesesQualifierTail_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // binaryString |
  //                                 listString |
  //                                 sigil |
  //                                 FALSE |
  //                                 NIL |
  //                                 TRUE |
  //                                 atom |
  //                                 ALIAS |
  //                                 IDENTIFIER
  private static boolean noParenthesesQualifierTail_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesQualifierTail_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = binaryString(b, l + 1);
    if (!r) r = listString(b, l + 1);
    if (!r) r = sigil(b, l + 1);
    if (!r) r = consumeToken(b, FALSE);
    if (!r) r = consumeToken(b, NIL);
    if (!r) r = consumeToken(b, TRUE);
    if (!r) r = atom(b, l + 1);
    if (!r) r = consumeToken(b, ALIAS);
    if (!r) r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // EOL*
  private static boolean noParenthesesQualifierTail_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesQualifierTail_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "noParenthesesQualifierTail_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // &(noParenthesesQualifierTail | IDENTIFIER)
  private static boolean noParenthesesQualifierTail_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesQualifierTail_4")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_, null);
    r = noParenthesesQualifierTail_4_0(b, l + 1);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  // noParenthesesQualifierTail | IDENTIFIER
  private static boolean noParenthesesQualifierTail_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesQualifierTail_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = noParenthesesQualifierTail(b, l + 1);
    if (!r) r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // emptyParentheses |
  //                         OPENING_PARENTHESIS (
  //                                              callArgumentsNoParenthesesKeywords |
  //                                              callArgumentsNoParenthesesMany
  //                                             ) CLOSING_PARENTHESIS
  public static boolean noParenthesesStrict(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesStrict")) return false;
    if (!nextTokenIs(b, OPENING_PARENTHESIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = emptyParentheses(b, l + 1);
    if (!r) r = noParenthesesStrict_1(b, l + 1);
    exit_section_(b, m, NO_PARENTHESES_STRICT, r);
    return r;
  }

  // OPENING_PARENTHESIS (
  //                                              callArgumentsNoParenthesesKeywords |
  //                                              callArgumentsNoParenthesesMany
  //                                             ) CLOSING_PARENTHESIS
  private static boolean noParenthesesStrict_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesStrict_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPENING_PARENTHESIS);
    r = r && noParenthesesStrict_1_1(b, l + 1);
    r = r && consumeToken(b, CLOSING_PARENTHESIS);
    exit_section_(b, m, null, r);
    return r;
  }

  // callArgumentsNoParenthesesKeywords |
  //                                              callArgumentsNoParenthesesMany
  private static boolean noParenthesesStrict_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesStrict_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = callArgumentsNoParenthesesKeywords(b, l + 1);
    if (!r) r = callArgumentsNoParenthesesMany(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // binaryWholeNumber |
  //            decimalNumber |
  //            hexadecimalWholeNumber |
  //            octalWholeNumber |
  //            unknownBaseWholeNumber
  public static boolean number(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "number")) return false;
    if (!nextTokenIs(b, "<number>", BASE_WHOLE_NUMBER_PREFIX, VALID_DECIMAL_DIGITS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, "<number>");
    r = binaryWholeNumber(b, l + 1);
    if (!r) r = decimalNumber(b, l + 1);
    if (!r) r = hexadecimalWholeNumber(b, l + 1);
    if (!r) r = octalWholeNumber(b, l + 1);
    if (!r) r = unknownBaseWholeNumber(b, l + 1);
    exit_section_(b, l, m, NUMBER, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (DUAL_OPERATOR | UNARY_OPERATOR) EOL* number
  public static boolean numberUnaryOperation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "numberUnaryOperation")) return false;
    if (!nextTokenIs(b, "<number unary operation>", DUAL_OPERATOR, UNARY_OPERATOR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, "<number unary operation>");
    r = numberUnaryOperation_0(b, l + 1);
    r = r && numberUnaryOperation_1(b, l + 1);
    r = r && number(b, l + 1);
    exit_section_(b, l, m, NUMBER_UNARY_OPERATION, r, false, null);
    return r;
  }

  // DUAL_OPERATOR | UNARY_OPERATOR
  private static boolean numberUnaryOperation_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "numberUnaryOperation_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DUAL_OPERATOR);
    if (!r) r = consumeToken(b, UNARY_OPERATOR);
    exit_section_(b, m, null, r);
    return r;
  }

  // EOL*
  private static boolean numberUnaryOperation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "numberUnaryOperation_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "numberUnaryOperation_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // BASE_WHOLE_NUMBER_PREFIX OCTAL_WHOLE_NUMBER_BASE (INVALID_OCTAL_DIGITS | VALID_OCTAL_DIGITS)+
  public static boolean octalWholeNumber(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "octalWholeNumber")) return false;
    if (!nextTokenIs(b, BASE_WHOLE_NUMBER_PREFIX)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokens(b, 2, BASE_WHOLE_NUMBER_PREFIX, OCTAL_WHOLE_NUMBER_BASE);
    p = r; // pin = 2
    r = r && octalWholeNumber_2(b, l + 1);
    exit_section_(b, l, m, OCTAL_WHOLE_NUMBER, r, p, null);
    return r || p;
  }

  // (INVALID_OCTAL_DIGITS | VALID_OCTAL_DIGITS)+
  private static boolean octalWholeNumber_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "octalWholeNumber_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = octalWholeNumber_2_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!octalWholeNumber_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "octalWholeNumber_2", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // INVALID_OCTAL_DIGITS | VALID_OCTAL_DIGITS
  private static boolean octalWholeNumber_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "octalWholeNumber_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INVALID_OCTAL_DIGITS);
    if (!r) r = consumeToken(b, VALID_OCTAL_DIGITS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // charList | string
  static boolean quote(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "quote")) return false;
    if (!nextTokenIs(b, "", CHAR_LIST_PROMOTER, STRING_PROMOTER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = charList(b, l + 1);
    if (!r) r = string(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // interpolatedCharListSigil |
  //           interpolatedHeredocCharListSigil |
  //           interpolatedHeredocRegex |
  //           interpolatedHeredocSigil |
  //           interpolatedHeredocStringSigil |
  //           interpolatedHeredocWords |
  //           interpolatedRegex |
  //           interpolatedSigil |
  //           interpolatedStringSigil |
  //           literalCharListSigil |
  //           literalHeredocRegex |
  //           literalHeredocSigil |
  //           literalHeredocStringSigil |
  //           literalHeredocWords |
  //           literalRegex |
  //           literalSigil |
  //           literalStringSigil |
  //           literalWords
  public static boolean sigil(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sigil")) return false;
    if (!nextTokenIs(b, TILDE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = interpolatedCharListSigil(b, l + 1);
    if (!r) r = interpolatedHeredocCharListSigil(b, l + 1);
    if (!r) r = interpolatedHeredocRegex(b, l + 1);
    if (!r) r = interpolatedHeredocSigil(b, l + 1);
    if (!r) r = interpolatedHeredocStringSigil(b, l + 1);
    if (!r) r = interpolatedHeredocWords(b, l + 1);
    if (!r) r = interpolatedRegex(b, l + 1);
    if (!r) r = interpolatedSigil(b, l + 1);
    if (!r) r = interpolatedStringSigil(b, l + 1);
    if (!r) r = literalCharListSigil(b, l + 1);
    if (!r) r = literalHeredocRegex(b, l + 1);
    if (!r) r = literalHeredocSigil(b, l + 1);
    if (!r) r = literalHeredocStringSigil(b, l + 1);
    if (!r) r = literalHeredocWords(b, l + 1);
    if (!r) r = literalRegex(b, l + 1);
    if (!r) r = literalSigil(b, l + 1);
    if (!r) r = literalStringSigil(b, l + 1);
    if (!r) r = literalWords(b, l + 1);
    exit_section_(b, m, SIGIL, r);
    return r;
  }

  /* ********************************************************** */
  // STRING_PROMOTER
  //            interpolatedStringBody
  //            STRING_TERMINATOR
  public static boolean string(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string")) return false;
    if (!nextTokenIs(b, STRING_PROMOTER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING_PROMOTER);
    r = r && interpolatedStringBody(b, l + 1);
    r = r && consumeToken(b, STRING_TERMINATOR);
    exit_section_(b, m, STRING, r);
    return r;
  }

  /* ********************************************************** */
  // STRING_HEREDOC_PROMOTER EOL
  //                   interpolatedStringBody
  //                   STRING_HEREDOC_TERMINATOR
  public static boolean stringHeredoc(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stringHeredoc")) return false;
    if (!nextTokenIs(b, STRING_HEREDOC_PROMOTER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, STRING_HEREDOC_PROMOTER, EOL);
    r = r && interpolatedStringBody(b, l + 1);
    r = r && consumeToken(b, STRING_HEREDOC_TERMINATOR);
    exit_section_(b, m, STRING_HEREDOC, r);
    return r;
  }

  /* ********************************************************** */
  // (DUAL_OPERATOR | UNARY_OPERATOR) EOL* noParenthesesExpression
  public static boolean unaryNoParenthesesExpressionOperation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryNoParenthesesExpressionOperation")) return false;
    if (!nextTokenIs(b, "<unary no parentheses expression operation>", DUAL_OPERATOR, UNARY_OPERATOR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, "<unary no parentheses expression operation>");
    r = unaryNoParenthesesExpressionOperation_0(b, l + 1);
    r = r && unaryNoParenthesesExpressionOperation_1(b, l + 1);
    r = r && noParenthesesExpression(b, l + 1);
    exit_section_(b, l, m, UNARY_NO_PARENTHESES_EXPRESSION_OPERATION, r, false, null);
    return r;
  }

  // DUAL_OPERATOR | UNARY_OPERATOR
  private static boolean unaryNoParenthesesExpressionOperation_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryNoParenthesesExpressionOperation_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DUAL_OPERATOR);
    if (!r) r = consumeToken(b, UNARY_OPERATOR);
    exit_section_(b, m, null, r);
    return r;
  }

  // EOL*
  private static boolean unaryNoParenthesesExpressionOperation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryNoParenthesesExpressionOperation_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "unaryNoParenthesesExpressionOperation_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // BASE_WHOLE_NUMBER_PREFIX UNKNOWN_WHOLE_NUMBER_BASE INVALID_UNKNOWN_BASE_DIGITS+
  public static boolean unknownBaseWholeNumber(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unknownBaseWholeNumber")) return false;
    if (!nextTokenIs(b, BASE_WHOLE_NUMBER_PREFIX)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokens(b, 2, BASE_WHOLE_NUMBER_PREFIX, UNKNOWN_WHOLE_NUMBER_BASE);
    p = r; // pin = 2
    r = r && unknownBaseWholeNumber_2(b, l + 1);
    exit_section_(b, l, m, UNKNOWN_BASE_WHOLE_NUMBER, r, p, null);
    return r || p;
  }

  // INVALID_UNKNOWN_BASE_DIGITS+
  private static boolean unknownBaseWholeNumber_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unknownBaseWholeNumber_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INVALID_UNKNOWN_BASE_DIGITS);
    int c = current_position_(b);
    while (r) {
      if (!consumeToken(b, INVALID_UNKNOWN_BASE_DIGITS)) break;
      if (!empty_element_parsed_guard_(b, "unknownBaseWholeNumber_2", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Expression root: matchedExpression
  // Operator priority table:
  // 0: ATOM(captureMatchedExpressionOperation)
  // 1: BINARY(matchedExpressionInMatchMatchedExpressionOperation)
  // 2: BINARY(matchedExpressionWhenMatchedExpressionOperation)
  // 3: BINARY(matchedExpressionTypeMatchedExpressionOperation)
  // 4: BINARY(matchedExpressionPipeMatchedExpressionOperation)
  // 5: BINARY(matchedExpressionMatchMatchedExpressionOperation)
  // 6: BINARY(matchedExpressionOrMatchedExpressionOperation)
  // 7: BINARY(matchedExpressionAndMatchedExpressionOperation)
  // 8: BINARY(matchedExpressionComparisonMatchedExpressionOperation)
  // 9: BINARY(matchedExpressionRelationalMatchedExpressionOperation)
  // 10: BINARY(matchedExpressionArrowMatchedExpressionOperation)
  // 11: BINARY(matchedExpressionInMatchedExpressionOperation)
  // 12: BINARY(matchedExpressionTwoMatchedExpressionOperation)
  // 13: BINARY(matchedExpressionAdditionMatchedExpressionOperation)
  // 14: BINARY(matchedExpressionMultiplicationMatchedExpressionOperation)
  // 15: BINARY(matchedExpressionHatMatchedExpressionOperation)
  // 16: PREFIX(unaryMatchedExpressionOperation)
  // 17: POSTFIX(matchedExpressionDotAlias)
  // 18: POSTFIX(matchedExpressionDotIdentifier)
  // 19: PREFIX(atMatchedExpressionOperation)
  // 20: ATOM(identifierExpression)
  // 21: ATOM(matchedExpressionAccessExpression)
  public static boolean matchedExpression(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "matchedExpression")) return false;
    addVariant(b, "<matched expression>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<matched expression>");
    r = captureMatchedExpressionOperation(b, l + 1);
    if (!r) r = unaryMatchedExpressionOperation(b, l + 1);
    if (!r) r = atMatchedExpressionOperation(b, l + 1);
    if (!r) r = identifierExpression(b, l + 1);
    if (!r) r = matchedExpressionAccessExpression(b, l + 1);
    p = r;
    r = r && matchedExpression_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean matchedExpression_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "matchedExpression_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 1 && matchedExpressionInMatchMatchedExpressionOperation_0(b, l + 1)) {
        r = matchedExpression(b, l, 1);
        exit_section_(b, l, m, MATCHED_EXPRESSION_IN_MATCH_MATCHED_EXPRESSION_OPERATION, r, true, null);
      }
      else if (g < 2 && matchedExpressionWhenMatchedExpressionOperation_0(b, l + 1)) {
        r = matchedExpression(b, l, 1);
        exit_section_(b, l, m, MATCHED_EXPRESSION_WHEN_MATCHED_EXPRESSION_OPERATION, r, true, null);
      }
      else if (g < 3 && matchedExpressionTypeMatchedExpressionOperation_0(b, l + 1)) {
        r = matchedExpression(b, l, 2);
        exit_section_(b, l, m, MATCHED_EXPRESSION_TYPE_MATCHED_EXPRESSION_OPERATION, r, true, null);
      }
      else if (g < 4 && matchedExpressionPipeMatchedExpressionOperation_0(b, l + 1)) {
        r = matchedExpression(b, l, 3);
        exit_section_(b, l, m, MATCHED_EXPRESSION_PIPE_MATCHED_EXPRESSION_OPERATION, r, true, null);
      }
      else if (g < 5 && matchedExpressionMatchMatchedExpressionOperation_0(b, l + 1)) {
        r = matchedExpression(b, l, 4);
        exit_section_(b, l, m, MATCHED_EXPRESSION_MATCH_MATCHED_EXPRESSION_OPERATION, r, true, null);
      }
      else if (g < 6 && matchedExpressionOrMatchedExpressionOperation_0(b, l + 1)) {
        r = matchedExpression(b, l, 6);
        exit_section_(b, l, m, MATCHED_EXPRESSION_OR_MATCHED_EXPRESSION_OPERATION, r, true, null);
      }
      else if (g < 7 && matchedExpressionAndMatchedExpressionOperation_0(b, l + 1)) {
        r = matchedExpression(b, l, 7);
        exit_section_(b, l, m, MATCHED_EXPRESSION_AND_MATCHED_EXPRESSION_OPERATION, r, true, null);
      }
      else if (g < 8 && matchedExpressionComparisonMatchedExpressionOperation_0(b, l + 1)) {
        r = matchedExpression(b, l, 8);
        exit_section_(b, l, m, MATCHED_EXPRESSION_COMPARISON_MATCHED_EXPRESSION_OPERATION, r, true, null);
      }
      else if (g < 9 && matchedExpressionRelationalMatchedExpressionOperation_0(b, l + 1)) {
        r = matchedExpression(b, l, 9);
        exit_section_(b, l, m, MATCHED_EXPRESSION_RELATIONAL_MATCHED_EXPRESSION_OPERATION, r, true, null);
      }
      else if (g < 10 && matchedExpressionArrowMatchedExpressionOperation_0(b, l + 1)) {
        r = matchedExpression(b, l, 10);
        exit_section_(b, l, m, MATCHED_EXPRESSION_ARROW_MATCHED_EXPRESSION_OPERATION, r, true, null);
      }
      else if (g < 11 && matchedExpressionInMatchedExpressionOperation_0(b, l + 1)) {
        r = matchedExpression(b, l, 11);
        exit_section_(b, l, m, MATCHED_EXPRESSION_IN_MATCHED_EXPRESSION_OPERATION, r, true, null);
      }
      else if (g < 12 && matchedExpressionTwoMatchedExpressionOperation_0(b, l + 1)) {
        r = matchedExpression(b, l, 11);
        exit_section_(b, l, m, MATCHED_EXPRESSION_TWO_MATCHED_EXPRESSION_OPERATION, r, true, null);
      }
      else if (g < 13 && matchedExpressionAdditionMatchedExpressionOperation_0(b, l + 1)) {
        r = matchedExpression(b, l, 13);
        exit_section_(b, l, m, MATCHED_EXPRESSION_ADDITION_MATCHED_EXPRESSION_OPERATION, r, true, null);
      }
      else if (g < 14 && matchedExpressionMultiplicationMatchedExpressionOperation_0(b, l + 1)) {
        r = matchedExpression(b, l, 14);
        exit_section_(b, l, m, MATCHED_EXPRESSION_MULTIPLICATION_MATCHED_EXPRESSION_OPERATION, r, true, null);
      }
      else if (g < 15 && matchedExpressionHatMatchedExpressionOperation_0(b, l + 1)) {
        r = matchedExpression(b, l, 15);
        exit_section_(b, l, m, MATCHED_EXPRESSION_HAT_MATCHED_EXPRESSION_OPERATION, r, true, null);
      }
      else if (g < 17 && matchedExpressionDotAlias_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, MATCHED_EXPRESSION_DOT_ALIAS, r, true, null);
      }
      else if (g < 18 && matchedExpressionDotIdentifier_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, MATCHED_EXPRESSION_DOT_IDENTIFIER, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  // CAPTURE_OPERATOR EOL* (number | matchedExpression)
  public static boolean captureMatchedExpressionOperation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "captureMatchedExpressionOperation")) return false;
    if (!nextTokenIsFast(b, CAPTURE_OPERATOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, CAPTURE_OPERATOR);
    r = r && captureMatchedExpressionOperation_1(b, l + 1);
    r = r && captureMatchedExpressionOperation_2(b, l + 1);
    exit_section_(b, m, CAPTURE_MATCHED_EXPRESSION_OPERATION, r);
    return r;
  }

  // EOL*
  private static boolean captureMatchedExpressionOperation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "captureMatchedExpressionOperation_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeTokenSmart(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "captureMatchedExpressionOperation_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // number | matchedExpression
  private static boolean captureMatchedExpressionOperation_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "captureMatchedExpressionOperation_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = number(b, l + 1);
    if (!r) r = matchedExpression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EOL* IN_MATCH_OPERATOR EOL*
  private static boolean matchedExpressionInMatchMatchedExpressionOperation_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionInMatchMatchedExpressionOperation_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = matchedExpressionInMatchMatchedExpressionOperation_0_0(b, l + 1);
    r = r && consumeToken(b, IN_MATCH_OPERATOR);
    r = r && matchedExpressionInMatchMatchedExpressionOperation_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EOL*
  private static boolean matchedExpressionInMatchMatchedExpressionOperation_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionInMatchMatchedExpressionOperation_0_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeTokenSmart(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionInMatchMatchedExpressionOperation_0_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean matchedExpressionInMatchMatchedExpressionOperation_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionInMatchMatchedExpressionOperation_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeTokenSmart(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionInMatchMatchedExpressionOperation_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL* WHEN_OPERATOR EOL*
  private static boolean matchedExpressionWhenMatchedExpressionOperation_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionWhenMatchedExpressionOperation_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = matchedExpressionWhenMatchedExpressionOperation_0_0(b, l + 1);
    r = r && consumeToken(b, WHEN_OPERATOR);
    r = r && matchedExpressionWhenMatchedExpressionOperation_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EOL*
  private static boolean matchedExpressionWhenMatchedExpressionOperation_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionWhenMatchedExpressionOperation_0_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeTokenSmart(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionWhenMatchedExpressionOperation_0_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean matchedExpressionWhenMatchedExpressionOperation_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionWhenMatchedExpressionOperation_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeTokenSmart(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionWhenMatchedExpressionOperation_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL* TYPE_OPERATOR EOL*
  private static boolean matchedExpressionTypeMatchedExpressionOperation_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionTypeMatchedExpressionOperation_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = matchedExpressionTypeMatchedExpressionOperation_0_0(b, l + 1);
    r = r && consumeToken(b, TYPE_OPERATOR);
    r = r && matchedExpressionTypeMatchedExpressionOperation_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EOL*
  private static boolean matchedExpressionTypeMatchedExpressionOperation_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionTypeMatchedExpressionOperation_0_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeTokenSmart(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionTypeMatchedExpressionOperation_0_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean matchedExpressionTypeMatchedExpressionOperation_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionTypeMatchedExpressionOperation_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeTokenSmart(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionTypeMatchedExpressionOperation_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL* PIPE_OPERATOR EOL*
  private static boolean matchedExpressionPipeMatchedExpressionOperation_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionPipeMatchedExpressionOperation_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = matchedExpressionPipeMatchedExpressionOperation_0_0(b, l + 1);
    r = r && consumeToken(b, PIPE_OPERATOR);
    r = r && matchedExpressionPipeMatchedExpressionOperation_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EOL*
  private static boolean matchedExpressionPipeMatchedExpressionOperation_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionPipeMatchedExpressionOperation_0_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeTokenSmart(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionPipeMatchedExpressionOperation_0_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean matchedExpressionPipeMatchedExpressionOperation_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionPipeMatchedExpressionOperation_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeTokenSmart(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionPipeMatchedExpressionOperation_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL* MATCH_OPERATOR EOL*
  private static boolean matchedExpressionMatchMatchedExpressionOperation_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionMatchMatchedExpressionOperation_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = matchedExpressionMatchMatchedExpressionOperation_0_0(b, l + 1);
    r = r && consumeToken(b, MATCH_OPERATOR);
    r = r && matchedExpressionMatchMatchedExpressionOperation_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EOL*
  private static boolean matchedExpressionMatchMatchedExpressionOperation_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionMatchMatchedExpressionOperation_0_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeTokenSmart(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionMatchMatchedExpressionOperation_0_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean matchedExpressionMatchMatchedExpressionOperation_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionMatchMatchedExpressionOperation_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeTokenSmart(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionMatchMatchedExpressionOperation_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL* OR_OPERATOR EOL*
  private static boolean matchedExpressionOrMatchedExpressionOperation_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionOrMatchedExpressionOperation_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = matchedExpressionOrMatchedExpressionOperation_0_0(b, l + 1);
    r = r && consumeToken(b, OR_OPERATOR);
    r = r && matchedExpressionOrMatchedExpressionOperation_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EOL*
  private static boolean matchedExpressionOrMatchedExpressionOperation_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionOrMatchedExpressionOperation_0_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeTokenSmart(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionOrMatchedExpressionOperation_0_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean matchedExpressionOrMatchedExpressionOperation_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionOrMatchedExpressionOperation_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeTokenSmart(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionOrMatchedExpressionOperation_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL* AND_OPERATOR EOL*
  private static boolean matchedExpressionAndMatchedExpressionOperation_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionAndMatchedExpressionOperation_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = matchedExpressionAndMatchedExpressionOperation_0_0(b, l + 1);
    r = r && consumeToken(b, AND_OPERATOR);
    r = r && matchedExpressionAndMatchedExpressionOperation_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EOL*
  private static boolean matchedExpressionAndMatchedExpressionOperation_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionAndMatchedExpressionOperation_0_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeTokenSmart(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionAndMatchedExpressionOperation_0_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean matchedExpressionAndMatchedExpressionOperation_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionAndMatchedExpressionOperation_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeTokenSmart(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionAndMatchedExpressionOperation_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL* COMPARISON_OPERATOR EOL*
  private static boolean matchedExpressionComparisonMatchedExpressionOperation_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionComparisonMatchedExpressionOperation_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = matchedExpressionComparisonMatchedExpressionOperation_0_0(b, l + 1);
    r = r && consumeToken(b, COMPARISON_OPERATOR);
    r = r && matchedExpressionComparisonMatchedExpressionOperation_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EOL*
  private static boolean matchedExpressionComparisonMatchedExpressionOperation_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionComparisonMatchedExpressionOperation_0_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeTokenSmart(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionComparisonMatchedExpressionOperation_0_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean matchedExpressionComparisonMatchedExpressionOperation_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionComparisonMatchedExpressionOperation_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeTokenSmart(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionComparisonMatchedExpressionOperation_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL* RELATIONAL_OPERATOR EOL*
  private static boolean matchedExpressionRelationalMatchedExpressionOperation_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionRelationalMatchedExpressionOperation_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = matchedExpressionRelationalMatchedExpressionOperation_0_0(b, l + 1);
    r = r && consumeToken(b, RELATIONAL_OPERATOR);
    r = r && matchedExpressionRelationalMatchedExpressionOperation_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EOL*
  private static boolean matchedExpressionRelationalMatchedExpressionOperation_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionRelationalMatchedExpressionOperation_0_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeTokenSmart(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionRelationalMatchedExpressionOperation_0_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean matchedExpressionRelationalMatchedExpressionOperation_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionRelationalMatchedExpressionOperation_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeTokenSmart(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionRelationalMatchedExpressionOperation_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL* ARROW_OPERATOR EOL*
  private static boolean matchedExpressionArrowMatchedExpressionOperation_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionArrowMatchedExpressionOperation_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = matchedExpressionArrowMatchedExpressionOperation_0_0(b, l + 1);
    r = r && consumeToken(b, ARROW_OPERATOR);
    r = r && matchedExpressionArrowMatchedExpressionOperation_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EOL*
  private static boolean matchedExpressionArrowMatchedExpressionOperation_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionArrowMatchedExpressionOperation_0_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeTokenSmart(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionArrowMatchedExpressionOperation_0_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean matchedExpressionArrowMatchedExpressionOperation_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionArrowMatchedExpressionOperation_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeTokenSmart(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionArrowMatchedExpressionOperation_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL* IN_OPERATOR EOL*
  private static boolean matchedExpressionInMatchedExpressionOperation_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionInMatchedExpressionOperation_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = matchedExpressionInMatchedExpressionOperation_0_0(b, l + 1);
    r = r && consumeToken(b, IN_OPERATOR);
    r = r && matchedExpressionInMatchedExpressionOperation_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EOL*
  private static boolean matchedExpressionInMatchedExpressionOperation_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionInMatchedExpressionOperation_0_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeTokenSmart(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionInMatchedExpressionOperation_0_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean matchedExpressionInMatchedExpressionOperation_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionInMatchedExpressionOperation_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeTokenSmart(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionInMatchedExpressionOperation_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL* TWO_OPERATOR EOL*
  private static boolean matchedExpressionTwoMatchedExpressionOperation_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionTwoMatchedExpressionOperation_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = matchedExpressionTwoMatchedExpressionOperation_0_0(b, l + 1);
    r = r && consumeToken(b, TWO_OPERATOR);
    r = r && matchedExpressionTwoMatchedExpressionOperation_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EOL*
  private static boolean matchedExpressionTwoMatchedExpressionOperation_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionTwoMatchedExpressionOperation_0_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeTokenSmart(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionTwoMatchedExpressionOperation_0_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean matchedExpressionTwoMatchedExpressionOperation_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionTwoMatchedExpressionOperation_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeTokenSmart(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionTwoMatchedExpressionOperation_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // DUAL_OPERATOR EOL*
  private static boolean matchedExpressionAdditionMatchedExpressionOperation_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionAdditionMatchedExpressionOperation_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, DUAL_OPERATOR);
    r = r && matchedExpressionAdditionMatchedExpressionOperation_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EOL*
  private static boolean matchedExpressionAdditionMatchedExpressionOperation_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionAdditionMatchedExpressionOperation_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeTokenSmart(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionAdditionMatchedExpressionOperation_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL* MULTIPLICATION_OPERATOR EOL*
  private static boolean matchedExpressionMultiplicationMatchedExpressionOperation_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionMultiplicationMatchedExpressionOperation_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = matchedExpressionMultiplicationMatchedExpressionOperation_0_0(b, l + 1);
    r = r && consumeToken(b, MULTIPLICATION_OPERATOR);
    r = r && matchedExpressionMultiplicationMatchedExpressionOperation_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EOL*
  private static boolean matchedExpressionMultiplicationMatchedExpressionOperation_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionMultiplicationMatchedExpressionOperation_0_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeTokenSmart(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionMultiplicationMatchedExpressionOperation_0_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean matchedExpressionMultiplicationMatchedExpressionOperation_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionMultiplicationMatchedExpressionOperation_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeTokenSmart(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionMultiplicationMatchedExpressionOperation_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL* HAT_OPERATOR EOL*
  private static boolean matchedExpressionHatMatchedExpressionOperation_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionHatMatchedExpressionOperation_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = matchedExpressionHatMatchedExpressionOperation_0_0(b, l + 1);
    r = r && consumeToken(b, HAT_OPERATOR);
    r = r && matchedExpressionHatMatchedExpressionOperation_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EOL*
  private static boolean matchedExpressionHatMatchedExpressionOperation_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionHatMatchedExpressionOperation_0_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeTokenSmart(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionHatMatchedExpressionOperation_0_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean matchedExpressionHatMatchedExpressionOperation_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionHatMatchedExpressionOperation_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeTokenSmart(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionHatMatchedExpressionOperation_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  public static boolean unaryMatchedExpressionOperation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryMatchedExpressionOperation")) return false;
    if (!nextTokenIsFast(b, DUAL_OPERATOR, UNARY_OPERATOR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = unaryMatchedExpressionOperation_0(b, l + 1);
    p = r;
    r = p && matchedExpression(b, l, 16);
    exit_section_(b, l, m, UNARY_MATCHED_EXPRESSION_OPERATION, r, p, null);
    return r || p;
  }

  // (DUAL_OPERATOR | UNARY_OPERATOR) EOL*
  private static boolean unaryMatchedExpressionOperation_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryMatchedExpressionOperation_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = unaryMatchedExpressionOperation_0_0(b, l + 1);
    r = r && unaryMatchedExpressionOperation_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // DUAL_OPERATOR | UNARY_OPERATOR
  private static boolean unaryMatchedExpressionOperation_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryMatchedExpressionOperation_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, DUAL_OPERATOR);
    if (!r) r = consumeTokenSmart(b, UNARY_OPERATOR);
    exit_section_(b, m, null, r);
    return r;
  }

  // EOL*
  private static boolean unaryMatchedExpressionOperation_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryMatchedExpressionOperation_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeTokenSmart(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "unaryMatchedExpressionOperation_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL* DOT_OPERATOR EOL* ALIAS
  private static boolean matchedExpressionDotAlias_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionDotAlias_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = matchedExpressionDotAlias_0_0(b, l + 1);
    r = r && consumeToken(b, DOT_OPERATOR);
    r = r && matchedExpressionDotAlias_0_2(b, l + 1);
    r = r && consumeToken(b, ALIAS);
    exit_section_(b, m, null, r);
    return r;
  }

  // EOL*
  private static boolean matchedExpressionDotAlias_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionDotAlias_0_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeTokenSmart(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionDotAlias_0_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean matchedExpressionDotAlias_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionDotAlias_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeTokenSmart(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionDotAlias_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL* DOT_OPERATOR EOL* IDENTIFIER
  private static boolean matchedExpressionDotIdentifier_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionDotIdentifier_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = matchedExpressionDotIdentifier_0_0(b, l + 1);
    r = r && consumeToken(b, DOT_OPERATOR);
    r = r && matchedExpressionDotIdentifier_0_2(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // EOL*
  private static boolean matchedExpressionDotIdentifier_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionDotIdentifier_0_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeTokenSmart(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionDotIdentifier_0_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean matchedExpressionDotIdentifier_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionDotIdentifier_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeTokenSmart(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionDotIdentifier_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  public static boolean atMatchedExpressionOperation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atMatchedExpressionOperation")) return false;
    if (!nextTokenIsFast(b, AT_OPERATOR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = atMatchedExpressionOperation_0(b, l + 1);
    p = r;
    r = p && matchedExpression(b, l, 19);
    exit_section_(b, l, m, AT_MATCHED_EXPRESSION_OPERATION, r, p, null);
    return r || p;
  }

  // AT_OPERATOR EOL*
  private static boolean atMatchedExpressionOperation_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atMatchedExpressionOperation_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, AT_OPERATOR);
    r = r && atMatchedExpressionOperation_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EOL*
  private static boolean atMatchedExpressionOperation_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atMatchedExpressionOperation_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeTokenSmart(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "atMatchedExpressionOperation_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // IDENTIFIER
  public static boolean identifierExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifierExpression")) return false;
    if (!nextTokenIsFast(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, IDENTIFIER);
    exit_section_(b, m, IDENTIFIER_EXPRESSION, r);
    return r;
  }

  // numberUnaryOperation |
  //                                       OPENING_PARENTHESIS EOL* SEMICOLON EOL* CLOSING_PARENTHESIS |
  //                                       /* elixir_tokenizer.erl converts CHAR_TOKENs to their number representation, so `number` in
  //                                          elixir_parser.yrl matches Elixir.flex's NUMBER and CHAR_TOKEN. */
  //                                       CHAR_TOKEN |
  //                                       number |
  //                                       list |
  //                                       binaryString |
  //                                       listString |
  //                                       sigil |
  //                                       FALSE |
  //                                       NIL |
  //                                       TRUE |
  //                                       matchedExpressionMaxExpression
  public static boolean matchedExpressionAccessExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionAccessExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, "<matched expression access expression>");
    r = numberUnaryOperation(b, l + 1);
    if (!r) r = matchedExpressionAccessExpression_1(b, l + 1);
    if (!r) r = consumeTokenSmart(b, CHAR_TOKEN);
    if (!r) r = number(b, l + 1);
    if (!r) r = list(b, l + 1);
    if (!r) r = binaryString(b, l + 1);
    if (!r) r = listString(b, l + 1);
    if (!r) r = sigil(b, l + 1);
    if (!r) r = consumeTokenSmart(b, FALSE);
    if (!r) r = consumeTokenSmart(b, NIL);
    if (!r) r = consumeTokenSmart(b, TRUE);
    if (!r) r = matchedExpressionMaxExpression(b, l + 1);
    exit_section_(b, l, m, MATCHED_EXPRESSION_ACCESS_EXPRESSION, r, false, null);
    return r;
  }

  // OPENING_PARENTHESIS EOL* SEMICOLON EOL* CLOSING_PARENTHESIS
  private static boolean matchedExpressionAccessExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionAccessExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, OPENING_PARENTHESIS);
    r = r && matchedExpressionAccessExpression_1_1(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    r = r && matchedExpressionAccessExpression_1_3(b, l + 1);
    r = r && consumeToken(b, CLOSING_PARENTHESIS);
    exit_section_(b, m, null, r);
    return r;
  }

  // EOL*
  private static boolean matchedExpressionAccessExpression_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionAccessExpression_1_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeTokenSmart(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionAccessExpression_1_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean matchedExpressionAccessExpression_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedExpressionAccessExpression_1_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeTokenSmart(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchedExpressionAccessExpression_1_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

}
