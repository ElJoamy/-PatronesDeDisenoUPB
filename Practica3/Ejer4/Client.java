public class Client {
    public static void main(String[] args){
        IServdor proxy = new Proxy();

        proxy.login(new User("Aiden", 1));
        proxy.login(new User("Pedro", 2));
        proxy.login(new User("Maria", 3));
        proxy.login(new User("Lucas", 4));
        proxy.login(new User("Mario", 5));
        proxy.login(new User("Marian", 6));
        proxy.login(new User("Juan", 7));
        proxy.login(new User("Kelly", 8));
        proxy.login(new User("Lucia", 9));
        proxy.login(new User("Moreira", 10));

        proxy.userServe();
        System.out.println("<===== Fin =====>");
    }
}
