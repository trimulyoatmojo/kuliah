public class arg01 {
	public static void main (String argv []) {
				String str="??????";
				try{
					str = argv[0];
				}catch(ArrayIndexOutOfBoundsException e) {
				
					System.out.println("argument Kosong");
		}
		System.out.println("Argument="+str);
	}
}