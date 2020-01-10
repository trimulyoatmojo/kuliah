public class Tugas4Array2D {
public static void main (String argv[]) {
double n;
        String nama[]={"Udon", "Dany", "Rissa", "Tino", "Flo"};
    double uts[]={80,79,90,90,90}, uas[]={85,80,79,88,67}, tugas[]={90,78,89,89,99};
    for (int i=0; i<5; i++) {
        System.out.print("Nilai "+nama[i]+"=");
        n=0.35*uts[i]+0.45*uas[i]+0.2*tugas[i];
        System.out.println("UTS:"+uts[i]+", UAS:"+uas[i]+", Tugas:"+tugas[i]+"Nilai Akhir:"+n);
		}
    }
}