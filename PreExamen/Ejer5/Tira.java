public class Tira extends BuilderCarne{
    @Override
    public void buildTipoDeCarne() {
        carne.setTipoDeCarne("Tira de res");
    }

    @Override
    public void buildSaborRefresco() {
        carne.setSaborRefresco("Coca Cola");
    }

    @Override
    public void buildGuarniciones() {
        carne.setGuarniciones("Fideo");
    }
}
