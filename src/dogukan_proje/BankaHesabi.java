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
public class BankaHesabi {
    private int iban;
    private double bakiye;
    //IBAN değerini random almak için
    Random random = new Random();  
    
    public BankaHesabi(double bakiye) {
        this.bakiye = bakiye;
        this.iban = random.nextInt(1000);
    }
    
//toString() metodu
    @Override
    public String toString() {
        return "IBAN: " + this.iban + " - Bakiye: " + this.bakiye;
    }
    
//IBAN için get ve setterlar
    public int getIban() {
        return iban;
    }

    public void setIban(int iban) {
        this.iban = iban;
    }

//Bakiye için get ve set metotlarımız   
    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
    
//Random için get ve set metotlarımız
    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }    
    
//Bakiye Ekle ve Düş metotları  
    public void bakiyeEkle(double miktar){
        this.bakiye += miktar;
    }
    
    public void bakiyeDüs(double miktar){
        this.bakiye -= miktar;
    }
}
