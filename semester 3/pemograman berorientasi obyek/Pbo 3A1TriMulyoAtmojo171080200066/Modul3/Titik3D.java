public class Titik3D extends Titik {
public int z ;
    public Titik3D () {
    	super ();
    	z = 6; }
    public Titik3D (int x1, int y1, int z1) {
    	super (x1,y1);
    	z = z1; }
    public void setz (int z1) {
    	z=z1;}
    public int getz() {
    	return z;}} 