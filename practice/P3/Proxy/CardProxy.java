public class CardProxy implements ICard{

    private Account account;

    public CardProxy(Account account) {
        this.account = account;
    }

    @Override
    public void compra(Pay pay) {
        if(pay.getType().toLowerCase().equals("bs")){
            if(pay.getMonto() < account.getSaldo()){
                account.compra(pay);
            }else{
                System.out.println("No tienes saldo suficiente");
            }
        }else if(pay.getType().toLowerCase().equals("$")){
            pay.setMonto(pay.getMonto()*6.96);
            if(pay.getMonto() < account.getSaldo()){
                account.compra(pay);
            }else{
                System.out.println("No tienes saldo suficiente");
            }
        }else if(pay.getType().toLowerCase().equals("eu")){
            pay.setMonto(pay.getMonto()*7.24);
            if(pay.getMonto() < account.getSaldo()){
                account.compra(pay);
            }else{
                System.out.println("No tienes saldo suficiente");
            }
        }
    }
}
