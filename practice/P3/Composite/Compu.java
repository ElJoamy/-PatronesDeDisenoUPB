public class Compu extends Component {
    private double price  = 100;

    public Compu(String name){
        super(name);
    }

    @Override
    public void add(Component component) {
    }

    @Override
    public double getPrice() {
        return price;
    }

}