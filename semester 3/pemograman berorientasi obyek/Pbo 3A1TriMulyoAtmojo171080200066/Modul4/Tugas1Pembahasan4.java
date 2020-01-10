class Tugas1 extends Thread{
public Tugas1(String nama){
		super(nama);
	} 	
	public void run(){
		for (int i=0;i<10;i++){
			System.out.println(i+" "+getName());
			try{
				sleep((int)Math.random()*10000);
			}catch(Exception t){}
		}
		System.out.println("SELESAI "+getName());
	}       
}

class Tugas1K1 extends Thread{
public Tugas1K1(String nama) {
	super(nama);
    }
public void run(){
	for (int i=0 ;i<10; i++){
		System.out.println(i+""+getName());
	}
System.out.println("SELESAI "+getName());
    }
}

class Tugas1Pembahasan4 {
	public static void main (String [] args){
	Tugas1 t1=new Tugas1(" Tri ");
	Tugas1K1 t2=new Tugas1K1(" Mulyo Atmojo");
	Tugas1 t3=new Tugas1(" 7 Pagi A");
	t1.start();
	t2.start();
	t3.start();
	}
}
