public class Clent {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Plane plane = new Plane("Boeing");
        Car car = new Car("Ford");
        vehicle.Drive(plane);
        plane.show();
        car.show();

    }
}
