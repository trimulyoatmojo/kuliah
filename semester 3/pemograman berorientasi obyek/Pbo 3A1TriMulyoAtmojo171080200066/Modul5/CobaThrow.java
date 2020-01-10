public class CobaThrow {
	static void demo() {
		try{
				NullPointerException t;
				t = new NullPointerException("Test Throw");
				throw t;
				//Baris ini tak pernah dijalankan
			}catch (ArithmeticException e) {
				System.out.println("Auuuu");
			}
		}
		public static void main (String argv[]) {
			try{
				demo();
				System.out.println("Selesai");
			}catch (NullPointerException e) {
				System.out.println("Saya Tangkap sinyal NullPointerException :" + e);
				}
	}	
}		