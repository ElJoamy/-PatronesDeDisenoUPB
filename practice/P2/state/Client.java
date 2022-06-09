public class Client {
    public static void main(String[] args) throws InterruptedException {
        Computer computer = new Computer();
        computer.setState(new Ensendido());
        computer.resourceManager();
        /*computer.setState(new Reinicio());
        computer.resourceManager();
        computer.setState(new Apagado());
        computer.resourceManager();*/
    }
}