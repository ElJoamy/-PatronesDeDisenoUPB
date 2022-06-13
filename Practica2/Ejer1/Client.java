import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Create create=new Create();
        First first=new First();
        Estudiante tesis;

        List<Tesis> t1=new ArrayList<>();
        t1.add(new Tesis("The 1 Estado"));
        tesis=new Estudiante(t1);

        List<Tesis> t2=new ArrayList<>();
        t2.add(new Tesis("The 2 Estado"));
        tesis=new Estudiante(t2);

        List<Tesis> t3=new ArrayList<>();
        t3.add(new Tesis("The 3 Estado"));
        tesis=new Estudiante(t3);
        first.setMemento(tesis);
        create.createTesis("< TUTOR >", first.createMemento());

        List<Tesis> t4=new ArrayList<>();
        t4.add(new Tesis("The 4 Estado"));
        tesis=new Estudiante(t4);

        List<Tesis> t5=new ArrayList<>();
        t5.add(new Tesis("The 5 Estado"));
        tesis=new Estudiante(t5);

        tesis.showInfo();
        tesis=first.restoreMemento(create.getTesis("< TUTOR >"));
        tesis.showInfo();
    }
}
