public class Memento {
    private BDD state;
    
    public Memento(BDD bdd) {
        state = bdd;
    }

    public BDD getState() {
        return state;
    }
}
