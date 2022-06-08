import java.util.ArrayList;
import java.util.List;

public class CanalTel implements ICanal{
    private List<Notify> notifyList = new ArrayList<>();
    private List<IUser> users = new ArrayList<>();

    public CanalTel(){}
    
    public void upload(Notify notify){
        notifyList.add(notify);
        notifyObservers(notify);
    }

    @Override
    public void attach(IUser oberver) {
        users.add(oberver);
    }

    @Override
    public void detach(IUser oberver) {
        users.remove(oberver);
    }

    @Override
    public void notifyObservers(Notify notify) {
        for(IUser user : users){
            if(user.getOpconNotify().equals("premios y pomos")){
                user.update1("Contenido nuevo", notify);
            }else if(user.getOpconNotify().equals("promos y noticia")){
                user.update4("Contenido nuevo", notify);
            }else if(user.getOpconNotify().equals("llamadas y premios")){
                user.update5("Contenido nuevo", notify);    
            }else if(user.getOpconNotify().equals(notify.getTipoDeNotificacion())){
                user.update2("Contenido nuevo", notify);
            }else{
                user.update3("Contenido nuevo", notify);
            }
        }
    }
}
