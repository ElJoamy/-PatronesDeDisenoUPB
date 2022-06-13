import java.util.ArrayList;
import java.util.List;

public class SalaDeComunicacion implements IComunication{
    List<Desarrollador> chatUsers = new ArrayList<>();

    public SalaDeComunicacion addChat(Desarrollador user){
        chatUsers.add(user);
        return this;
    }

    @Override
    public void send(String msg, Persona personas, List<Integer> personasL) {
        Desarrollador mandar = (Desarrollador) personas;
        for (Integer cantidadP:personasL){
            for (Desarrollador user:chatUsers){
                if (cantidadP != mandar.getNo()){
                    if (cantidadP == user.getNo()){
                        user.received(msg);
                    }
                }
            }
        }
    }
}
