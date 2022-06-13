import java.util.HashMap;
import java.util.Map;

public class Github {
    private Map<String,Memento> commits= new HashMap<>();

    public void createCommit(String formatC,Memento m){
        commits.put(formatC,m);
    }

    public Memento getCommit(String formatC){

        return commits.get(formatC);
    }
}
