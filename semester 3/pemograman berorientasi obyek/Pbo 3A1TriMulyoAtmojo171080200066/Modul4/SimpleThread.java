public class SimpleThread extends Thread{
    public SimpleThread(String nama) {
          super(nama);
    }
    public void run(){
        for (int i=0 ;i<10; i++) {
               System.out.println(i+""+getName());
        }
    System.out.println("SELESAI "+getName());
    }
}