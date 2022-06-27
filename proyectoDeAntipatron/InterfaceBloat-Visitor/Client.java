public class Client{
    public static void main(String[] args){
        GrupoFacturas grupo = new GrupoFacturas();

        Factura fact1 = new Factura( 1 );
        fact1.agregarArticulo( new Articulo("Tornillos", 40) );
        fact1.agregarArticulo( new Articulo("Tuercas", 80) );
        fact1.agregarArticulo( new Articulo("Taladros", 65) );

        Factura fact2 = new Factura( 2 );
        fact2.agregarArticulo( new Articulo("Martillos", 30) );
        fact2.agregarArticulo( new Articulo("Linternas", 90) );

        grupo.agregarFactura( fact1 );
        grupo.agregarFactura( fact2 );
        grupo.accept( new Mostrar() );
    }
}
