import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        SalaDeComunicacion salaDeComunicacion=new SalaDeComunicacion();
        List<Integer> l1=new ArrayList<>();
        l1.add(1);
        l1.add(4);

        List<Integer> l2=new ArrayList<>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(5);

        Desarrollador u1=new Desarrollador(salaDeComunicacion);
        u1.setTipo("Junior").setNo(1).setName("Juan");
        Desarrollador u2=new Desarrollador(salaDeComunicacion);
        u2.setTipo("Junior").setNo(2).setName("Manuel");
        Desarrollador u3=new Desarrollador(salaDeComunicacion);
        u3.setTipo("senior").setNo(3).setName("Carlos");
        Desarrollador u4=new Desarrollador(salaDeComunicacion);
        u4.setTipo("expermentado").setNo(4).setName("Ruben");
        Desarrollador u5=new Desarrollador(salaDeComunicacion);
        u5.setTipo("senior").setNo(5).setName("Pedro");

        salaDeComunicacion.addChat(u1).addChat(u2).addChat(u3).addChat(u4).addChat(u5);
        u1.send("El prmer commit ya esta hecho", l1);
        System.out.println();
        u5.send("Revisr los ultmos commits y corregr si hay lgo mal", l2);
    }
}
