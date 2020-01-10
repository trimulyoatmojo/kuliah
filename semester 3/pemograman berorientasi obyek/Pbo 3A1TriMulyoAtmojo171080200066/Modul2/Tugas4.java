import java.io.*;
public class Tugas4 {
public static void main (String argv[]) throws IOException
{
	String hasil;
	InputStreamReader isr=new 	InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	System.out.print("Masukkan nilai :");
	String nil=br.readLine();
	hasil="";
	int n = Integer.parseInt(nil);
	int v = 1;
	while (v <= n/2){
		v = v*2;}
	while (v>0){
		if (n < v){
			hasil +="0";
		}
		else{
			hasil +="1";
			n = n-v;
		}
		v=v/2;
		}
			System.out.println("Nilai biner dari "+nil+" adalah:"+hasil);
			System.out.print("Jika di balik hasilnya :");
				int nhasil;
				char data[]=hasil.toCharArray();
				for (nhasil=hasil.length(); nhasil>0; nhasil--){
					System.out.print(data[nhasil-1]);
		}
	System.out.println();	
		}    
} 
