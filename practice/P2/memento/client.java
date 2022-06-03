
public class client {
    public static void main(String[] args){
        Contenedor contenedor = new Contenedor();
        Origen origen = new Origen();
        BDD bdd;

        bdd = new BDD();
        bdd.add(new Personas("Juan Perez", "13579", 13));
        bdd.add(new Personas("Maria Lopez", "246810", 24));
        origen.setMemento(bdd);
        contenedor.addMemento("Backup de Enero", origen.createMemento());

        bdd = new BDD();
        bdd.add(new Personas("Luz Camacho", "13789", 19));
        origen.setMemento(bdd);
        contenedor.addMemento("Backup de Febrero", origen.createMemento());

        bdd = new BDD();
        bdd.add(new Personas("Lua Miranda", "456789", 20));
        bdd.add(new Personas("Luis Quiroz", "24689", 23));
        bdd.add(new Personas("Jorge Perez", "13478", 25));
        origen.setMemento(bdd);
        contenedor.addMemento("Backup de Marzo", origen.createMemento());

        bdd = new BDD();
        bdd.add(new Personas("Michael Pearce", "834275", 37));
        bdd.add(new Personas("Julio Arias", "999999", 89));
        origen.setMemento(bdd);
        contenedor.addMemento("Backup de Abril", origen.createMemento());

        bdd = new BDD();
        bdd.add(new Personas("Roberto Gomez", "159753", 11));
        origen.setMemento(bdd);
        contenedor.addMemento("Backup de Mayo", origen.createMemento());

        bdd = origen.restaurarMemento(contenedor.getMemento("Backup de Marzo"));
        bdd.showInfo();
    }
}
