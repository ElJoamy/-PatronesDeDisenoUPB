public class Client {
    public static void main(String[] args) {
        ManagerEjercito mE = new ManagerEjercito();
        mE.criteriaHandler("Entrevistas,Disciplina,Desbloqueos,Manifestaciones,Limpiezas");
        mE.criteriaHandler("Disciplina,Desbloqueos,Manifestaciones,Limpiezas");
        mE.criteriaHandler("Manifestaciones,Limpiezas");
        mE.criteriaHandler("Limpiezas");
    }
}
