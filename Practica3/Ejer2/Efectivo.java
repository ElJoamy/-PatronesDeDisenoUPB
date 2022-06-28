public class Efectivo implements IPago {

    @Override
    public void pay(Double monto) {
        System.out.println("<---Se esta pagando en efectivo--->");
        System.out.println("Precio total: Bs." + monto);
        System.out.println("<==========================================>");
        System.out.println();
    }
}
