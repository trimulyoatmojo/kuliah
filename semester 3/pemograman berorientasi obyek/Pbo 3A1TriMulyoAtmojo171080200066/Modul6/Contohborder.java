import javax.swing.*;
import java.awt.*;

public class Contohborder {
     public static void main (String[] args) {
           JFrame frame = new JFrame ("Contoh Border Layout");
           BorderLayout layout = new BorderLayout(1,1);
           frame.getContentPane().setLayout(layout);
           JButton btnNorth = new JButton("NORTH");
           JButton btnSouth = new JButton("SOUTH");
           JButton btnEast = new JButton("EAST");
                   JButton btnWest = new JButton("WEST");
           JButton btnCenter = new JButton("CENTER");
frame.getContentPane().add(btnNorth,BorderLayout.NORTH);
frame.getContentPane().add(btnSouth,BorderLayout.SOUTH);
frame.getContentPane().add(btnEast,BorderLayout.EAST);
frame.getContentPane().add(btnWest,BorderLayout.WEST);
frame.getContentPane().add(btnCenter,BorderLayout.CENTER);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.show();
         }
   }
