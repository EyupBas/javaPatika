import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {
    public static void main(String[] args) {
        /*
Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
 Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş)
 bilgilerini alın.
 Mesafe başına ücret 0,10 TL / km olarak alın.
 İlk olarak uçuşun toplam fiyatını hesaplayın ve
 sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli
 (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
 Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
         */
        int mesafe,yas,yolculuktipi;
        double mesafebasiucret = 0.10,toplamfiyat,idirimlitutar;
        Scanner inp = new Scanner(System.in);
        System.out.print("gidilecek mesafe (km) : ");
        mesafe = inp.nextInt();
        System.out.print("yaşınızı giriniz : ");
        yas  = inp.nextInt();
        System.out.print("yolculuk tipiniz tek yön ise =1 , çift yön ise =2 yazınız   : ");
        yolculuktipi = inp.nextInt();
        if (yas >=1 && (yolculuktipi==1 || yolculuktipi == 2 )&& mesafe>=1  ){
            toplamfiyat = mesafe*mesafebasiucret;

            if (yas < 12 ){

                toplamfiyat =toplamfiyat-(toplamfiyat*0.5);
            }
            else if (yas>=12 && yas<=24){
                toplamfiyat=toplamfiyat-(toplamfiyat*0.1);
            } else if (yas>65) {
                toplamfiyat=toplamfiyat-(toplamfiyat*0.3);
            }
            if (yolculuktipi == 2) {
                toplamfiyat= toplamfiyat-(toplamfiyat*0.2);
            }

            System.out.println("toplam maliyetiniz : "+toplamfiyat+" TL");
        }
        else {
            System.out.println("hatalı veri girdiniz !");
        }




    }
}
