
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class MeuParser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public MeuParser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public MeuParser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public MeuParser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\024\000\002\002\004\000\002\002\010\000\002\006" +
    "\002\000\002\006\004\000\002\003\003\000\002\003\003" +
    "\000\002\004\003\000\002\004\005\000\002\005\003\000" +
    "\002\007\003\000\002\007\005\000\002\007\005\000\002" +
    "\010\005\000\002\010\005\000\002\010\005\000\002\010" +
    "\005\000\002\010\005\000\002\010\005\000\002\011\003" +
    "\000\002\011\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\045\000\004\004\005\001\002\000\004\002\047\001" +
    "\002\000\006\021\007\022\006\001\002\000\006\005\ufffb" +
    "\017\045\001\002\000\004\005\ufffd\001\002\000\004\005" +
    "\ufffc\001\002\000\004\005\012\001\002\000\004\022\013" +
    "\001\002\000\006\006\ufff9\020\ufff9\001\002\000\006\006" +
    "\015\020\uffff\001\002\000\004\022\020\001\002\000\004" +
    "\020\017\001\002\000\004\002\000\001\002\000\016\011" +
    "\030\012\034\013\027\014\032\015\031\016\033\001\002" +
    "\000\004\020\ufffe\001\002\000\010\007\023\010\024\020" +
    "\ufff8\001\002\000\004\022\020\001\002\000\004\022\020" +
    "\001\002\000\004\020\ufff6\001\002\000\004\020\ufff7\001" +
    "\002\000\006\023\035\024\036\001\002\000\006\023\035" +
    "\024\036\001\002\000\006\023\035\024\036\001\002\000" +
    "\006\023\035\024\036\001\002\000\006\023\035\024\036" +
    "\001\002\000\006\023\035\024\036\001\002\000\010\007" +
    "\uffef\010\uffef\020\uffef\001\002\000\010\007\uffee\010\uffee" +
    "\020\uffee\001\002\000\010\007\ufff4\010\ufff4\020\ufff4\001" +
    "\002\000\010\007\ufff0\010\ufff0\020\ufff0\001\002\000\010" +
    "\007\ufff2\010\ufff2\020\ufff2\001\002\000\010\007\ufff1\010" +
    "\ufff1\020\ufff1\001\002\000\010\007\ufff5\010\ufff5\020\ufff5" +
    "\001\002\000\010\007\ufff3\010\ufff3\020\ufff3\001\002\000" +
    "\004\022\006\001\002\000\004\005\ufffa\001\002\000\004" +
    "\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\045\000\004\002\003\001\001\000\002\001\001\000" +
    "\006\003\010\004\007\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\005" +
    "\013\001\001\000\002\001\001\000\004\006\015\001\001" +
    "\000\006\007\020\010\021\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\006\007\025\010\021\001\001\000\006\007" +
    "\024\010\021\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\011\043\001\001\000\004\011\042\001\001\000" +
    "\004\011\041\001\001\000\004\011\040\001\001\000\004" +
    "\011\037\001\001\000\004\011\036\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\004\045\001\001\000\002\001\001" +
    "\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$MeuParser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$MeuParser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$MeuParser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$MeuParser$actions {
  private final MeuParser parser;

  /** Constructor */
  CUP$MeuParser$actions(MeuParser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$MeuParser$do_action_part00000000(
    int                        CUP$MeuParser$act_num,
    java_cup.runtime.lr_parser CUP$MeuParser$parser,
    java.util.Stack            CUP$MeuParser$stack,
    int                        CUP$MeuParser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$MeuParser$result;

      /* select the action based on the action number */
      switch (CUP$MeuParser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= query EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$MeuParser$stack.elementAt(CUP$MeuParser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$MeuParser$stack.elementAt(CUP$MeuParser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$MeuParser$stack.elementAt(CUP$MeuParser$top-1)).value;
		RESULT = start_val;
              CUP$MeuParser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$MeuParser$stack.elementAt(CUP$MeuParser$top-1)), ((java_cup.runtime.Symbol)CUP$MeuParser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$MeuParser$parser.done_parsing();
          return CUP$MeuParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // query ::= SELECT select_list FROM table_name where_clause_opt SEMICOLON 
            {
              Object RESULT =null;

              CUP$MeuParser$result = parser.getSymbolFactory().newSymbol("query",0, ((java_cup.runtime.Symbol)CUP$MeuParser$stack.elementAt(CUP$MeuParser$top-5)), ((java_cup.runtime.Symbol)CUP$MeuParser$stack.peek()), RESULT);
            }
          return CUP$MeuParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // where_clause_opt ::= 
            {
              Object RESULT =null;

              CUP$MeuParser$result = parser.getSymbolFactory().newSymbol("where_clause_opt",4, ((java_cup.runtime.Symbol)CUP$MeuParser$stack.peek()), RESULT);
            }
          return CUP$MeuParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // where_clause_opt ::= WHERE where_clause 
            {
              Object RESULT =null;

              CUP$MeuParser$result = parser.getSymbolFactory().newSymbol("where_clause_opt",4, ((java_cup.runtime.Symbol)CUP$MeuParser$stack.elementAt(CUP$MeuParser$top-1)), ((java_cup.runtime.Symbol)CUP$MeuParser$stack.peek()), RESULT);
            }
          return CUP$MeuParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // select_list ::= STAR 
            {
              Object RESULT =null;

              CUP$MeuParser$result = parser.getSymbolFactory().newSymbol("select_list",1, ((java_cup.runtime.Symbol)CUP$MeuParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MeuParser$stack.peek()), RESULT);
            }
          return CUP$MeuParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // select_list ::= column_list 
            {
              Object RESULT =null;

              CUP$MeuParser$result = parser.getSymbolFactory().newSymbol("select_list",1, ((java_cup.runtime.Symbol)CUP$MeuParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MeuParser$stack.peek()), RESULT);
            }
          return CUP$MeuParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // column_list ::= ID 
            {
              Object RESULT =null;

              CUP$MeuParser$result = parser.getSymbolFactory().newSymbol("column_list",2, ((java_cup.runtime.Symbol)CUP$MeuParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MeuParser$stack.peek()), RESULT);
            }
          return CUP$MeuParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // column_list ::= ID COMMA column_list 
            {
              Object RESULT =null;

              CUP$MeuParser$result = parser.getSymbolFactory().newSymbol("column_list",2, ((java_cup.runtime.Symbol)CUP$MeuParser$stack.elementAt(CUP$MeuParser$top-2)), ((java_cup.runtime.Symbol)CUP$MeuParser$stack.peek()), RESULT);
            }
          return CUP$MeuParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // table_name ::= ID 
            {
              Object RESULT =null;

              CUP$MeuParser$result = parser.getSymbolFactory().newSymbol("table_name",3, ((java_cup.runtime.Symbol)CUP$MeuParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MeuParser$stack.peek()), RESULT);
            }
          return CUP$MeuParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // where_clause ::= condition 
            {
              Object RESULT =null;

              CUP$MeuParser$result = parser.getSymbolFactory().newSymbol("where_clause",5, ((java_cup.runtime.Symbol)CUP$MeuParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MeuParser$stack.peek()), RESULT);
            }
          return CUP$MeuParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // where_clause ::= condition AND where_clause 
            {
              Object RESULT =null;

              CUP$MeuParser$result = parser.getSymbolFactory().newSymbol("where_clause",5, ((java_cup.runtime.Symbol)CUP$MeuParser$stack.elementAt(CUP$MeuParser$top-2)), ((java_cup.runtime.Symbol)CUP$MeuParser$stack.peek()), RESULT);
            }
          return CUP$MeuParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // where_clause ::= condition OR where_clause 
            {
              Object RESULT =null;

              CUP$MeuParser$result = parser.getSymbolFactory().newSymbol("where_clause",5, ((java_cup.runtime.Symbol)CUP$MeuParser$stack.elementAt(CUP$MeuParser$top-2)), ((java_cup.runtime.Symbol)CUP$MeuParser$stack.peek()), RESULT);
            }
          return CUP$MeuParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // condition ::= ID EQ value 
            {
              Object RESULT =null;

              CUP$MeuParser$result = parser.getSymbolFactory().newSymbol("condition",6, ((java_cup.runtime.Symbol)CUP$MeuParser$stack.elementAt(CUP$MeuParser$top-2)), ((java_cup.runtime.Symbol)CUP$MeuParser$stack.peek()), RESULT);
            }
          return CUP$MeuParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // condition ::= ID NEQ value 
            {
              Object RESULT =null;

              CUP$MeuParser$result = parser.getSymbolFactory().newSymbol("condition",6, ((java_cup.runtime.Symbol)CUP$MeuParser$stack.elementAt(CUP$MeuParser$top-2)), ((java_cup.runtime.Symbol)CUP$MeuParser$stack.peek()), RESULT);
            }
          return CUP$MeuParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // condition ::= ID LT value 
            {
              Object RESULT =null;

              CUP$MeuParser$result = parser.getSymbolFactory().newSymbol("condition",6, ((java_cup.runtime.Symbol)CUP$MeuParser$stack.elementAt(CUP$MeuParser$top-2)), ((java_cup.runtime.Symbol)CUP$MeuParser$stack.peek()), RESULT);
            }
          return CUP$MeuParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // condition ::= ID LE value 
            {
              Object RESULT =null;

              CUP$MeuParser$result = parser.getSymbolFactory().newSymbol("condition",6, ((java_cup.runtime.Symbol)CUP$MeuParser$stack.elementAt(CUP$MeuParser$top-2)), ((java_cup.runtime.Symbol)CUP$MeuParser$stack.peek()), RESULT);
            }
          return CUP$MeuParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // condition ::= ID GT value 
            {
              Object RESULT =null;

              CUP$MeuParser$result = parser.getSymbolFactory().newSymbol("condition",6, ((java_cup.runtime.Symbol)CUP$MeuParser$stack.elementAt(CUP$MeuParser$top-2)), ((java_cup.runtime.Symbol)CUP$MeuParser$stack.peek()), RESULT);
            }
          return CUP$MeuParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // condition ::= ID GE value 
            {
              Object RESULT =null;

              CUP$MeuParser$result = parser.getSymbolFactory().newSymbol("condition",6, ((java_cup.runtime.Symbol)CUP$MeuParser$stack.elementAt(CUP$MeuParser$top-2)), ((java_cup.runtime.Symbol)CUP$MeuParser$stack.peek()), RESULT);
            }
          return CUP$MeuParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // value ::= STRING 
            {
              Object RESULT =null;

              CUP$MeuParser$result = parser.getSymbolFactory().newSymbol("value",7, ((java_cup.runtime.Symbol)CUP$MeuParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MeuParser$stack.peek()), RESULT);
            }
          return CUP$MeuParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // value ::= NUMBER 
            {
              Object RESULT =null;

              CUP$MeuParser$result = parser.getSymbolFactory().newSymbol("value",7, ((java_cup.runtime.Symbol)CUP$MeuParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MeuParser$stack.peek()), RESULT);
            }
          return CUP$MeuParser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$MeuParser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$MeuParser$do_action(
    int                        CUP$MeuParser$act_num,
    java_cup.runtime.lr_parser CUP$MeuParser$parser,
    java.util.Stack            CUP$MeuParser$stack,
    int                        CUP$MeuParser$top)
    throws java.lang.Exception
    {
              return CUP$MeuParser$do_action_part00000000(
                               CUP$MeuParser$act_num,
                               CUP$MeuParser$parser,
                               CUP$MeuParser$stack,
                               CUP$MeuParser$top);
    }
}

}
