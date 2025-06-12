import java_cup.runtime.Symbol;

%%

%class JsonLexer
%unicode
%cup
%line
%column

%{

// Qualquer código Java que você quiser usar no scanner pode ir aqui.
// Por exemplo, métodos auxiliares para criar símbolos:

private Symbol symbol(int type) {
    return new Symbol(type, yyline, yycolumn);
}

private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline, yycolumn, value);
}

%}

%%

// Regras do lexer aqui, por exemplo:

"true"      { return symbol(sym.TRUE, Boolean.TRUE); }
"false"     { return symbol(sym.FALSE, Boolean.FALSE); }
"null"      { return symbol(sym.NULL, null); }
\"([^\"\\]|\\.)*\"   { return symbol(sym.STRING, yytext()); }
[0-9]+(\.[0-9]+)?    { return symbol(sym.NUMBER, Double.valueOf(yytext())); }
"{"         { return symbol(sym.LBRACE); }
"}"         { return symbol(sym.RBRACE); }
"["         { return symbol(sym.LBRACK); }
"]"         { return symbol(sym.RBRACK); }
":"         { return symbol(sym.COLON); }
","         { return symbol(sym.COMMA); }

[ \t\n\r]+  { /* ignora espaços em branco */ }

.           { throw new Error("Caractere ilegal: " + yytext()); }
