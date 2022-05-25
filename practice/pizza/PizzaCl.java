public class PizzaCl extends pizzaBuilder {
    @Override
    public void buildI() {
        this.pizza.setI("salsa tomate, otro");
    }

    @Override
    public void buildTM() {
        this.pizza.setTM("masa especial");
    }

    @Override
    public void buildTQ() {
        this.pizza.setTQ("doble quezo mozarella tipo2");
    }
}
