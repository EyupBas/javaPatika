import java.util.Scanner;

public class KdvTutari {
    public static void main(String[] args) {
        /*
        KDV Tutarı Hesaplayan Program
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve
 KDV tutarını hesaplayıp ekrana bastıran programı yazın.

(Not : KDV tutarını 18% olarak alın)

KDV'siz Fiyat = 10;

KDV'li Fiyat = 11.8;

KDV tutarı = 1.8;

Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
         */
        double tutar,kdvOran =0.18 ;
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen Ödeme Tutarınızı Girin : ");
        tutar = inp.nextDouble();

        double  kdvTutari= tutar * kdvOran ;
        double  kdvliTutar = tutar + kdvTutari;

        kdvOran = (tutar<=1000) ? 0.18 : 0.8 ;

        System.out.println("KDV'siz Tutar :" + tutar);
        System.out.println("KDV Oranı :" + kdvOran);
        System.out.println("KDV Tutarı :" + kdvTutari);
        System.out.println("KDV'li Tutar :" + kdvliTutar);
    }
}
