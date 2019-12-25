public class Sensor

{
    //call this method to get temp of first sensor
   public int getTemp()
   {
       int temp = 70;
       try
       {
           Thread.sleep(500);
           temp = temp + (int)(Math.random() * 10);

       }
       catch (Exception e)
       {
           System.out.println("Exception occurred");
       }
       return temp;
   }
}
