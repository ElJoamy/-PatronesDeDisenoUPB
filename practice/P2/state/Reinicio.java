public class Reinicio implements IStateComputadora {
    @Override
    public void resourceManager(Computer computer) throws InterruptedException {
        System.out.println("INFO-> ESTADO: Reinicio - Resources: ");
        computer.getCpu().setCapacidadUtiliza(0);
        computer.getRam().setCapacidadUtiliza(0);
        computer.getProgramasAbiertos().setProgramas("CERRANDO LOS PROGRAMAS");
        computer .getCpu().showInfo();
        computer.getRam().showInfo();
        computer.getProgramasAbiertos().showInfo();
    }
}