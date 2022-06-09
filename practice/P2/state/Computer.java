public class Computer {
    private IStateComputadora state;
    private ProgramasAbiertos programasAbiertos;
    private RAM ram;
    private CPU cpu;

    public Computer() {
        this.programasAbiertos = new ProgramasAbiertos();
        this.ram = new RAM();
        this.cpu = new CPU();
        programasAbiertos.setProgramas("VARIOS PROGRAMAS ABIERTOS");
        ram.setCapacidadTotal("8g").setCapacidadUtiliza(5).setDescription("XPG Spectrix D60G");
        cpu.setCapacidadTotal("16g").setCapacidadUtiliza(5).setDescription("Intel Core i5-1065G3");
        state = new Apagado();
    }

    public IStateComputadora getState() {
        return state;
    }

    public void setState(IStateComputadora state) {
        this.state = state;
    }

    public ProgramasAbiertos getProgramasAbiertos() {
        return programasAbiertos;
    }

    public void setProgramasAbiertos(ProgramasAbiertos programasAbiertos) {
        this.programasAbiertos = programasAbiertos;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void resourceManager() throws InterruptedException {
        state.resourceManager(this);
    }
}
