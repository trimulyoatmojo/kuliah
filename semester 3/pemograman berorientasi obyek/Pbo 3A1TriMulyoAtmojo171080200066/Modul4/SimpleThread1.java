public class SimpleThread1 extends Thread {
    public SimpleThread1 (String nama) {
        super (nama);
    }
    public void run (){
         for (int i=0;i<10;i++){
                System.out.println(i+" "+getName());
                try{
                      sleep((int)Math.random()*10000);
                }catch(Exception e){}
         }
         System.out.println("SELESAI "+getName());

    }
}