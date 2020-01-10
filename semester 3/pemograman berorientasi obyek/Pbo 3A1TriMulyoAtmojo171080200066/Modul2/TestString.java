public class TestString {
	public static void main(String argv[]){
		String tabel[]={"amir","bambang","hasan"};
		String str="Ini adalah # String yang diproses";
		boolean found=false;
		int I;
		for (I=0;I<str.length();I++){
			if (str.charAt(I)=='#'){
				found=true;
				break;
			}
		}
		if (found)
			System.out.println("Posisi ="+I);
	}
}
