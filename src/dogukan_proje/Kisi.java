/*  
 *  DOĞUKAN YILDIZ
 *  20360859095
 *  NESNEYE YÖNELİK PROGRAMLAMA DÖNEM ÖDEVİ
 */
package dogukan_proje;

/**
 *
 * @author doguk
 */
public class Kisi {
    private String ad;
    private String soyad;
    private String email;
    private long telefonNumarasi;

    Kisi(String ad, String soyad, String email, long telefonNumarasi){
        this.ad = ad;
        this.soyad = soyad;
        this.email = email;
        this.telefonNumarasi = telefonNumarasi;
    }
//toString() metodumuz
    @Override
    public String toString() {
        return "İsim: " + this.ad + " - Soyisim: " + this.soyad + " - Tel: " + this.telefonNumarasi + " - Mail: " + this.email;
    }
    
//Ad için get ve set metotlarımız
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

//Soyad için get ve set metotlarımız
    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

//Email için get ve set metotlarımız
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
//TelefonNumarasi için get ve set metotlarımız
    public long getTelefonNumarasi() {
        return telefonNumarasi;
    }

    public void setTelefonNumarasi(long telefonNumarasi) {
        this.telefonNumarasi = telefonNumarasi;
    }
}
