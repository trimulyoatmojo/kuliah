public class pDemo2 extends p {
	int b=10;
	public void cetak () {
		System.out.println ("Class Aktual : b ="+b);
		super.cetak(); //memangil cetak di super class p
	}
	public static void main (String argv []) {
		pDemo2 p=new pDemo2();
		p.cetak ();
	}
}