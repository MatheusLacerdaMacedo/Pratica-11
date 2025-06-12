/* Definição: seção para código do usuário. */

%{
import java_cup.runtime.Symbol;
%}

%%

/* Opções e Declarações: seção para diretivas e macros. */

// Diretivas:
%cup
%unicode
%line
%column
%class MeuScanner

// Macros:
digito = [0-9]
inteiro = {digito}+
decimal = {inteiro}"."{digito}+
letra = [a-zA-Z]
id = {letra}({letra}|[0-9]|_)*

%%

/* Regras e Ações Associadas: seção de instruções para o analisador léxico. */

"select"      { return new Symbol(sym.SELECT, yyline, yycolumn); }
"from"        { return new Symbol(sym.FROM, yyline, yycolumn); }
"where"       { return new Symbol(sym.WHERE, yyline, yycolumn); }
"and"         { return new Symbol(sym.AND, yyline, yycolumn); }
"or"          { return new Symbol(sym.OR, yyline, yycolumn); }

"="           { return new Symbol(sym.EQ, yyline, yycolumn); }
"<>"          { return new Symbol(sym.NEQ, yyline, yycolumn); }
"<="          { return new Symbol(sym.LE, yyline, yycolumn); }
"<"           { return new Symbol(sym.LT, yyline, yycolumn); }
">="          { return new Symbol(sym.GE, yyline, yycolumn); }
">"           { return new Symbol(sym.GT, yyline, yycolumn); }

","           { return new Symbol(sym.COMMA, yyline, yycolumn); }
";"           { return new Symbol(sym.SEMICOLON, yyline, yycolumn); }
"*"           { return new Symbol(sym.STAR, yyline, yycolumn); }

[ \t\r\n]+    { /* Ignora espaços e quebras de linha */ }

{id}          { return new Symbol(sym.ID, yyline, yycolumn, yytext()); }

\'[^\']*\'    { 
                String texto = yytext().substring(1, yytext().length() - 1);
                return new Symbol(sym.STRING, yyline, yycolumn, texto);
              }

{decimal}     { return new Symbol(sym.NUMBER, yyline, yycolumn, Double.parseDouble(yytext())); }
{inteiro}     { return new Symbol(sym.NUMBER, yyline, yycolumn, Double.parseDouble(yytext())); }

.             { System.err.println("\nCaractere inválido: " + yytext() +
                                  "\nLinha: " + yyline +
                                  "\nColuna: " + yycolumn + "\n");
                return null; 
              }
