import java.util.ArrayList;
import java.util.List;

public class Wp implements IComunication {
    List<Usuarios> chatUsers = new ArrayList<>();

    public Wp addChatUser(Usuarios user) {
        chatUsers.add(user);
        return this;
    }

    @Override
    public void send(String msg, Personas personas, List<Integer> personasL) {
        Usuarios mandaUsuarios = (Usuarios) personas;
        for(Integer cantidad: personasL) {
           for(Usuarios user: chatUsers) {
               if(cantidad != mandaUsuarios.getNo()) {
                    if(cantidad == user.getNo()) {
                    user.received(msg);
                    }
               }
           }
        }
    }
}
