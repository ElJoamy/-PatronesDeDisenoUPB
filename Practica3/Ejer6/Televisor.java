public class Televisor implements IDispositivo {
    private String modelo;
    private int size;
    private Double resolucion;
    private int RAM;
    private int HDMI;
    private int USB;

    public Televisor(String modelo, int size, Double resolucion, int RAM, int HDMI, int USB) {
        this.modelo = modelo;
        this.size = size;
        this.resolucion = resolucion;
        this.RAM = RAM;
        this.HDMI = HDMI;
        this.USB = USB;
    }
    
    @Override
    public void showInfo() {
        System.out.println("<------- INFO DEL TELEVISOR ------->");
        System.out.println("Modelo: " + modelo);
        System.out.println("Tamaño: " + size + " pulgadas");
        System.out.println("Resolución: " + resolucion + " MP");
        System.out.println("RAM: " + RAM + " GB");
        System.out.println("HDMI: " + HDMI);
        System.out.println("USB: " + USB);
        System.out.println();
    }
}
