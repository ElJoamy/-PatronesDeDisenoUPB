public class PizzaH extends pizzaBuilder {

    @Override
    public void buildI() {
        this.pizza.setI("pina, salsa tomat, otro");
    }

    @Override
    public void buildTM() {
        this.pizza.setTM("masa normal");
    }

    @Override
    public void buildTQ() {
        this.pizza.setTQ("queo mozarella tipo2");
    }
}
