import java.util.ArrayList;
import java.util.List;

public class Controls {
    private List<ICommand> commands = new ArrayList<>();

    public Controls(){}

    public void addCommand(ICommand command){
        commands.add(command);
    }

    public void runCommand(){
        for(ICommand command : commands){
            command.execute();
        }
        commands.clear();
    }
}
