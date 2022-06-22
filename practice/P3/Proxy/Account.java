public class Account implements ICard{

    private int account;
    private double saldo;
    private Person usuario;

    public Account(int account, double saldo, Person usuario) {
        this.account = account;
        this.saldo = saldo;
        this.usuario = usuario;
    }

    public int getAccount() {
        return account;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Person getUsuario() {
        return usuario;
    }

    @Override
    public void compra(Pay pay) {
        pay.showInfo();
        setSaldo(saldo - pay.getMonto());
        System.out.println("EL pago se realizo con exito");
        System.out.println("Tu saldo actual es de: bs " + saldo);
        System.out.println("<------------------------------------>");
    }
}
