public class Cabo implements IEjercito{
    private IEjercito next;
    @Override
    public void setNext(IEjercito handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(String amount) {
        if (amount.equals("Limpiezas")){
            System.out.println("Cabo esta: " + amount);
        } else {
            next.criteriaHandler(amount);
        }
    }

    @Override
    public IEjercito next() {
        return next;
    }
}
