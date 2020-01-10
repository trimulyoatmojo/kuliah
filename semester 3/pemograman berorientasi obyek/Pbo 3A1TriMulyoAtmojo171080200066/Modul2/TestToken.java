import java.util.*;
public class TestToken {
	public static void main (String argv[]) {
		String kalimat= "Di sini Pencerahan Bersemi";
		StringTokenizer st =new StringTokenizer(kalimat," ");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}