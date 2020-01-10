import javax.swing.*;
public class Dialogku{
public static void main (String[] args){
JFrame a2;
a2 = new JFrame("frame");
a2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
a2.setVisible(true);
JOptionPane.showConfirmDialog(a2,"Contoh Dialog","UMSIDA KAMPUSKU",
JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
}
}