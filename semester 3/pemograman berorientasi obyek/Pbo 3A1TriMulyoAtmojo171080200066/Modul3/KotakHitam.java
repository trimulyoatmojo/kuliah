public class KotakHitam extends Kotak2 {

  private String rekaman;

    public KotakHitam(){
    	super();
    	rekaman="";
    }
    public KotakHitam(int pjg,int lbr,int tg,String rkm){
    	super(pjg,lbr,tg);
    	rekaman=rkm;
    }
    public void rekam(String teks){
    	rekaman=rekaman+""+teks;
    }
    public void putarRekaman(){
    	System.out.println(rekaman);
    }
 } 