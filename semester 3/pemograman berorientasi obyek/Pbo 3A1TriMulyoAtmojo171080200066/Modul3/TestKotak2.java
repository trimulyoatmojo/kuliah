public class TestKotak2 {
	public static void main (String argv []) {
		kotak2 k1, k2;
		int vol1, luas1, pjg1, vol2, luas2, pjg2;
		k1=new kotak2(10,15,4);
		k2=new kotak2();
		vol1=k1.volume();
		luas1=k1.luas();
		pjg1=k1.getPanjang();
			System.out.println("Kotak2 k1 Luas = "+luas1+" volume = "+vol1+" Panjang = "+pjg1);

		vol2=k2.volume();
		luas2=k2.luas();
		pjg2=k2.getPanjang();
			System.out.println("Kotak2 k2 Luas = "+luas2+" Volume = "+vol2+" Panjang = "+pjg2);
	}
} 