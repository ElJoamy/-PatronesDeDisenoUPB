public class Transferencia implements IPago {

    @Override
    public void pay(Double monto) {
        System.out.println("<---Se esta pagando con Transferencia--->");
        double descuento = monto - monto * 0.05;
        System.out.println("Precio total: Bs." + monto);
        System.out.println("Precio con descuento: Bs." + descuento);
        System.out.println("<==========================================>");
        System.out.println();
    }
}
