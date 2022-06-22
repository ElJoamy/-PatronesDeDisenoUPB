public class Client {
    public static void main(String[]args){
        Account account = new Account(01234567, 10000, new Person("Aiden", 7775648, 1234587));

        CardProxy card = new CardProxy(account);
        Pay pago1 = new Pay("Pavos pal fronais", "$", 500);
        Pay pago2 = new Pay("Comida para perros", "bs", 350);
        Pay pago3 = new Pay("Pago online de tarjeta grafica", "eu", 100);
        Pay pago4 = new Pay("Transferencia a banco de Rusia", "$", 150);
        Pay pago5 = new Pay("Pago de clases en el extrangero", "eu", 250);
        Pay pago6 = new Pay("Pago de servicios", "bs", 100);

        card.compra(pago1);
        card.compra(pago2);
        card.compra(pago3);
        card.compra(pago4);
        card.compra(pago5);
        card.compra(pago6);
    }

}
