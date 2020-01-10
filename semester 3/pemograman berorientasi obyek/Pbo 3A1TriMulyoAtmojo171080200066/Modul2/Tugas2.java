public class Tugas2 {
    public static void main (String argv[]) {
        int a, b, c ;
        a = 1;
        b = 5;
        c = 9;
                  while (a<=100) {
            if (((a%b)==0) || ((a%c)==0))
                System.out.println ("Bilangannya adalah " + a);
                a++;
        }
    }
}