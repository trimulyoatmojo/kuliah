import java.applet.*;
import java.awt.*;
import java.lang.*;
public class Animasi1 extends Applet implements java.lang.Runnable{
	int count, lastcount;
	Image gambar[];
	Button btnStart;
	Button btnStop;
	Thread timer;
	
	public void init(){
		gambar=new Image[17];
		lastcount=17;
		count=0;
		MediaTracker mt=new MediaTracker(this);
		for (int i=0; i<lastcount; i++){	
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
	public void start(){
		if(timer==null){
			timer=new Thread(this);
			timer.start();
			showStatus("Start..");
		}
	}
	public void stop(){
		if (timer!=null){
			showStatus("Stop..");
			timer.stop();
			timer=null;
		}	}
	public boolean action(Event e, Object o){
	if(e.target==btnStop){
		stop();
		return true;
	}
	if(e.target==btnStart){
		start();
		return true;
	}
	return false;
}
public void paint(Graphics g){
	g.drawImage (gambar[count++],70,70,null);
	if(count==lastcount)
		count=0;
		showStatus("Gambar no"+(count+1));
		setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
		setBackground(java.awt.Color.lightGray);
		//setSize(0,0);
}
public void run(){
	while (isActive()){
		try{
			repaint();
			Thread.sleep(100);
		}
		catch(Exception e){
			showStatus("Exception :"+e);
		}		
	}
	showStatus("Not Active");
	timer=null;
	}}