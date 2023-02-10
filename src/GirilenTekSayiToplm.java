import java.util.Scanner;

public class GirilenTekSayiToplm {
    public static void main(String[] args) {
        /*
        Ödev
Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
 girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp
 ekrana basan programı yazıyoruz.
         */
        int sayi, sub = 0;
        Scanner number = new Scanner(System.in);


        do{
            System.out.print("Lütfen bir sayı giriniz : ");
            sayi = number.nextInt();
            if(sayi % 4 == 0){
                sub += sayi;
            }
        }while(sayi % 2 == 0);

        System.out.println("4 ün katları olarak girilen sayıların toplamı : " + sub);
    }
    }


