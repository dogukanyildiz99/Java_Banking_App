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
public class VadesizHesap extends BankaHesabi {
    private final String hesapTürü = "Vadesiz Hesap";

    public VadesizHesap(double bakiye) {
        super(bakiye);
    }
    
    public String getHesapTürü() {
        return hesapTürü;
    }
    
//toString() metodumuz    
    @Override
    public String toString() {
        return super.toString() + " - Hesap Türü: " + this.hesapTürü;
    }
    
//Bakiye için get ve set metotlarımız ?Override?
    @Override
    public void setBakiye(double bakiye) {
        super.setBakiye(bakiye); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getBakiye() {
        return super.getBakiye(); //To change body of generated methods, choose Tools | Templates.
    }

//Para Transferi metodu    
    public void paraTransferi(BankaHesabi alici, BankaHesabi gonderen, double miktar){
        alici.bakiyeEkle(miktar);
        gonderen.bakiyeDüs(miktar);
    }
    
//Kredi Kartı Borç Ödeme metodu    
    public void krediKartiBorcOdeme(KrediKarti krediKarti, double miktar){
        this.setBakiye(this.getBakiye() - miktar);
        krediKarti.krediKartiOde(miktar);
    }
}
