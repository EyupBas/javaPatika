import java.util.Scanner;

public class AtmProjesiSwichCase {
    public static void main(String[] args) {
        String username,password;
        Scanner input = new Scanner(System.in);
        int right =3;
        int balance = 1500;
        int select;

        System.out.println("PATIKA BANKASI'NA HOŞ GELDINIZ!");

        while (right>0){

            System.out.print("Kullanıcı Adı : ");
            username = input.nextLine();

            System.out.print("Şifre : ");
            password = input.nextLine();

            if (username.equals("patika") && password.equals("123")){

                System.out.println("\nPATIKA BANKASINA HOŞGELDİNİZ\n");

                do {

                    System.out.println("1-Para yatırma\n2-Para Çekme\n3-Bakiye Sorgula\n4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();

                    switch (select) {

                        case 1:  System.out.print("Para miktarı : ");
                            int price = input.nextInt();
                            if (price<0){
                                System.out.println("Hatalı İşlem");
                            }else{
                                balance += price;
                                System.out.println("başka bir işleminiz var mı?");
                            }
                            break;
                        case 2: System.out.print("Para miktarı : ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz.");
                                System.out.println("başka bir işleminiz var mı?");
                            } else if (price<0) {
                                System.out.println("Hatalı Giriş");
                                System.out.println("başka bir işleminiz var mı?");
                            }else {
                                balance -= price;
                                System.out.println("başka bir işleminiz var mı?");
                            }
                    } switch (select) {
                        case 3 :System.out.println("Bakiyeniz : " + balance);
                            System.out.println("başka bir işleminiz var mı?");
                    }

                } while (select != 4);
                System.out.println("Tekrar Bekleriz");
                break;
            }else{
                right--;
                System.out.println("Hatalı Kullanıcı Adı Veya Şifre Tekrar Deneyiniz.");
                if (right==0){
                    System.out.println("Hesabınız Bloke Olmuştur Lütfen HAN Bankası İle İletişime Geçiniz");
                }else {
                    System.out.println("Kalan hakkınız :"+ right);
                }

            }

        }
    }
}
