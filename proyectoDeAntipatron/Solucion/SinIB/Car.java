public class Car extends Vehicle{
   String type;
   void Drive(){
      System.out.println("Driving el " + type);
   }

   public Car(String type){
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