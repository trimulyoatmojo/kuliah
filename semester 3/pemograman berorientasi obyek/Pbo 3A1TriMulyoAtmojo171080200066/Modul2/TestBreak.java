public class TestBreak {
	public static void main (String argv[]) {
		int i, j;
		j = 50;
		for (i=5; i>0; i--) {
			if (j>100)
				break;
			j += 50;
		System.out.println(" i = " +i);
		}
		System.out.println("Program berhenti i="+i +"j="+j);
	}
}