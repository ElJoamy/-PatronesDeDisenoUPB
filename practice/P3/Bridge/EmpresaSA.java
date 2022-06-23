public class EmpresaSA implements ICompany {
    private ISend send;
    private double price;
    private String nombre;

    public EmpresaSA(ISend send, String nombre, double price) {
        this.send = send;
        this.nombre = nombre;
        this.price = price;
    }

    @Override
    public void infSend() {
        double incremento = price + send.send(price);
        System.out.println("Empresa SRL donde el paquete es: " + nombre);
        System.out.println("El precio del paquete es de: " + price);
        System.out.println("El precio del envio es de: " + incremento);
        System.out.println("<---------------------------------------------------->"); 
    }

}