import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;

class SwingUI extends JFrame implements ActionListener{
    
    //instance variables
    JLabel text, clicked;
    JButton button, clickButton;
    JPanel panel;
    private boolean _clickMeMode = true;
    
    //constructor
    SwingUI(){
        text = new JLabel("I'm a Simple Program");
        clicked = new JLabel("Button Clicked");
 
        button = new JButton("Click Me");
        //Add button as an event listener
        button.addActionListener(this);

        clickButton = new JButton("Click Again");
        //Add button as an event listener
        clickButton.addActionListener(this);

        //Create panel
        panel = new JPanel();
        //Specify layout manager and background color
        panel.setLayout(new BorderLayout(1,1));
        panel.setBackground(Color.white);
        //Add label and button to panel
        getContentPane().add(panel);
        panel.add(BorderLayout.CENTER, text);
        panel.add(BorderLayout.SOUTH, button);
    }
    
    public void actionPerformed(ActionEvent event){
        Object source = event.getSource();
        if (_clickMeMode) {
          text.setText("Button Clicked");
          button.setText("Click Again");
          _clickMeMode = false;
        } else {
          text.setText("I'm a Simple Program");
          button.setText("Click Me");
          _clickMeMode = true;
        }
   }
    public static void main(String[] args){
        //Create top-level frame
        SwingUI frame = new SwingUI();
        frame.setTitle("Example");
        //This code lets you close the window
        WindowListener l = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
               System.exit(0);
            }
        };
        frame.addWindowListener(l);
        //This code lets you see the frame
        frame.pack();
        frame.setVisible(true);
    }
}
