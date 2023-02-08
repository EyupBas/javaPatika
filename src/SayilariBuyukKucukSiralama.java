import java.util.Scanner;

public class SayilariBuyukKucukSiralama {
    public static void main(String[] args) {
        int a,b,c;

        Scanner input = new Scanner(System.in);

        System.out.print("A Sayısını Giriniz: ");
        a = input.nextInt();

        System.out.print("B Sayısını Giriniz: ");
        b = input.nextInt();

        System.out.print("C Sayısını Giriniz: ");
        c = input.nextInt();

        if (a>b && a>c && b>c){
            System.out.println("A>B>C");
        } else if (a>b && a>c && c>b) {
            System.out.println("A>C>B");
        }
        if (b>a && b>c && a>c){
            System.out.println("B>A>C");
        } else if (b>a && b>c && c>a) {
            System.out.println("B>C>A");
        }
        if (c>a && c>b && a>b){
            System.out.println("C>A>B");
        } else if (c>a && c>b && b>a) {
            System.out.println("C>B>A");
        }
    }
}
