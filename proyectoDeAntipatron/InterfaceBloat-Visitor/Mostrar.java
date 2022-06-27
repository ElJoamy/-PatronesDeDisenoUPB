public class Mostrar implements IBloat
{
    public Mostrar() {
    }
    @Override
     public void bloat(Factura fact )
    {
        System.out.println("=========================");
        System.out.println( "Factura número [" + fact.getCodigo() + "]" );
    }
    @Override
     public void bloat(Articulo art )
    {
        System.out.println( "Artículo [" + art.getNombre() + "] --> [" + art.getUnidades() + "] unidades)" );
    }
}