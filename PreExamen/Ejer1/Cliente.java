package Ejer1;

public class Cliente {
    public static void main(String[] args){
        Cajero pedro = new Cajero();
        pedro.setNombre("Perdro Parker");
        pedro.setCodigo("PP001");

        Ventanilla ventanilla = new Ventanilla(pedro);
        ventanilla.iniciarSesionCajero();
        ventanilla.mostrarDinero();
        ventanilla.pagarMatricula(351);
        ventanilla.pagarMatricula(90);
        ventanilla.pagarMatricula(510);
        ventanilla.pagarMatricula(287);
        ventanilla.pagarMatricula(50);
        ventanilla.mostrarDinero();
    }
}
