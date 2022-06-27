public class Plane extends Vehicle{
    String type;
    void Drive(){
         System.out.println("Driving el " + type);
    }

   public Plane(String type){
      this.type = type;
   }
   public String getType(){
      return type;
   }

   @Override
   public void show(){
      System.out.println("type: " + type);
   }
}