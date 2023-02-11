import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int number;
        int one=0;
        int two=1;
        int total=0;

        System.out.print("Bir Sayı Giriniz : ");
        number = input.nextInt();

        System.out.print(one+" "+two);

        for (int i=1; i<=number; i++){

            total = one+two;
            System.out.print(" "+total);

            one=two;
            two=total;

        }

    }
}
