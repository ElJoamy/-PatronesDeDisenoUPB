public class Coronel implements IEjercito{
    private IEjercito next;
    @Override
    public void setNext(IEjercito handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(String amount) {
        if (amount.equals("Manifestaciones,Limpiezas")){
            System.out.println("Coronel esta: " + amount);
        } else {
            next.criteriaHandler(amount);
        }
    }

    @Override
    public IEjercito next() {
        return next;
    }
}
