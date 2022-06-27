public class Articulo implements IElemento{
    private String nombre = "";
    private int unidades;

    public Articulo( String nombre, int unidades ){
        this.setNombre( nombre );
        this.setUnidades( unidades );
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getUnidades(){
        return this.unidades;
    }

    public void setUnidades(int unidades){
        this.unidades = unidades;
    }

    @Override
     public void accept(IBloat bloat){
        bloat.bloat(this);
    }
}