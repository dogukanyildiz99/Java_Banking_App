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
public class Musteri extends Kisi{
    private int musteriNumarasi;
    //Müşteri Numarasını random almak için
    Random random = new Random();
    
    private ArrayList<KrediKarti> krediKartlari = new ArrayList<>();
    private ArrayList<BankaHesabi> hesaplar = new ArrayList<>();
    
    public Musteri(String ad, String soyad, String email, long telefonNumarasi) {
        super(ad, soyad, email, telefonNumarasi);
        this.musteriNumarasi = random.nextInt(100);
    }
    
//toString() metodumuz
    @Override
    public String toString() {
        return super.toString() + " - Müşteri Numarası : " + this.musteriNumarasi;
    }

//Müşteri Numarası için get ve set metotlarımız    
    public int getMusteriNumarasi() {
        return musteriNumarasi;
    }

    public void setMusteriNumarasi(int musteriNumarasi) {
        this.musteriNumarasi = musteriNumarasi;
    }
    
//Random için get ve set metotlarımız  
    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

//Kredi Kartı Ekle, Sil ve Listele metotları
    public void krediKartiEkle(double limit, double guncelBorc){
        KrediKarti krediKarti = new KrediKarti(limit, guncelBorc);
        this.krediKartlari.add(krediKarti);
    }
    
    public void krediKartiSil(int kartNo){
        for(int i=0; i<krediKartlari.size(); i++){
            if(kartNo == this.krediKartlari.get(i).getKartNumarasi()){
                if(this.krediKartlari.get(i).getGuncelBorc() != 0){
                    System.out.println("Lütfen önceikle borç ödenmesi yapınız!");
                }
                else{
                    
                }
            }
        }
    }
    
    public void krediKartiListele(){
        for(int i=0; i<this.krediKartlari.size(); i++){
            System.out.println(this.krediKartlari.get(i).toString());
        }
    }

//Hesap Ekle, Sil ve Listele metotları    
    public void hesapEkle(String hesapTürü, double bakiye){
        BankaHesabi bankaHesabi;
        if(hesapTürü.equals("Vadesiz Hesap")){
            bankaHesabi = new VadesizHesap(bakiye);
        }
        else{
            bankaHesabi = new YatirimHesabi(bakiye);
        }
        this.hesaplar.add(bankaHesabi);
    }

    public void hesapSil(int iban){
        for(int i=0; i<this.hesaplar.size(); i++){
            if(iban == this.hesaplar.get(i).getIban()){
                if(this.hesaplar.get(i).getBakiye() > 0){
                    System.out.println("Lütfen öncelikle bakiyenizi başka bir hesaba akatarınız!");
                }
                else{
                    this.hesaplar.remove(i);
                }
            }
        }
    }
    
    public void hesapListele(){
        for(int i=0; i<this.hesaplar.size(); i++){
            System.out.println(this.hesaplar.get(i).toString());
        }
    }
}
