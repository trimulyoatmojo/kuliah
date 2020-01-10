public class Kotak {
	private int Panjang, Lebar, Tinggi;
	public void setPanjang (int pjg) {
		Panjang=pjg;}
	public void setLebar (int lbr) {
		Lebar=lbr;}
	public void setTinggi (int tg) {
		Tinggi=tg;}	
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