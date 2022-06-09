public class RAM {
    String capacidadTotal;
    int capacidadUtiliza;
    String description;

    public RAM() {}

    public String getCapacidadTotal() {
        return capacidadTotal;
    }

    public RAM setCapacidadTotal(String capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
        return this;
    }

    public int getCapacidadUtiliza() {
        return capacidadUtiliza;
    }

    public RAM setCapacidadUtiliza(int capacidadUtiliza) {
        this.capacidadUtiliza = capacidadUtiliza;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public RAM setDescription(String description) {
        this.description = description;
        return this;
    }

    public void showInfo() {
        System.out.println("<---Memoria RAM--->");
        System.out.println("Capacidad total: " + capacidadTotal);
        System.out.println("Capacidad utilizada: " + capacidadUtiliza);
        System.out.println("Description: " + description);
    }

}
