import java.util.ArrayList;
import java.util.List;

public class Servidor2 implements IServdor {
    private List<User> userL;

    public Servidor2() {
        userL = new ArrayList<>();
    }

    @Override
    public void login(User user) {
        userL.add(user);
    }

    @Override
    public void userServe() {
        for (User user:userL) {
            System.out.println("Servidor2 va a atender al usuario " + user.getNro());
            user.showInfo();
        }
    }
}
