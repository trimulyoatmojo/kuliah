public class OprTest{
	public static void main (String[] args){
		byte b=0x8;
		byte c, d, e, f, g, h, i;
		c=(byte)~b;
		c &=0xf;
		d= (byte) (b | c);
		e= (byte) (c>>2);
		f= (byte) (e+3);
		g= (byte) (c & f);
		h= c;
		h ^=0x3;
		i= (byte) (h >>>1);
		i <<=2;
		System.out.println(" c = " + c);
		System.out.println(" d = " + d);
		System.out.println(" e = " + e);
		System.out.println(" f = " + f);
		System.out.println(" g = " + g);
		System.out.println(" h = " + h);
		System.out.println(" i = " + i);
	}
}