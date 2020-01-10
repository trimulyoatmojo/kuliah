public class TestKotakHitam {
    public static void main (String argv[]){
		KotakHitam k1, k2;
		int vol1, luas1, pjg1, vol2, luas2, pjg2;
		k1=new KotakHitam (10,15,4,"Halo Java ");
		k2=new KotakHitam ();
		vol1=k1.volume();
		luas1=k1.luas();
		pjg1=k1.getPanjang();
		System.out.println("Kotak k1 Luas = "+luas1+ "  Volume ="+vol1+ "  Panjang = "+pjg1);
		vol2=k2.volume();
		luas2=k2.luas();
		pjg2=k2.getPanjang();
		System.out.println("Kotak k2 Luas = "+luas2+ "  Volume ="+vol2+ "  Panjang = "+pjg2);
    	k1.rekam("Ada Suara Pesawat Terbang");
    	k2.rekam("Ada Tanda Sirene dari arah Utara");
    	k1.putarRekaman();
    	k2.putarRekaman();
    }
  } 