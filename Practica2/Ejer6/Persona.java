import java.util.List;

public abstract class Persona {
    protected IComunication comunication;
    private String name;
    private String tipo;
    private int no;

    public Persona(IComunication comunication) {
        this.comunication = comunication;
    }

    public String getName() {
        return name;
    }

    public Persona setName(String name) {
        this.name = name;
        return this;
    }

    public String getTipo() {
        return tipo;
    }

    public Persona setTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public int getNo() {
        return no;
    }

    public Persona setNo(int no) {
        this.no = no;
        return this;
    }

    public abstract void send(String msg, List<Integer> listaPersonas);
    public abstract void received(String msg);
}
