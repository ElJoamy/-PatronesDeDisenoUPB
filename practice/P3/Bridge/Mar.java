public class Mar implements ISend {
    @Override
    public double send(double price) {
        double sendT = price * 0.5;
        return sendT;
    }

}
