import java.util.Scanner;

public class MinVeMaxDegerBulma {
    public static void main(String[] args) {
        /*
        Ödev - Girilen Sayılardan Min ve Max Değerleri Bulma
Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.

Senaryo
Kaç tane sayı gireceksiniz: 4
1. Sayıyı giriniz: 16
2. Sayıyı giriniz: -22
3. Sayıyı giriniz: -15
4. Sayıyı giriniz: 100
En büyük sayı: 100
En küçük sayı: -22
         */
        Scanner input = new Scanner(System.in);

        int value;
        int number;
        int max=0;
        int min=0;

        System.out.print("Girilecek Sayı Miktarı : ");
        value = input.nextInt();

        for (int i=1; i<=value; i++){

            System.out.print("Bir Sayı Giriniz : ");
            number = input.nextInt();


            if (i == 1){
                max = number;
                min = number;
            }
            if (max<number){
                max = number;
            }
            if (min>number){
                min=number;
            }

        }
        System.out.println("En Küçük Sayı : " + min);
        System.out.println("En Büyük Sayı : " + max);
    }
}
