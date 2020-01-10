public class kotak2 {
	private int Panjang, Lebar, Tinggi;
	public kotak2 () {
		Panjang=0;
		Lebar=0;
		Tinggi=0;
	}
	public kotak2(int pjg,int lbr, int tg) {
		Panjang= pjg;
		Lebar= lbr;
		Tinggi= tg;
	}
	public void setPanjang(int pjg) {
		Panjang= pjg;
	}
	public void setLebar(int lbr) {
		Lebar= lbr;
	}
	public void setTinggi(int tg) {
		Tinggi= tg;
	}
	public int getPanjang () {
		return Panjang;}
	public int getLebar () {
		return Lebar;}
	public int getTinggi () {
		return Tinggi;}
	public int luas () {
		int hasil;
		hasil=2*Panjang*Lebar+2*Panjang*Tinggi+2*Lebar*Tinggi;
		return hasil;}
	public int volume () {
		int hasil;
		hasil=Panjang*Lebar*Tinggi;
		return hasil;}
}