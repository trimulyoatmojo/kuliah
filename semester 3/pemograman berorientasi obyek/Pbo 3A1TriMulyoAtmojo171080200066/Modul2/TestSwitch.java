public class TestSwitch {
	public static void main (String argv[]) {
		char c='_';
		switch (c) {
			case '+':
				System.out.println("Operasi penjumlahan");
				break;
			case '_':
				System.out.println("Operasi pengurangan");
				break;
			case '/':
				System.out.println("Operasi pembagian");
				break;
			case '*':
				System.out.println("Operasi perkalian");
				break;
			default:
				System.out.println("Operasi tidak dikenal");
		}
	}
}