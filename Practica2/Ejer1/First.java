public class First {
    private Estudiante state;

    public Memento createMemento() {
        return new Memento(state);
    }

    public void setMemento(Estudiante state) {
        this.state = state;
    }

    public Estudiante restoreMemento(Memento mem) {
        System.out.println("...restoring...");
        this.state = mem.getState();
        return this.state;
    } 
}
