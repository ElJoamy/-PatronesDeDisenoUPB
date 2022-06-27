import java.util.ArrayList;

public class Factura implements IElemento{
    int codigo;
    ArrayList<Articulo> articulos = new ArrayList<Articulo>();
    public Factura( int codigo ){
        this.setCodigo( codigo );
    }

    public int getCodigo(){
        return this.codigo;
    }

    public void setCodigo( int codigo ){
        this.codigo = codigo;
    }

    public void agregarArticulo(Articulo art){
        this.articulos.add( art );
    }

    @Override
     public void accept( IBloat bloat ){
        // Procesar el visitor para la factura
        bloat.bloat(this);
        // Procesar el visitor para cada artículo en la factura
        for(Articulo art : this.articulos ){
             art.accept(bloat);
        }
    }
}