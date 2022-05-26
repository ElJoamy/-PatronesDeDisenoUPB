public class Cliente {
    public static void main(String[] args){
        String msg1 = "1 2 3 4 5 6 7 8 9 10";
        Expresion parser1 = new Expresion(msg1);
        System.out.println("Mensaje interpretado: " + parser1.evaluateMsg());
        System.out.println();

        String msg2 = "1 5";
        Expresion parser2 = new Expresion(msg2);
        System.out.println("Mensaje interpretado: " + parser2.evaluateMsg());
        System.out.println();

    }
}