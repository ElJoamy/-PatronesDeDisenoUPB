import java.util.ArrayList;

public class Composite extends Component {
    private int cantidad = 0;
    private ArrayList<Component> list = new ArrayList<>();

    public Composite(String type) {
        super(type);
    }

    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public int getWords() {
        for (Component comp: list ) {
            cantidad = cantidad + comp.getWords();
        }
            System.out.println("Nombre: "+ this.getType());
            System.out.println("Cantidad de palabras: "+ this.cantidad);
            System.out.println();
        return cantidad;
    }
}
