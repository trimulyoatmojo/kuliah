Proggram Kalkulator

import java.util.Scanner;
public class KalkulatorBiasa {	1	
public static void main(String[] args) {
   
        int hasil,pilihan,angka1,angka2;			2	
        Scanner input=new Scanner(System.in);      	3
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("-------------Kalkulator------------  ");
        System.out.println("***** Muhammad Ashrafi Miha T *****");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");				4
        System.out.println("Pilih perhitungan : ");	
        System.out.println("1. +{ penjumblahan}");
        System.out.println("2. -{Pengurangan}");
        System.out.println("3. *{Perkalian}");
        System.out.println("4. /{Pembagian}");
        pilihan=input.nextInt();
      
        System.out.println("Masukkan Angka pertama : ");
        angka1=input.nextInt();                                                         5                                      
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
   System.out.println("Maaf, Cobs Lagi Bila Tetap Salah");
  }
    }
