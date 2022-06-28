public class User {
    private String username;
    private int nro;

    public User(String username, int nro) {
        this.username = username;
        this.nro = nro;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public void showInfo(){
        System.out.println("<--- User info --->");
        System.out.println("Username: " + username);
        System.out.println("User number: " + nro);
        System.out.println();
    }
}
