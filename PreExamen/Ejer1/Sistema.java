package Ejer1;

public class Sistema {
    private static Sistema instance;
    private int montoExistente = 0;
    private Sistema() {
        System.out.println("Hay " + montoExistente + "Bs en la cuenta");
    }

    public static Sistema getInstance(){
        if (instance== null)
            instance= new Sistema();
        return instance;
    }

    public void recibirDinero(int montoRecibido){
        System.out.println("Recibido: " + montoRecibido);
        montoExistente = montoExistente + montoRecibido;
        mostrarMontoActual();
    }

    public void iniciarSesion(String nombre, String codigo){
        System.out.println("Cajero: " + nombre);
        System.out.println("Código: " + codigo);
    }

    public void mostrarMontoActual(){
        System.out.println("Existente: " + montoExistente);
    }
}
