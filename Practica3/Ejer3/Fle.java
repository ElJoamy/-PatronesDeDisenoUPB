public class Fle extends Component {
    private String text;
    
    public Fle(String type, String text){
        super(type);
        this.text = text;
    }

    @Override
    public void add(Component component) {
    }

    @Override
    public int getWords() {
        String[] words = text.split("\\s+");
        return words.length;
    }


}
