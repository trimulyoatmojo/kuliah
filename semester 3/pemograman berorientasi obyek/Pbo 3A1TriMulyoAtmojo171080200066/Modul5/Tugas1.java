import java.util.*;
public class Tugas1
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        int angka;
        try
        {
       System.out.print(" Masukkan Angka = ");
       angka = input.nextInt();
        }
        catch(Exception e)
        {
      System.out.println(" MAAF !! Tolong Inputkan Angka . . . Bukan Huruf . . .");
        }
       System.out.println(" \nPress any key to continue . . . ");
       System.out.println();
    }
}