public class Pizza {
    private String ing;
    private String tM;
    private String tQ;

    public Pizza(){}

    public String getIng() {
        return ing;
    }

    public String getTM() {
        return tM;
    }

    public String getTQ() {
        return tQ;
    }

    public Pizza setI(String ing) {
        this.ing = ing;
        return this;
    }

    public Pizza setTM(String tM) {
        this.tM = tM;
        return this;
    }

    public Pizza setTQ(String tQ) {
        this.tQ = tQ;
        return this;
    }

    public void showInfo() {
        System.out.println("Ingredientes: "+ing);
        System.out.println("Tipo de Masa: "+tM);
        System.out.println("Tipo de Queso: "+tQ);
    }
}
