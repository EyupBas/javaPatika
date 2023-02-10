import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {

        String username,pasword;
        Scanner scanner = new Scanner(System.in);
        int right =3;
        int balance=1500;
        int select;

        while (right>0){
            System.out.println("Kullanici adiniz :");
            username = scanner.nextLine();
            System.out.println("Parolaniz :");
            pasword = scanner.nextLine();

            if(username.equals("patika")&& pasword.equals("dev123")){
                System.out.println("Merhaba, X Bankasina Hoş Geldiniz!");
               do{
                   System.out.println("Lütfen yapmak istediğiniz işlemi seçin");
                   System.out.println("1-Para Yatirma\n2-Para Çekme\n3-Bakiye Sorgulama\n" +
                           "4-Çıkış Yap");
                   select=scanner.nextInt();
                   if(select==1){
                       System.out.println("para miktari :");
                       int price=scanner.nextInt();
                       balance+=price;
                   }else if(select==2){
                       System.out.println("para miktari :");
                       int price=scanner.nextInt();
                       if(price>balance){
                           System.out.println("bakiye yetersiz!");
                       }else{
                           balance-=price;
                       }
                   }else if(select==3){
                       System.out.println("bakiyeniz :"+balance);
                   }
               }while (select!=4);
                System.out.println("tekrar görüşmek üzere");
                break;
            }else{
                right--;
                System.out.println("hatali kullanıcı adi veya şifre.tekrar giriniz");
                if(right==0){
                    System.out.println("hesabiniz bloke olmustur.");
                }else{
                    System.out.println("kalan hakkiniz :"+right);
                }

            }
        }





    }
}
