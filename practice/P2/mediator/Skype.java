import java.util.HashMap;
import java.util.Map;

public class Skype implements ICanalComunicacion {

    Map<Persona, String> profesionalChat = new HashMap<Persona, String>();

    public Skype addProfesionalChat(Persona persona, String cargo) {
        profesionalChat.put(persona, cargo);
        return this;
    }

    @Override
    public void send(String msg, Persona persona) {
        Persona emisor = persona;
        QA qa;
        DEV dev;
        SM sm;
        for(Map.Entry<Persona, String> entry : profesionalChat.entrySet()) {
            if(!entry.getCi().equals(entry.getKey().getCi())){
                if(emisor.getCargo().equals("QA") && entry.getValue().equals("QA")){
                    qa = (QA) entry.getKey();
                    qa.receive(msg);
                }else if(emisor.getCargo().equals("DEV") && entry.getValue().equals("DEV")){
                    dev = (DEV) entry.getKey();
                    dev.receive(msg);
                }else if(emisor.getCargo().equals("SM")){
                    if(entry.getValue().equals("QA")){
                        qa = (QA) entry.getKey();
                        qa.receive(msg);
                    }else if(entry.getValue().equals("DEV")){
                        dev = (DEV) entry.getKey();
                        dev.receive(msg);
                    }else{
                        sm = (SM) entry.getKey();
                        sm.receive(msg);
                    }    
                }     
            }
        }
    }
}
