import javax.swing.*;
import java.awt.*;

public class GuiClass extends JFrame{

    public GuiClass () {

        //Create the left panel then size it and set background color
        JPanel leftPanel = new JPanel();
        leftPanel.setSize(300, 200);
        leftPanel.setLocation(0,50);
        leftPanel.setBackground(new Color(0,0,255));

        // Create the left panel then size it and set background color
        JPanel rightPanel = new JPanel();
        rightPanel.setSize(300, 200);
        rightPanel.setLocation(300,50);
        rightPanel.setBackground(new Color(255,0,0));

        // Create the left label
        JLabel leftLabel = new JLabel("This is the left panel");
        leftLabel.setBounds(50, 50, 200, 30); // Set the size and position
        leftLabel.setForeground(new Color(255,0,0)); // Set the text color to red

        //Create the right panel
        JLabel rightLabel = new JLabel("This is the right panel");
        rightLabel.setBounds(50, 50, 200, 30); // Set the size and position
        rightLabel.setForeground(new Color(0,0,255)); // Set the text color to blue

        //Create left button
        JButton leftButton = new JButton("Toggle Left");
        leftButton.setBounds(75, 0, 150, 50); // Set the size and position


        //Create the right button
        JButton rightButton = new JButton("Toggle Right");
        rightButton.setBounds(375, 0, 150, 50); // Set the size and position


        //Add the labels to the frames
        leftPanel.add(leftLabel);
        rightPanel.add(rightLabel);

        //Add the buttons and panels components to the frame
        add(leftButton);
        add(rightButton);
        add(leftPanel);
        add(rightPanel);

        //Set frame properties
        setSize(600,250);
        setLayout(null);
        setVisible(true);
    }

}
