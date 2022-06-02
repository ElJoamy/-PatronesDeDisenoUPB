public class PizzaC extends pizzaBuilder {

    @Override
    public void buildI() {
        this.pizza.setI("carne, salsa tomate, otro");
    }

    @Override
    public void buildTM() {
        this.pizza.setTM("masa especial");
    }

    @Override
    public void buildTQ() {
        this.pizza.setTQ("quezo mozarella");
    }
}