import java.util.Random; //mengimport scanner ke program untuk mengambil input dari keyboard


public class PasswordGenerator { //memberitahu ke PasswordGenerate.java jika disini ada program
    public static void main(String[] args) //merupakan class yang pertama kali di eksekusi
    {
        int length = 10; // panjang password 10 
        System.out.println(generatePswd(length)); //memerintahkan sistem mengeluarkan password random
    }
    static char[] generatePswd(int len)
    {
        System.out.println("Your Password:"); //memerintaahkan system mengeluarkan tulisan Your Password
        String charsCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; //inisialisasi tipe data teks charsCaps
        String chars = "abcdefghijklmnopqrstuvwxyz"; //inisialisasi tipe data chars
        String nums = "0123456789"; //inisialisasi tipedata nums
        String symbols = "!@#$%^&*_=+-/€.?<>)"; //inisialisasi tipe data symbol

        String passSymbols = charsCaps + chars + nums + symbols; //inisialisasi string passSymbol
        Random rnd = new Random(); //mengacak password dengan random
        
        char[] password = new char[len];
        int index = 0; //variabel integer
        for (int i = 0; i < len; i++) //logika for
        {
            password[i] = passSymbols.charAt(rnd.nextInt(passSymbols.length()));
            
        }
        return password;
    }
}
