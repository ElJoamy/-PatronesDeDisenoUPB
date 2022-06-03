import java.util.HashMap;
import java.util.Map;

public class Contenedor {
    private Map<String, Memento> estadoLista = new HashMap();

    public void addMemento(String name, Memento memento) {
        estadoLista.put(name, memento);
    }

    public Memento getMemento(String alias) {
        return estadoLista.get(alias);
    }
}
