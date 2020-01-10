public class TwoThreadTest {
    public static void main (String argv [] ){

    
    SimpleThread t1,t2;
    t1 = new SimpleThread ("Surabaya");
    t2 = new SimpleThread ("Jakarta");
    t1.start ();
    t2.start ();
          }
}