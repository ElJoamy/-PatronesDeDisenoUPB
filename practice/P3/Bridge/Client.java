public class Client {
    public static void main(String[] args) {
        Person person = new Person("Aiden", 7895215, 13579);
        Tierra tierra = new Tierra();
        Aire aire = new Aire();
        Mar mar = new Mar();
        
        EmpresaSA eSa1 = new EmpresaSA(aire, "Suzuki 0km", 2500);
        EmpresaSA eSa2 = new EmpresaSA(tierra, "Juego de cocteleria", 25);
        EmpresaSA eSa3 = new EmpresaSA(mar, "Contenedor de partes de computadora", 5000);
        EmpresaSRL eSrl1 = new EmpresaSRL(aire, "Maletas", 150);
        EmpresaSRL eSrl2 = new EmpresaSRL(tierra, "Coleccion de Transformers G1", 50);
        EmpresaSRL eSrl3 = new EmpresaSRL(mar, "Contenedores de juguetes", 3000);

        person.showInfo();
        eSa1.infSend();
        person.showInfo();
        eSa2.infSend();
        person.showInfo();
        eSa3.infSend();
        person.showInfo();
        eSrl1.infSend();
        person.showInfo();
        eSrl2.infSend();
        person.showInfo();
        eSrl3.infSend();
    }
}
