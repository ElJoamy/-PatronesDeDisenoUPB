import java.util.List;

public abstract class Personas {
    protected IComunication comunication;
    private String name;
    private String tipo;
    private int no;

    public Personas(IComunication comunication) {
        this.comunication = comunication;
    }

    public String getName() {
        return name;
    }

    public Personas setName(String name) {
        this.name = name;
        return this;
    }

    public String getTipo() {
        return tipo;
    }

    public Personas setTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public int getNo() {
        return no;
    }

    public Personas setNo(int no) {
        this.no = no;
        return this;
    }

    public abstract void send(String msg, List<Integer> personasL);
    public abstract void received(String msg);
}
