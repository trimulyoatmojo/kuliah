import javax.swing.*;
import java.awt.*;

public class Contohboxlayout {
     public static void main (String[] args) {
           JFrame frame = new JFrame ("Box Layout");
           Box comp = new Box(BoxLayout.X_AXIS);

           
           GridBagLayout layout = new GridBagLayout();
           GridBagConstraints c = new GridBagConstraints();
           frame.getContentPane().setLayout(layout);
           c.fill = GridBagConstraints.HORIZONTAL;

           JButton btn1 = new JButton("POsisi 1");
           JButton btn2 = new JButton("Posisi 2");
           JButton btn3 = new JButton("Posisi 3");
           JButton btn4 = new JButton("Posisi 4");
           JButton btn5 = new JButton("Posisi 5");
           comp.add(btn1);
           comp.add(btn2);
           comp.add(btn3);
           comp.add(btn4);
           comp.add(btn5);
          
           frame.getContentPane().add(comp);
 
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               frame.pack();
               frame.show();
           }
}
