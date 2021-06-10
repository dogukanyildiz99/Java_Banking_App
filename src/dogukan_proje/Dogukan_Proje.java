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
public class Dogukan_Proje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Örnek Test Grubu
        BankaPersoneli bankaPersoneli = new BankaPersoneli("Furkan", "Ergul", "frkn@gmail.com", 265245111);
        Musteri musteri1 = new Musteri("Dogukan", "Yıldız", "dgkn@gmail.com", 215245121);
        Musteri musteri2 = new Musteri("Miracetdin", "Yıldız", "mrctdn@gmail.com", 221245131);
        
        // Banka Personeline Müşteri eklenmesi ve listelenmesi       
        System.out.println("Görevli Personel:");
        System.out.println(bankaPersoneli.toString());
        System.out.println("\nGörevli Personele Ait Müşteriler:");
        

        bankaPersoneli.musteriEkle(musteri1);
        bankaPersoneli.musteriEkle(musteri2);
        bankaPersoneli.musteriListele();
        
        // Müşterilere hesap eklenmesi ve listelenmesi
        System.out.println("\nMüşterilerin Hesap Bilgileri");
        
        musteri1.hesapEkle("Vadesiz Hesap", 2000);
        musteri1.hesapEkle("Yatırım Hesabı", 3500);
        System.out.println(musteri1.toString());
        musteri1.hesapListele();
        
        musteri2.hesapEkle("Vadesiz Hesap", 1000);
        musteri2.hesapEkle("Yatırım Hesabı", 4000);
        System.out.println("\n" + musteri2.toString());
        musteri2.hesapListele();
        
        // Müşteriye kart ekleme ve kartı listeleme
        System.out.println("\nMüşterilerin Kart Bilgileri");
        
        musteri1.krediKartiEkle(5000, 1500);
        System.out.println(musteri1.toString());
        musteri1.krediKartiListele();
        
        musteri2.krediKartiEkle(7000, 3600);
        System.out.println("\n" + musteri2.toString());        
        musteri2.krediKartiListele();
        
    }
}
