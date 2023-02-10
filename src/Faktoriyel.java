import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        /*
        Ödev
N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

Java ile kombinasyon hesaplayan program yazınız.

Kombinasyon formülü
C(n,r) = n! / (r! * (n-r)!)
         */
        Scanner sayi = new Scanner(System.in);
        int n,r,k,sonuc,fark=1,toplam=1,grup=1;
        System.out.print("Lütfen bir sayı giriniz: ");
        n = sayi.nextInt();
        System.out.print("Lütfen grup sayınısı giriniz: ");
        r = sayi.nextInt();

        for (int i=1 ; i<=n ; i++) {
            toplam *=i;

        }
        for (int i=1 ; i<=r ; i++) {
            grup *=i;
        }

        k = n-r;
        for (int i=1 ; i<=k; i++) {
            fark *=i;
        }

        sonuc = toplam/(grup*fark);
        System.out.println("Kombinasyon= " +sonuc);
    }
}
