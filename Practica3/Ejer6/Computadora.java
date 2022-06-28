public class Computadora implements IDispositivo {
    private String modelo;
    private int memoria;
    private Double pantalla;
    private int camara;
    private int bateria;
    private int RAM;

    public Computadora(String modelo, int memoria, Double pantalla, int camara, int bateria, int RAM) {
        this.modelo = modelo;
        this.memoria = memoria;
        this.pantalla = pantalla;
        this.camara = camara;
        this.bateria = bateria;
        this.RAM = RAM;
    }

    @Override
    public void showInfo() {
        System.out.println("<------- INFO DE LA COMPUTADORA ------->");
        System.out.println("Modelo: " + modelo);
        System.out.println("Memoria: " + memoria + " GB");
        System.out.println("Pantalla: " + pantalla + " pulgadas");
        System.out.println("Camara: " + camara + " MP");
        System.out.println("Bateria: " + bateria + " mAh");
        System.out.println("RAM: " + RAM + " GB");
        System.out.println();
    }
}
