public class ManagerEjercito implements IEjercito {
    private IEjercito next;

    @Override
    public void setNext(IEjercito handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(String amount) {
        Cabo o1= new Cabo();
        this.setNext(o1);

        Coronel o2 = new Coronel();
        o1.setNext(o2);

        Teniente o3 = new Teniente();
        o2.setNext(o3);

        Gneral o4 = new Gneral();
        o3.setNext(o4);

        this.next.criteriaHandler(amount);
    }

    @Override
    public IEjercito next() {
        return next;
    }
}
