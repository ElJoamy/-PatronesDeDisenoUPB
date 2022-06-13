import java.util.HashMap;
import java.util.Map;

public class Create {
    private Map<String,Memento> theTesis=new HashMap<>();
    public void createTesis(String tesis,Memento memento){
        theTesis.put(tesis,memento);
    }

    public Memento getTesis(String tesis){

        return theTesis.get(tesis);
    }
}
