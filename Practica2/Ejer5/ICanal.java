public interface ICanal {
    void attach(IUser observer);
    void detach(int position);
    void notifyObservers();
}
