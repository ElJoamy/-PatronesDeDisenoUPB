import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Wp wp=new Wp();
        List<Integer> l1=new ArrayList<>();
        l1.add(1);
        l1.add(2);

        List<Integer> l2=new ArrayList<>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(5);
        l2.add(6);
        l2.add(7);
        l2.add(8);
        l2.add(9);
        l2.add(10);

        Usuarios u1=new Usuarios(wp);
        u1.setTipo("Usuario 1").setNo(1).setName("Juan");
        Usuarios u2=new Usuarios(wp);
        u2.setTipo("Usuario 2").setNo(2).setName("Pedro");
        Usuarios u3=new Usuarios(wp);
        u3.setTipo("Usuario 3").setNo(3).setName("Carlos");
        Usuarios u4=new Usuarios(wp);
        u4.setTipo("Usuario 4").setNo(4).setName("Carmen");
        Usuarios u5=new Usuarios(wp);
        u5.setTipo("Usuario 5").setNo(5).setName("Luis");
        Usuarios u6=new Usuarios(wp);
        u6.setTipo("Usuario 6").setNo(6).setName("Miguel");
        Usuarios u7=new Usuarios(wp);
        u7.setTipo("Usuario 7").setNo(7).setName("Jorge");
        Usuarios u8=new Usuarios(wp);
        u8.setTipo("Usuario 8").setNo(8).setName("Javier");
        Usuarios u9=new Usuarios(wp);
        u9.setTipo("Usuario 9").setNo(9).setName("Luana");
        Usuarios u10=new Usuarios(wp);
        u10.setTipo("Usuario 10").setNo(10).setName("Maria");
        

        wp.addChatUser(u1).addChatUser(u2).addChatUser(u3).addChatUser(u4).addChatUser(u5).addChatUser(u6).addChatUser(u7).addChatUser(u8)
        .addChatUser(u9).addChatUser(u10);

        u1.send("Mensaje para Pedro", l1);
        System.out.println();
        u10.send("Mensaje para el grupo", l2);
    }
}
