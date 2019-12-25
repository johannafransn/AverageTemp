import javax.swing.*;


//view is responsible for manipulate data from database Model
public class View
{

    //connect to
    public void runApp(JTextField window1, JTextField window2)
    {
        //create object
        Sensor s1 = new Sensor();
        Sensor2 s2 = new Sensor2();

        Thread thread1 = new ThreadController(s1, s2, window1);
        Thread thread2 = new ThreadController(s1, s2, window2);

        thread1.start();
        thread2.start();

        try
        {
            thread1.join();
            thread2.join();

        }
        catch (Exception e)
        {
            System.out.println("Exception");
        }



    }
}
