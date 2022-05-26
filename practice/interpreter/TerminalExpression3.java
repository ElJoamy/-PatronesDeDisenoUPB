public class TerminalExpression3 extends AbstractExpression{
    /* Si en el mensaje (input) encontramos el número 3, lo reemplazamos por III (output) */
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("3")){
            context.output = context.output + "III";
            context.input = context.input.substring(1);
        }
    }
}
