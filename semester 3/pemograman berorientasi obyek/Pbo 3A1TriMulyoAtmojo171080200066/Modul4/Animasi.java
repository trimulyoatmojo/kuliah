import java.applet.*;
import java.awt.*;

public class Animasi extends Applet {
	int count, lastcount;
	Image gambar[];
	TThread timer;
	Button btnStart;
	Button btnStop;

	public void init() {
		gambar = new Image[17];
		lastcount=17;
		count=0;
		MediaTracker mt=new MediaTracker(this);
		for (int i=0; i<lastcount; i++) {

	gambar[i]=getImage(getCodeBase(),"T"+(i+1)+".gif");
			mt.addImage(gambar[i],0);
		}
		mt.checkAll(true);
		btnStop=new Button("Stop");
		add(btnStop);
		btnStart=new Button("Start");
		add(btnStart);
		show();
	}
	public void start() {
		if (timer==null) {
			timer=new TThread(this,75);
			timer.start();
			showStatus("Start...");			
		}
	}
	public void stop() {
		if (timer!=null) {
			showStatus("Stop...");	
			timer.stop();
			timer=null;		
		}
	}
}