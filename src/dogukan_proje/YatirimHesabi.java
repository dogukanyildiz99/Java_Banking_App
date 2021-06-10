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
public class YatirimHesabi extends BankaHesabi{
    private final String hesapTürü = "Yatırım Hesabı";

    public YatirimHesabi(double bakiye) {
        super(bakiye);
    }
    
//toString() metodumuz    
    @Override
    public String toString() {
        return super.toString() + " - Hesap Türü: " + this.hesapTürü;
    }

//Hesap Türü için get metodumuz    
    public String getHesapTürü() {
        return hesapTürü;
    }

//Para Ekle ve Çek metotları    
    public void paraEkle(double miktar){
        this.bakiyeEkle(miktar);
    }
    
    public void paraCek(double miktar){
        this.bakiyeDüs(miktar);
    }
}
