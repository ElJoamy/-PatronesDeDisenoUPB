public class Builder {
    private pizzaBuilder builder;

    public Pizza getPL(){
        return builder.getProduct();
    }

    public void setBuilder(pizzaBuilder builder){
        this.builder=builder;
    }

    public void pL(){
        this.builder.preparar();
        this.builder.buildI();
        this.builder.buildTM();
        this.builder.buildTQ();
    }     
}
