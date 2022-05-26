import java.util.ArrayList;
import java.util.List;

public class Expresion {
    private List<AbstractExpression> grammar =new ArrayList<>();
    private Context context;

    public Expresion(String msgToInterpret) {
        context = new Context(msgToInterpret);
        for (String charOriginal : msgToInterpret.split("")) {
            switch (charOriginal){
                case "0":
                    grammar.add(new TerminalExpression0());
                    break;
                case "1":
                    grammar.add(new TerminalExpression1());
                    break;
                case "2":
                    grammar.add(new TerminalExpression2());
                    break;
                case "3":
                    grammar.add(new TerminalExpression3());
                    break;
                case "4":
                    grammar.add(new TerminalExpression4());
                    break;
                case "5":
                    grammar.add(new TerminalExpression5());
                    break;
                case "6":
                    grammar.add(new TerminalExpression6());
                    break;
                case "7":
                    grammar.add(new TerminalExpression7());
                    break;
                case "8":
                    grammar.add(new TerminalExpression8());
                    break;
                case "9":
                    grammar.add(new TerminalExpression9());
                    break;
                case " ":
                    grammar.add(new TerminalSpace());
                    break;
                default:
                    break;
            }
        }
    }

    public String evaluateMsg(){
        for (AbstractExpression expression:grammar) {
            expression.interpreter(context);
        }
        return context.output;
    }
}
