import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        /*
        Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp
        sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve
         unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,
          şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz.
        " sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
         */
        String userName,password,password1;
        int sonuc;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adı: ");
        userName = input.nextLine();

        System.out.print("Şifreniz: ");
        password = input.nextLine();

        if (userName.equals("Eyup") && password.equals("Bas")){
            System.out.println("Giriş Yaptınız");
        }else{
            System.out.println("Hatalı Giriş Yaptınız\nŞifrenizi Yenilemek İstiyorsanız 1'i İstemiyorsanız 2'yi Tıklayınız");
            sonuc = input.nextInt();

            switch (sonuc){
                case 1:
                    Scanner user = new Scanner(System.in);
                    System.out.print("Yeni Şifrenizi Giriniz: ");
                    password1 = user.nextLine();
                    if (password1.equals("Bas") || password1.equals(password)){
                        System.out.println("Hatalı Giriş Yaptınız");
                    }else{
                        System.out.println("Şifreniz Başarıyla Yenilenmiştir");
                    }
                    break;
                default:
                    System.out.println("Hatalı Giriş Yaptınız");
            }

        }

    }
}
