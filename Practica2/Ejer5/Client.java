public class Client {
    public static void main(String[] args) {
        CG cg=new CG();
        cg.attach(new UG("Commit", new Persona(13574,"Jorge")));
        cg.attach(new UG("Commit", new Persona(159785,"Manuel")));
        cg.attach(new UG("Commit", new Persona(75632,"Franco")));

        Github github= new Github();
        Git git= new Git();

        Codigo codigo;
        codigo= new Codigo("import java.util... ","prueba",false);
        git.setCommit(codigo);
        github.createCommit("987546543ll",git.createCommit());
        codigo= new Codigo("puclic void C...","add new persona",false);
        codigo= new Codigo("Coplo...","add new persona",false);
        codigo= new Codigo("import jav.util...","add new estudiante",true);
        codigo= new Codigo("prvate void","add new class",true);
        git.setCommit(codigo);
        github.createCommit("321554QSCV",git.createCommit());
        System.out.println();
        codigo = git.restoreCommit(github.getCommit("987546543ll"));
        cg.notifyObservers();
        System.out.println("<--- CAMBIOS --->");
        codigo.showInfo();
        System.out.println("<------ * ----->");

        cg.detach(0);
        cg.detach(1);

        cg.attach(new UG("commit", new Persona(456321,"Mario")));
        cg.attach(new UG("commit", new Persona(85214,"Luigi")));
        cg.attach(new UG("commit", new Persona(75363,"Peach")));
        cg.detach(0);

        codigo = git.restoreCommit(github.getCommit("321554QSCV"));
        cg.notifyObservers();
        System.out.println("<--- CAMBIOS --->");
        codigo.showInfo();
    }
}
