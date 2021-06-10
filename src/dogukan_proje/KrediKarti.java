/*  
 *  DOĞUKAN YILDIZ
 *  20360859095
 *  NESNEYE YÖNELİK PROGRAMLAMA DÖNEM ÖDEVİ
 */
package dogukan_proje;

import java.util.Random;

/**
 *
 * @author doguk
 */
public class KrediKarti {
    private int kartNumarasi;
    private double limit;
    private double guncelBorc;
    private double kullanılabilirLimit;
    //Kart Numarasını random almak için
    Random random = new Random();

    public KrediKarti(double limit, double guncelBorc) {
        this.limit = limit;
        this.guncelBorc = guncelBorc;
        this.kullanılabilirLimit = limit - guncelBorc;
        this.kartNumarasi = random.nextInt(1000);
    }
    
//toString() metodumuz    
    @Override
    public String toString() {
        return "Kart No: " + this.kartNumarasi + " - Limit: " + this.limit + " - Güncel Borç: " + this.guncelBorc + 
                " - Kullanılabilir Limit: " + this.kullanılabilirLimit;
    } 
    
//Kart Numarası için get ve set metotlarımız
    public int getKartNumarasi() {
        return kartNumarasi;
    }

    public void setKartNumarasi(int kartNumarasi) {
        this.kartNumarasi = kartNumarasi;
    }
    
//Limit için get ve set metotlarımız
    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }
    
//Güncel Borç için gerekli metotlar
    public double getGuncelBorc() {
        return guncelBorc;
    }

    public void setGuncelBorc(double guncelBorc) {
        this.guncelBorc = guncelBorc;
    }
   
//Kullanılabilir Limit için gerekli metotlar
    public double getKullanılabilirLimit() {
        return kullanılabilirLimit;
    }

    public void setKullanılabilirLimit(double kullanılabilirLimit) {
        this.kullanılabilirLimit = kullanılabilirLimit;
    }

//Kredi Kartı borcunu ödemek için gerekli metodumuz    
    public void krediKartiOde(double miktar){
        this.guncelBorc -= miktar;
    }    
}
