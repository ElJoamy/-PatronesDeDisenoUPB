public class Apagado implements IStateComputadora {
    @Override
    public void resourceManager(Computer computer) throws InterruptedException{
        System.out.println("INFO-> ESTADO: Apagado - Resources: ");
        computer.getCpu().setCapacidadUtiliza(0);
        computer.getRam().setCapacidadUtiliza(0);
        computer .getCpu().showInfo();
        computer.getRam().showInfo();
        computer.getProgramasAbiertos().showInfo();
    }
}
