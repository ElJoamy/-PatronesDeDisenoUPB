import java.util.ArrayList;
import java.util.List;

public class Servidor1 implements IServdor {
    private List<User> userL;

    public Servidor1() {
        userL = new ArrayList<>();
    }

    @Override
    public void login(User user) {
        userL.add(user);
    }

    @Override
    public void userServe() {
        for (User user:userL) {
            System.out.println("Servidor1 va a atender al usuario " + user.getNro());
            user.showInfo();
        }
    }
}
