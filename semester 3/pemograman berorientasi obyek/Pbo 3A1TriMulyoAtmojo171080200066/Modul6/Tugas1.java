import javax.swing.*;
import java.awt.*;
public class Tugas1{
	public static void main(String [] args){
		Button Tombol1;
		Button Tombol2;
		Label Label1;
		Label Label2;
		Label Label3;
		TextField txt1;
		TextField txt2;
		TextField txt3;
			
			JFrame frame= new JFrame("Project 2");
			FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
			layout.setHgap(15);
			layout.setVgap(15);	
			frame.getContentPane().setLayout(layout);
				
				Label1 = new Label("Nim          :");
				frame.getContentPane().add(Label1);
				txt1 = new TextField("Inputkan Nim   ");
				frame.getContentPane().add(txt1);

				Label2 = new Label("Nama      :");
				frame.getContentPane().add(Label2);
				txt2 = new TextField("Inputkan Nama  ");
				frame.getContentPane().add(txt2);

				Label3 = new Label("Alamat     :");
				frame.getContentPane().add(Label3);
				txt3 = new TextField("Inputkan Alamat");
				frame.getContentPane().add(txt3);

				Tombol1 = new Button(" Ok ");
				frame.getContentPane().add(Tombol1);
				Tombol2 = new Button(" Cancel ");
				frame.getContentPane().add(Tombol2);
				
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(280,250);
		frame.show();
	}}