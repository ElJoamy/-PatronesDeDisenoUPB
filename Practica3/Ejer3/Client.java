public class Client {
    public static void main(String []args){
        Composite folder1 = new Composite("Folder 1");
        folder1.add(new Fle("archivo1","Hola mundo"));
        folder1.add(new Fle("archivo2","Ya etamos aca"));
        folder1.add(new Fle("archivo3", "Ya la tenia y la perdi"));
        System.out.println("<---------------------------------------------------->");
        System.out.println();

        Composite folder2 = new Composite("Folder 2");
        folder2.add(new Fle("archivo4","Alguna vez toca perder"));
        folder2.add(new Fle("archivo5","Ya no la encuentro"));
        System.out.println("<---------------------------------------------------->");
        System.out.println();

        System.out.println("<---------------------------------------------------->");
        Composite unidad = new Composite("Unidad de Disco Duro"); 
        unidad.add(folder1);
        unidad.add(folder2);
        unidad.getWords();
        System.out.println("<---------------------------------------------------->");
    }
}