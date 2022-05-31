import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args){
        Importadora1 i1 = new Importadora1();
        i1.add(new Vehiculo("Mazda","5000", "4*4", "5"));

        Importadora2 i2 = new Importadora2();
        i2.add(new Vehiculo("TOYOTA","4500", "4*4", "4"));

        Importadora3 i3 = new Importadora3();
        i3.add(new Vehiculo("NISSAN","8000", "4*4", "5"));

        Importadora4 i4 = new Importadora4();
        i4.add(new Vehiculo("PORCH","25000", "4*4", "4"));

        Iterator it;
        Map<Vehiculo, String> map = new HashMap<Vehiculo, String>();

        it = i1.createIterator();
        while(it.hasNext()){
            Vehiculo v = (Vehiculo) it.next();
            map.put(v, v.getModelo());
        }

        it = i2.createIterator();
        while(it.hasNext()){
            Vehiculo v = (Vehiculo) it.next();
            map.put(v, v.getModelo());
        }

        it = i3.createIterator();
        while(it.hasNext()){
            Vehiculo v = (Vehiculo) it.next();
            map.put(v, v.getModelo());
        }

        it = i4.createIterator();
        while(it.hasNext()){
            Vehiculo v = (Vehiculo) it.next();
            map.put(v, v.getModelo());
        }

        for(Vehiculo key : map.keySet()){
            System.out.println("Vehiculo " + key.getModelo() +  " Costo " + key.getCosto() + " Tipo " + key.getTipo() + " NroDeAsientos " + key.getnAsientos());
        }
    }
    
}
