public class ThrowDemo {
	static void demo()throws IllegalAccessException {
		System.out.println("xxxxxx");
		throw new IllegalAccessException
	("ThrowDemo");
		}
		public static void main (String argv[] ) {
			try{
				demo();
			System.out.println("Selesai");
				}catch (IllegalAccessException e) {
			System.out.println("Saya tangkap " + e);
			}
	}
}
	
