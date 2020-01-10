import javax.swing.*;
import java.awt.*;
public class Contohflowlayout1 {
     public static void main (String[] args) {
           JFrame frame = new JFrame ("UMSIDA KAMPUSKU");
           FlowLayout layout = new FlowLayout (FlowLayout.LEFT);
           layout.setVgap(15);
           layout.setHgap(15);
           frame.getContentPane().setLayout(layout);

           JButton btn1 = new JButton("Umsida 1");
           JButton btn2 = new JButton("Umsida 2");
           JButton btn3 = new JButton("Umsida 3");
           JButton btn4 = new JButton("Umsida 4");

           frame.getContentPane().add(btn1);
           frame.getContentPane().add(btn2);
           frame.getContentPane().add(btn3);
           frame.getContentPane().add(btn4);

      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300,300);
            frame.show();
}
}