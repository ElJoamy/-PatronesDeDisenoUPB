import java.util.Random;

public class AgregarArma extends Habilidades {
    private String[] armas = {"Ballesta", "Arco", "Espada", "Hacha", "Bara", "Machete", "Escopeta"};

    public AgregarArma(IGame game) {
        super(game);
    }

    @Override
    public void agregarHabilidad(Personaje personaje){
        System.out.println("<---El arma del personaje se esta anadiendo!--->");
        int nArma = new Random().nextInt(armas.length);
        personaje.setArmas(armas[nArma]);
        double nAtack = personaje.getPuntosAtaque() + 30;
        personaje.setPuntosAtaque(nAtack);
        int nLevel = personaje.getNivel() * 2;
        personaje.setNivel(nLevel);
        personaje.showInfo();
    }
}
