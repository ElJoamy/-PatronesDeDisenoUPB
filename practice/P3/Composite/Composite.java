import java.util.ArrayList;

public class Composite extends Component {
    private double price = 0;

    private ArrayList<Component> list = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public double getPrice() {
        price=0;
        for (Component comp: list ) {
            price = price + comp.getPrice();
        }
        System.out.println("Del " + this.getName() + " el precio es de: $." + this.price);
        return price;
    }
}