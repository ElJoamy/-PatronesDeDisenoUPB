public class Proxy implements IServdor {
    private IServdor servidor1;
    private IServdor servidor2;

    public Proxy() {
        System.out.println("<===== Iniciando =====>");
        System.out.println();
        servidor1 = new Servidor1();
        servidor2 = new Servidor2();
    }

    public void login(User user){
        if(user.getNro() % 2 == 0){
            servidor1.login(user);
        } else {
            servidor2.login(user);
        }
    }

    @Override
    public void userServe() {
        servidor1.userServe();
        servidor2.userServe();
    }
}
