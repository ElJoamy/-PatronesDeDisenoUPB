import java.util.Random;

public class Ensendido implements IStateComputadora {
    @Override
    public void resourceManager(Computer computer) throws InterruptedException {
        System.out.println("INFO-> ESTADO: Ensendido - Resources: ");
        int currentValue1 = computer.getCpu().getCapacidadUtiliza();
        int cantPrograms =  new Random().nextInt(10);
        computer.getProgramasAbiertos().setProgramas(cantPrograms + " PROGRAMAS");
        System.out.println(computer.getProgramasAbiertos().getProgramas());
        int currentValue2 = computer.getRam().getCapacidadUtiliza();
        while(currentValue1 < 100){
            computer.getCpu().showInfo();
            computer.getRam().showInfo();
            computer.getProgramasAbiertos().showInfo();
            Thread.sleep(5000);
            currentValue1 = currentValue1 + currentValue2 + cantPrograms * 6;
            computer.getCpu().setCapacidadUtiliza(currentValue1);
        }
        computer.getCpu().setCapacidadUtiliza(100);
        System.out.println("Estado de uso al 100%");
    }
}