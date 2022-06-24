public class Client {
    public static void main(String []args){
        System.out.println("<------------------------------------>");
        Composite lab1 = new Composite("LABORATORIO-1");
        lab1.add(new Compu("Computadora 01"));
        lab1.add(new Compu("Computadora 02"));
        lab1.add(new Compu("Computadora 03"));
        lab1.add(new Compu("Computadora 04"));
        lab1.getPrice();
        System.out.println();
        System.out.println("<------------------------------------>");

        Composite lab2 = new Composite("LABORATORIO-2");
        lab2.add(new Compu("Computadora 01"));
        lab2.add(new Compu("Computadora 02"));
        lab2.add(new Compu("Computadora 03"));
        lab2.getPrice();
        System.out.println();
        System.out.println("<------------------------------------>");

        Composite lab3 = new Composite("LABORATORIO-3");
        lab3.add(new Compu("Computadora 01"));
        lab3.add(new Compu("Computadora 02"));
        lab3.add(new Compu("Computadora 03"));
        lab3.add(new Compu("Computadora 04"));
        lab3.add(new Compu("Computadora 05"));
        lab3.getPrice();
        System.out.println();
        System.out.println("<------------------------------------>");

        Composite contenedor = new Composite("CONTENEDOR");
        contenedor.add(lab1);
        contenedor.add(lab2);
        contenedor.add(lab3);
        contenedor.getPrice();
        System.out.println();
    }
}