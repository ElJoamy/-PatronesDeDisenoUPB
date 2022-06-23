public class Tierra implements ISend {
    @Override
    public double send(double price) {
        double sendT = price * 0.05;
        return sendT;
    }

}
