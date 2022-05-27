public class Client {
    public static void main(String[] args) {
        Estudiante luis = new Estudiante();
        luis.setNombre("Rid de luis");
        luis.setCi("135790");
        IMateria inscripcion1 = FactoryMateria.make("Historia");
        inscripcion1.registrarEstudiante(luis);
        inscripcion1.inscribirse();

        Estudiante armando = new Estudiante();
        armando.setNombre("Susan Sanchez");
        armando.setCi("135794");
        IMateria inscripcion2 = FactoryMateria.make("Matematicas");
        inscripcion2.registrarEstudiante(armando);
        inscripcion2.inscribirse();

        Estudiante carla = new Estudiante();
        carla.setNombre("Gregorio Apaza");
        carla.setCi("135793");
        IMateria inscripcion3 = FactoryMateria.make("Ingles");
        inscripcion3.registrarEstudiante(carla);
        inscripcion3.inscribirse();

        Estudiante camila = new Estudiante();
        camila.setNombre("Juan Bautista");
        camila.setCi("135792");
        IMateria inscripcion4 = FactoryMateria.make("Lenguaje");
        inscripcion4.registrarEstudiante(camila);
        inscripcion4.inscribirse();

        Estudiante andres = new Estudiante();
        andres.setNombre("Ramiro Castillo");
        andres.setCi("135791");
        IMateria inscripcion5 = FactoryMateria.make("Ingles");
        inscripcion5.registrarEstudiante(andres);
        inscripcion5.inscribirse();
    }
}
