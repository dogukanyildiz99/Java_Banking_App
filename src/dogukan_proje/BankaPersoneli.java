/*  
 *  DOĞUKAN YILDIZ
 *  20360859095
 *  NESNEYE YÖNELİK PROGRAMLAMA DÖNEM ÖDEVİ
 */
package dogukan_proje;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author doguk
 */
public class BankaPersoneli extends Kisi{
    private int personelID;
    Random random = new Random();
    
    ArrayList<Musteri> musteriler = new ArrayList<>();
    
    public BankaPersoneli(String ad, String soyad, String email, long telefonNumarasi) {
        super(ad, soyad, email, telefonNumarasi);
        this.personelID = random.nextInt(100);
    }

//toString() methodumuz
    @Override
    public String toString() {
        return super.toString() + " - Personel ID: " + this.personelID;
    }
    
//Personel ID için get ve set metotlarımız
    public int getPersonelID() {
        return personelID;
    }

    public void setPersonelID(int personelID) {
        this.personelID = personelID;
    }

//Random için get ve set metotlarımız
    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

//Müşteri Ekle, Sil ve Listele metotları
    public void musteriEkle(Musteri musteri){
        musteriler.add(musteri);
    }
    
    public void musteriSil(int musteriNo){
        for(int i=0; i<this.musteriler.size(); i++){
            if(musteriNo == this.musteriler.get(i).getMusteriNumarasi()){
                this.musteriler.remove(i);
            }
        }
    }
    
    public void musteriListele(){
        for(int i=0; i<this.musteriler.size(); i++){
            System.out.println(this.musteriler.get(i).toString());
        }
    }
}
