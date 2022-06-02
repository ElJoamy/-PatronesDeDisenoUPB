public class Cliente {
    public static void main(String[] args) {
        Builder Ellis = new Builder();
        pizzaBuilder pizzaC = new PizzaC();
        pizzaBuilder PizzaH = new PizzaH();
        pizzaBuilder PizzaCl = new PizzaCl();

        Ellis.setBuilder(pizzaC);
        Ellis.pL();
        Pizza p1 = Ellis.getPL();
        p1.showInfo();


        Ellis.setBuilder(PizzaH);
        Ellis.pL();
        Pizza p2 = Ellis.getPL();
        p2.showInfo();


        Ellis.setBuilder(PizzaCl);
        Ellis.pL();
        Pizza p3 = Ellis.getPL();
        p3.showInfo();
    }
}
