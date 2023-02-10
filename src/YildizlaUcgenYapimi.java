import java.util.Scanner;

public class YildizlaUcgenYapimi {
    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("sayi girin");

        int n=scanner.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=(n-i) ; j++) {
                System.out.print(" ");

            }
            for (int k = 1; k <(2*i)-1 ; k++) {
                System.out.print("*");

            }
            System.out.println();

        }


         */
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz : ");
        int number = input.nextInt();
        int a = 1, tempNumber = number;
        while(a > 0){
            for(int i = 1; i<=number; i++){
                for(int j = 1; j<=(number-i); j++){
                    System.out.print(" ");
                }
                for(int k=1; k<=(2*i)-1; k++){
                    System.out.print("*");
                }
                System.out.println(" ");
            }
            for(int x = 1; x<=number; x++){
                for(int y = 0; y<=(x-1); y++){
                    System.out.print(" ");
                }
                for(int z= 3; z<=(2*tempNumber)-1; z++){
                    System.out.print("*");
                }
                tempNumber --;
                System.out.println(" ");
            }
            a--;

        }
    }
}
