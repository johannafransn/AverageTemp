import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controller extends JFrame

{

    //create a frame in this class
    //aircraft average temp
    //constructor contains title
    public Controller()
    {
        this.setTitle("Aircraft Wing Temp Monitors");
        this.setDefaultCloseOperation((EXIT_ON_CLOSE));

        //call this method to add it to the bigger frame
        this.add(getPanel());
    }


    //method to create the frame return Jpanel
    public JPanel getPanel()
    {
        //create enitre panel
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(800, 500));
        panel.setLayout(new BorderLayout());

        //3 subpanels; create title panel, temprature, button
        JPanel titlePanel = new JPanel();
        JPanel tempPanel = new JPanel();
        JPanel buttonPanel = new JPanel();


        //label to title panel
        JLabel title = new JLabel("AIRCRAFT WING TEMP MONITOR", 0);
        //add to title panel
        title.setFont(new Font("Arial,", 1, 24));
        titlePanel.add(title);


        //j text field
        final JTextField window1 = new JTextField("___", 24);
        window1.setFont(new Font("Arial,", 1, 24));
        window1.setHorizontalAlignment(JTextField.CENTER);
        final JTextField window2 = new JTextField("___", 24);
        window2.setFont(new Font("Arial,", 1, 24));
        window2.setHorizontalAlignment(JTextField.CENTER);


        //add the two windows created and designed above to the panel
        tempPanel.add(window1);
        tempPanel.add(window2);


        //create new button
        JButton checkButton = new JButton("Check");
        //set design and size
        checkButton.setPreferredSize(new Dimension(80, 20));
        buttonPanel.add(checkButton);



        panel.add(titlePanel, BorderLayout.NORTH);
        panel.add(tempPanel, BorderLayout.CENTER);
        panel.add(checkButton, BorderLayout.SOUTH);




        final View v = new View();

        //use action listener to make it functional
        checkButton.addActionListener(new ActionListener()

        {
            public void actionPerformed(ActionEvent e)
            {
                v.runApp(window1, window2);
            }
        });



        panel.add(titlePanel);

        return panel;




    }
}
