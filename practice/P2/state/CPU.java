public class CPU{
    String capacidadTotal;
    int capacidadUtiliza;
    String description;

    public CPU() {}

    public String getCapacidadTotal() {
        return capacidadTotal;
    }

    public CPU setCapacidadTotal(String capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
        return this;
    }

    public int getCapacidadUtiliza() {
        return capacidadUtiliza;
    }

    public CPU setCapacidadUtiliza(int capacidadUtiliza) {
        this.capacidadUtiliza = capacidadUtiliza;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CPU setDescription(String description) {
        this.description = description;
        return this;
    }

    public void showInfo() {
        System.out.println("<---CPU--->");
        System.out.println("Capacidad total: " + capacidadTotal);
        System.out.println("Capacidad utilizada: " + capacidadUtiliza);
        System.out.println("Description: " + description);
    }
}