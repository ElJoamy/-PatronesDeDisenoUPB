public class Client {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Plane plane = new Plane("Boeing");
        Car car = new Car("Ford");
        vehicle.show();
        plane.show();
        car.show();
        plane.Drive();
        car.Drive();

    }
}
