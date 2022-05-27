public class Cliente {
    public static void main(String[] args){
        Contrato contrato = new Contrato();
        contrato.setSueldo(5000);
        contrato.setCargaHoraria(80);
        contrato.setCursoEducacionSuperior(true);
        contrato.setAccesoPlataforma(true);
        contrato.setMarcadoBiometrico(false);
        contrato.setHoraDeEntrada("08:00");
        contrato.setHoraDeSalida("18:00");

        Contrato c1 = (Contrato) contrato.clone();
        c1.setNombre("Juan");
        c1.setApellido("Jordan");
        c1.showInfo();

        Contrato c2 = (Contrato) contrato.clone();
        c2.setNombre("Pedro");
        c2.setApellido("Parker");
        c2.showInfo();

        Contrato c3 = (Contrato) contrato.clone();
        c3.setNombre("Rid");
        c3.setApellido("Richards");
        c3.showInfo();

        Contrato c4 = (Contrato) contrato.clone();
        c4.setNombre("Bruce");
        c4.setApellido("Banner");
        c4.showInfo();

        Contrato c5 = (Contrato) contrato.clone();
        c5.setNombre("Susan");
        c5.setApellido("Storn");
        c5.showInfo();
    }
}
