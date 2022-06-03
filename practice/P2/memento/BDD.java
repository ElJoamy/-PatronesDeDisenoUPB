import java.util.ArrayList;
import java.util.List;

public class BDD {
    private List<Personas> personas;

    public BDD() {
        personas = new ArrayList<Personas>();
    }

    public void add(Personas persona) {
        personas.add(persona);
    }

    public List<Personas> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Personas> personas) {
        this.personas = personas;
    }

    public void showInfo() {
        for (Personas persona : personas) {
            System.out.println("Name: " + persona.getNombre());
        }
    }
}
