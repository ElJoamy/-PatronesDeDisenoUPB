public class CreatorKitColegial extends Creator {
    @Override
    public KitColegial createKit() {
        Mochila mochila = new Mochila();
        mochila.setSize("Grande");
        mochila.setNroBolsillos(5);

        Libro libro = new Libro();
        libro.setGenero("Musica");
        libro.setAutor("Fermin Roque");

        Computadora computadora = new Computadora();
        computadora.setMarca("HP");
        computadora.setOs("Windows 11");

        KitColegial kit2 = new KitColegial(mochila, libro, computadora);

        return kit2;
    }
}
