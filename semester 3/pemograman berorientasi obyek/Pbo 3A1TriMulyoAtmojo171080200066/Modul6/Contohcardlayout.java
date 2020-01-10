import javax.swing.*;
import java.awt.*;

public class Contohcardlayout {
     public static void main (String[] args) {
           JFrame frame = new JFrame ("UMSIDA KAMPUSKU");
           JPanel panel1 = new JPanel();
           JPanel panel2 = new JPanel();
           JPanel panel3 = new JPanel();
           JButton btn1 = new JButton("Tombol Umsida1");
           JButton btn2 = new JButton("Tombol Umsida2");
           JButton btn3 = new JButton("Tombol Umsida3");
           
           panel1.add(btn1);
           panel2.add(btn2);
           panel3.add(btn3);

           JTabbedPane tab = new JTabbedPane ();
           tab.add(panel1,"sisi 1");
           tab.add(panel2,"sisi 2");
           tab.add(panel3,"sisi 3");
           
           frame.getContentPane().add(tab,BorderLayout.NORTH);
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.setSize(300,150);
           frame.show();
      }
}