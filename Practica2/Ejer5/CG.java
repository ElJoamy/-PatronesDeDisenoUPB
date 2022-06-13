import java.util.ArrayList;
import java.util.List;

public class CG implements ICanal{
    private List<IUser> users= new ArrayList<>();

    public CG(){}

    @Override
    public void attach(IUser observer) {
        users.add(observer);
    }

    @Override
    public void detach(int position) {
        users.remove(position);
    }

    @Override
    public void notifyObservers() {
        for (IUser user:users ) {
                user.update("Hay cambios nuevos en el codgo");
        }
    } 
}
