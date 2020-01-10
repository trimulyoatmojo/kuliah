public class TestTitik3D {
  public static void main (String argv[]) {
    	Titik3D t1, t2;
    	int x2, y2, z2, x3, y3, z3;
    	t1 = new Titik3D (8,4,6);
    	t2 = new Titik3D ();
    	x2 = t1.getx();
    	y2 = t1.gety();
    	z2 = t1.getz();
    	System.out.println ("Koordinat ("+x2+" , "+y2+" , "+z2+")") ;
    	x3 = t2.getx();
    	y3 = t2.gety();
    	z3 = t2.getz();
    	System.out.println ("Koordinat ("+x3+" , "+y3+" , "+z3+")");}  }
