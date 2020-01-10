import java.util.Scanner;
public class KalkulatorBiasa {
  public static void main(String[] args) {

    int hasil,pilihan,angka1,angka2;
    Scanner input=new Scanner(System.in);
    System.out.println("========================");
    System.out.println("++++Tri Mulyo Atmojo++++");
    System.out.println("========================");
    System.out.println("Pilih perhitungan : ");	
    System.out.println("1. +{ penjumlahan}");
    System.out.println("2. -{Pengurangan}");
    System.out.println("3. *{Perkalian}");
    System.out.println("4. /{Pembagian}");
    pilihan=input.nextInt();
      
    System.out.println("Masukkan Angka Pertama : ");
    angka1=input.nextInt();                                    
    System.out.println("Masukkan Angka Kedua : ");
    angka2=input.nextInt();
      
        // Tambah 
    if (pilihan == 1) {
      hasil = angka1 + angka2;
      System.out.println("Hasil Perjumlahan :" + hasil);
    }
        // Kurang
    else if (pilihan == 2) {
      hasil = angka1 - angka2;
      System.out.println("Hasil Pengurangan :" + hasil);
    }
        // Kali
    else if (pilihan == 3) {
      hasil = angka1 * angka2;
      System.out.println("Hasil Perkalian :" + hasil);
    }
        // Bagi
    else if (pilihan == 4) {
      hasil = angka1 / angka2;
      System.out.println("Hasil Pembagian :" + hasil);
    }
    else {
      System.out.println("Mohon diteliti, inputan ada yang salah");
    }
  }
}
