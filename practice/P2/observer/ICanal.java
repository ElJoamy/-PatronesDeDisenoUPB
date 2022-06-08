public interface ICanal {
    void attach(IUser oberver);
    void detach(IUser oberver);
    void notifyObservers(Notify notify);
}
