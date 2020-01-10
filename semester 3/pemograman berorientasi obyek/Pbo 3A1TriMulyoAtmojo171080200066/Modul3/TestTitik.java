public class TestTitik {
    public static void main (String argv[]) {
        Titik t1, t2;
        int x2, y2, x3, y3;
        t1 = new Titik (8,4);
        t2 = new Titik ();
        x2 = t1.getx();
        y2 = t1.gety();
        System.out.println ("Koordinat ("+x2+" , "+y2+")") ;
        x3 = t2.getx();
        y3 = t2.gety();
        System.out.println ("Koordinat ("+x3+" , "+y3+")");
    }
}