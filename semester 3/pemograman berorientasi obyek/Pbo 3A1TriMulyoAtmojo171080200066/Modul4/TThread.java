import java.awt.*;
public class TThread extends Thread{
  Component oby;
  int delay;
  public TThread(Component oby, int delay){
       this.oby=oby;
       this.delay=delay;
  }
  public void run() {
      while (true) {
              try{
                     oby.repaint();
                     sleep(delay);
              }
              catch (Exception e){}
      }
  }
}