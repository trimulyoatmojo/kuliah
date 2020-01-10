import java.io.*;
import java.util.*;
public class TokenFile {
	public static void main (String argv[]) {
		TokenFile tt=new TokenFile();
			tt.dbTest();
				}
			public void dbTest() {

			DataInputStream dis=null;
			String dbRecord=null;

				try {
	File f=new File ("customer.txt");
	FileInputStream fis=new FileInputStream(f);
	BufferedInputStream bis=new BufferedInputStream(fis);
	dis=new DataInputStream(fis);

	//read db
	while((dbRecord=dis.readLine())!=null) {

	StringTokenizer st= new StringTokenizer(dbRecord, ":");
	String namaDepan =st.nextToken();
	String namaBelakang =st.nextToken();
	String kota=st.nextToken();
	String propinsi=st.nextToken();

	System.out.println("Nama Depan 		:"+namaDepan);
	System.out.println("Nama Belakang		:"+namaBelakang);
	System.out.println("Kota 			:"+kota);
	System.out.println("Propinsi		:"+propinsi);
				}
	}  catch (IOException e) {
	//Catch error
	System.out.println("IOExceprion error!"+e.getMessage());
	
	} finally {
	if(dis!=null){
		try {
		dis.close();
		} catch (IOException ioe) {
			}

			}
		}
	}
}
