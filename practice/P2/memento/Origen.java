public class Origen {
    private BDD state;

    public void setMemento(BDD state){
        this.state = state;
    }

    public Memento createMemento(){
        return new Memento(state);
    }

    public BDD restaurarMemento(Memento memento){
        this.state = memento.getState();
        return memento.getState();
    }
}
