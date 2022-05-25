public abstract class pizzaBuilder {
    protected Pizza pizza;

    public Pizza getProduct(){
        return pizza;
    }
    public void preparar(){
        this.pizza = new Pizza();
    }

    public abstract void buildI();
    public abstract void buildTM();
    public abstract void buildTQ();

}
