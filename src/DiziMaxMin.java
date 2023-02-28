import java.util.Arrays;
import java.util.Scanner;

public class DiziMaxMin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("bir sayı girin : ");
        int number = scan.nextInt();
        int max =  0 ;
        int min = 0 ;
        int[] dizi = {1, 2, 12, 21, 231, 32, 4, 3};
        Arrays.sort(dizi);
        for (int i  = 0 ; i < dizi.length;i++  ){
            if (number < dizi[i]){
                max  = dizi[i];
                min = dizi[i-1];
                break;
            }
        }
        System.out.println("En yakın ve en büyük deger : " + max);
        System.out.println("en küçük ve en yakın deger :  " + min);
    }
    }

