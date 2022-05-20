package singleton.cambioDeMoneda;

public class ClientCambioDeMoneda {

    public static void main(String[] args) {

        Banco banco1 = new Banco("BNB");
        Banco banco2 = new Banco("VISA");

        CasaDeCambio casa1 = new CasaDeCambio("Money Exchnge");
        CasaDeCambio casa2 = new CasaDeCambio("Prendamas");

        LibreCambista libre1 = new LibreCambista("gilberto");
        LibreCambista libre2 = new LibreCambista("armando");

        banco1.cambiarBolivianosADolares(50);
        banco2.cambiarDolaresABolivianos(350);
        casa1.cambiarBolivianosAEuros(5734);
        casa2.cambiarEurosABolivianos(100);
        libre1.cambiarDolaresAEuros(1250);
        libre2.cambiarEurosADolares(934);



    }

}
