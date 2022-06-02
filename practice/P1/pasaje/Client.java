package factoryMethod.practice.pasaje;

public class Client {
    public static void main (String []args){
        Pasajero juan = new Pasajero();
        juan.setNombre("Juan valdiveso");
        juan.setCi("1234567 Lp");
        PasajeInfante p1 = (PasajeInfante) new CreatorPasajeInfante().createProduct();
        p1.setPasajero(juan);
        p1.setNumeroAsiento("23B");
        p1.showInfo();

        Pasajero jorge = new Pasajero();
        jorge.setNombre("Jorge Luis Gonzales ");
        jorge.setCi("1234568 Lp");
        PasajeInfante p2 = (PasajeInfante) new CreatorPasajeInfante().createProduct();
        p2.setPasajero(jorge);
        p2.setNumeroAsiento("15A");
        p2.showInfo();

        Pasajero carmen = new Pasajero();
        carmen.setNombre("Carmen Trivia");
        carmen.setCi("12345679 Sc");
        PasajeSolidario p3 = (PasajeSolidario) new CreatorPasajeSolidario().createProduct();
        p3.setPasajero(carmen);
        p3.setNumeroAsiento("1A");
        p3.setMotivoDescuento("3ra Edad");
        p3.setDescuento(35);
        p3.showInfo();

        Pasajero julia = new Pasajero();
        julia.setNombre("Julia Perez");
        julia.setCi("1234560 Sc");
        PasajeSolidario p4 = (PasajeSolidario) new CreatorPasajeSolidario().createProduct();
        p4.setPasajero(julia);
        p4.setNumeroAsiento("19D");
        p4.setMotivoDescuento("Capacidades diferentes");
        p4.setDescuento(25);
        p4.showInfo();

        Pasajero drax = new Pasajero();
        drax.setNombre("Drx el Destructor");
        drax.setCi("12345671 Lp");
        PasajeStandart p5 = (PasajeStandart) new CreatorPasajeStandart().createProduct();
        p5.setPasajero(drax);
        p5.setNumeroAsiento("25D");
        p5.showInfo();

        Pasajero manuel = new Pasajero();
        manuel.setNombre("Manuel Jordan");
        manuel.setCi("1234562 Lp");
        PasajeStandart p6 = (PasajeStandart) new CreatorPasajeStandart().createProduct();
        p6.setPasajero(manuel);
        p6.setNumeroAsiento("11C");
        p6.showInfo();
    }
}
