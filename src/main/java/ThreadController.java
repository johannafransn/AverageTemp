import javax.swing.*;

public class ThreadController extends Thread

{

    private Sensor temp1;
    private Sensor2 temp2;
    private JTextField window;



    //construcotr that accepts both sensor
    public ThreadController(Sensor s1, Sensor2 s2,  JTextField f)
    {
        this.temp1 = s1;
        this.temp2 = s2;
        this.window = f;
    }



    @Override
    public void run()
    {

        int t1, t2, average;

        synchronized (temp1)
        {
            //read the first one
           t1 = temp1.getTemp();


            //reserve (protect) second rescource
            synchronized (temp2)
            {
                t2 = temp2.getTemp();
            }

            average = (t1 + t2) / 2;

            window.setText(Integer.toString(average));
        }
    }

}
