public class Client {
    public static void main(String[] args) {
        Tienda tienda=new Tienda();
        tienda.addCelular(new Celulares("J3","Samsung","Baja",1500));
        tienda.addCelular(new Celulares("P40","Huawei","Media",2100));
        tienda.addCelular(new Celulares("Nokia","Nokia","Alta",20220));


        tienda.setStrategy(new cdsmb(20220));
        tienda.start();
        System.out.println();
        tienda.setStrategy(new cdspb(1500));
        tienda.start();
        tienda.setStrategy(new cdspp("Samsung"));
        tienda.start();
        tienda.setStrategy(new cdspc(2100, "Huawei"));
        tienda.start();
    }
}
