import java.util.Random;

public class AgregarEscudo extends Habilidades {

    public AgregarEscudo(IGame game) {
        super(game);
    }

    @Override
    public void agregarHabilidad(Personaje personaje){
        System.out.println("<---El escudo se esta anadiendo!--->");
        double nDefense = personaje.getPuntosDefensa() + 35;
        personaje.setPuntosDefensa(nDefense);
        double nArmor = personaje.getPorcentajeArmadura()+ 10;
        personaje.setPorcentajeArmadura(nArmor);
        personaje.showInfo();
    }
}
