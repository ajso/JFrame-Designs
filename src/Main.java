import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {


        JLabel jLabel = getjLabel();


        JFrame frame = new JFrame(); //create the frame
        frame.setSize(600, 500); //sets the frame size (x-dimension, y-dimension)
        frame.setTitle("JFrame Project"); //Sets the title of our frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exit out of the application
        frame.setVisible(true); //makes the frame visible
        frame.setResizable(false); //prevent the frame from being resized
        //frame.setBackground(new Color(252, 251, 251));
        frame.setLayout(null);
        //adding a label to the frame
        frame.add(jLabel);

        ImageIcon icon = new ImageIcon("images/icon_frame.png"); //creating an image icon
        frame.setIconImage(icon.getImage()); //change the icon of the frame
        frame.getContentPane().setBackground(Color.white); //sets the color of the frame to white



    }

    public static JLabel getjLabel() {
        ImageIcon image = new ImageIcon("images/brand-logo.png");

        JLabel jLabel = new JLabel();
        jLabel.setText("Project A"); //set text of the label
        jLabel.setIcon(image);
        jLabel.setHorizontalTextPosition(JLabel.CENTER); //set Text Left, center, right of the imageIcon.
        jLabel.setVerticalTextPosition(JLabel.TOP); //Set text Top of the imageIcon
        jLabel.setForeground(Color.gray); //set the text color to gray
        jLabel.setFont(new Font("MV Boli", Font.BOLD, 25)); //set the font of the text
        jLabel.setIconTextGap(10); //set the gap of text from image.
        jLabel.setBackground(Color.lightGray); //set the background color.
        jLabel.setOpaque(true); //display the background color
        jLabel.setVerticalAlignment(JLabel.TOP); //set the icon to the top
        jLabel.setHorizontalAlignment(JLabel.CENTER); //set the label in the center
        jLabel.setBounds(0,0, 600, 150);//this will set x, y position as well as the dimensions


        return jLabel;
    }
}