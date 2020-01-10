public class TestKonversi1 {
    public static void main ( String argv[]) {
    Konversi1 k1;
    double m2k,k2m,jrk;
    k1=new Konversi1();
    k1.setJarak(5000);

    m2k=k1.m2k();
    k2m=k1.k2m();
    jrk=k1.getJarak();
    System.out.println("m ke km="+m2k);
    System.out.println("km ke m="+k2m);
    }
} 