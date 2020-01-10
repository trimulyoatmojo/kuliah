import javax.swing.*;
import java.awt.*;

public class Contohgridbag {
     public static void main (String[] args) {
           JFrame frame = new JFrame ("Contoh GridBagLayout UMSIDA");
           GridBagLayout layout = new GridBagLayout();
           GridBagConstraints c = new GridBagConstraints();
           frame.getContentPane().setLayout(layout);
           c.fill = GridBagConstraints.HORIZONTAL;

           JButton btn1 = new JButton("Tombol Umsida 1");
           c.weightx = 0.5;
           c.gridx = 0;
           c.gridy = 0;
           layout.setConstraints(btn1,c);
           frame.getContentPane().add(btn1);

           JButton btn2 = new JButton("Tombol Umsida 2");
           c.gridx = 1;
           c.gridy = 0;
           layout.setConstraints(btn2,c);
           frame.getContentPane().add(btn2);

           JButton btn3 = new JButton("Tombol Umsida 3");
           c.ipady = 30;
           c.gridwidth = 2;
           c.gridx = 0;
           c.gridy = 1;
           layout.setConstraints(btn3,c);
           frame.getContentPane().add(btn3);

           JButton btn4 = new JButton("Tombol Umsida 4");
           c.ipady = 50;
           c.gridwidth = 1;
           c.gridx = 0;
           c.gridy = 2;
           layout.setConstraints(btn4,c);
           frame.getContentPane().add(btn4);

           JButton btn5 = new JButton("Tombol Umsida 5");
           c.ipady = 0;
           c.gridwidth = 1;
           c.gridx = 1;
           c.gridy = 2;
           c.insets = new Insets(10,0,0,0); //t,l,b,r
           c.anchor = GridBagConstraints.SOUTH;
           layout.setConstraints(btn5,c);
           frame.getContentPane().add(btn5); 
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               frame.pack();
               frame.show();
           }
}
