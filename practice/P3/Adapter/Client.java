public class Client {
    public static void main(String[] args) {
        IArtefactos celular = new Celulares(2500, "3 año");
        celular.showPrecio();
        celular.showTiempo();

        IArtefactos tablet = new Tablets(4200, "2 año");
        tablet.showPrecio();
        tablet.showTiempo();

        IArtefactos computadora = new Computadoras(6500, "6 años");
        computadora.showPrecio();
        computadora.showTiempo();

        IArtefactos televisor = new AdaptadorArtefactos(new Televisores(700, "1 año"));
        televisor.showPrecio();
        televisor.showTiempo();

        IArtefactos lavadora = new AdaptadorArtefactos(new Lavadoras(1000, "8 meses"));
        lavadora.showPrecio();
        lavadora.showTiempo();

        IArtefactos refrigerador = new AdaptadorArtefactos(new Refrigeradores(2500, "11 meses"));
        refrigerador.showPrecio();
        refrigerador.showTiempo();
    }
}
