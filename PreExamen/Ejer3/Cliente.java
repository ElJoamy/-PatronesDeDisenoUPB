public class Cliente {
    /*Si se habre desde VSC el run que aparece debajo del class confunde con otros CLIENTE, depreferencia solo haer correr de otra manera la clase Cliente del Ejer3 */
    public static void main(String[] args){
        KitEscolar kitE = new CreatorKitEscolar().createKit();
        kitE.showInfo();

        KitColegial kitC = new CreatorKitColegial().createKit();
        kitC.showInfo();
    }
}
