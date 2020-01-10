import javax.swing.*;
import java.awt.*;
public class Contohgridlayout {
     public static void main (String[] args) {
           JFrame frame = new JFrame ("UMSIDA KAMPUSKU");
           GridLayout layout = new GridLayout (3,2);
           layout.setHgap(5);
           layout.setVgap(10);
           frame.getContentPane().setLayout(layout);

           JButton btn1 = new JButton("pencet 1");
           JButton btn2 = new JButton("pencet 2");
           JButton btn3 = new JButton("pencet 3");
           JButton btn4 = new JButton("pencet 4");

           frame.getContentPane().add(btn1);
           frame.getContentPane().add(btn2);
           frame.getContentPane().add(btn3);
           frame.getContentPane().add(btn4);

      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.show();
      }
}