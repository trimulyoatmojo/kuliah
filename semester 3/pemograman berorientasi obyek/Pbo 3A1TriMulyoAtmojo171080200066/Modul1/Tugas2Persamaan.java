import java.util.Scanner;
public class Tugas2Persamaan {
      public static void main (String argv[]) {
    	Scanner input = new Scanner (System.in);

		int x,y;
		System.out.println("Rumus = 2x^4+5x^3+6x^2-4x-27");
		System.out.print("Masukkan nilai x : "); x=input.nextInt();
		y = (2*x*x*x*x)+(5*x*x*x)+(6*x*x)-(4*x)-27;	
		System.out.println("Nilai f(x) : "+y);
	}
} 