public class TestKotak {
	public static void main (String argv []) {
	Kotak k1;
	int vol,luas,pjg;
	k1=new Kotak () ;
	k1.setPanjang (10) ;
	k1.setLebar (15) ;
	k1.setTinggi (4) ;
	
	vol=k1.volume() ;
	luas=k1.luas() ;
	pjg=k1.getPanjang ();
System.out.println("Kotak k1 luas="+luas+" volume="+vol+"Panjang="+pjg);
	}
}