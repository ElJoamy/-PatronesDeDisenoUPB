public class TigoMoney implements IPago {
    
    @Override
    public void pay(Double monto) {
        System.out.println("<---Se esta pagando con TigoMoney--->");
        double descuento = monto - monto * 0.02;
        System.out.println("Precio total: Bs." + monto);
        System.out.println("Precio con descuento: Bs." + descuento);
        System.out.println("<==========================================>");
        System.out.println();
    }
}
