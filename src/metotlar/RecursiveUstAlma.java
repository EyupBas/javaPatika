package metotlar;

import java.util.Scanner;

public class RecursiveUstAlma {
    static int usluSayi(int a,int b){

        if (a == 1 || b == 0) {

            return 1;

        }
        return a*usluSayi(a,b-1);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen taban sayısını giriniz: ");
        int a = sc.nextInt();
        System.out.print("Lütfen üst sayısını giriniz: ");
        int b = sc.nextInt();
        System.out.println(usluSayi(a,b));

    }
}
