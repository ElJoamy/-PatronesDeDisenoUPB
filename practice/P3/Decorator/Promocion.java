import java.util.Random;

public class Promocion extends Decorator {

    public Promocion(ICuenta componente){
        super(componente);
    }

    public int getRandom(){
        Random random = new Random();
        int minimo = 10;
        int maximo = 1000;
        int resultado = random.nextInt(maximo-minimo) + minimo;
        return  resultado;
    }

    public void showInfo() {
        super.showInfo();
        boolean ganador = getRandom() % 2==0;
        if (ganador) {
            super.setMonto(super.getMonto() * 2);
        }
        System.out.println("Ganador de la promocion: " + ganador);
        System.out.println("Monto actual: " + super.getMonto());
    }
}
