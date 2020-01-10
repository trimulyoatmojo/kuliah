public class Konversi1 {
    private int jarak;
    public void setJarak (int jrk) {
         jarak=jrk;
    }
    public int getJarak(){
    return jarak;
    }
    public int m2k(){
    int hasil;
    hasil=jarak/1000;
    return hasil;
    }
    public int k2m(){
    int hasil;
    hasil=jarak*1000;
    return hasil;
    }
}