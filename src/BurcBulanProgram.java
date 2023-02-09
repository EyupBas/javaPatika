import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {
        /*
        Burç Bulan Program

Koç Burcu : 21 Mart - 20 Nisan

Boğa Burcu : 21 Nisan - 21 Mayıs

İkizler Burcu : 22 Mayıs - 22 Haziran

Yengeç Burcu : 23 Haziran - 22 Temmuz

Aslan Burcu : 23 Temmuz - 22 Ağustos

Başak Burcu : 23 Ağustos - 22 Eylül

Terazi Burcu : 23 Eylül - 22 Ekim

Akrep Burcu : 23 Ekim - 21 Kasım

Yay Burcu : 22 Kasım - 21 Aralık

Oğlak Burcu : 22 Aralık - 21 Ocak

Kova Burcu : 22 Ocak - 19 Şubat

Balık Burcu : 20 Şubat - 20 Mart

Ödev
Aynı örneği switch-case kullanmadan yapınız.
         */

        int month,day;
        Scanner input=new Scanner(System.in);
        System.out.println("Doğduğunuz ayi rakam olarak girin");
        month=input.nextInt();

        System.out.println("Doğduğunuz günü rakam olarak girin");
        day=input.nextInt();

        switch(month){
            case 1:
                if (day <= 21) {
                    System.out.println("Oğlak Burcusunuz");
                } else
                    System.out.println("Kova burcusunuz");
                break;

                case 2:
                    if (day <= 19) {
                        System.out.println("Kova Burcusunuz");
                    } else
                        System.out.println("Balık burcusunuz");
                    break;
                    case 3:
                        if (day <= 20) {
                            System.out.println("Balık Burcusunuz");
                        } else
                            System.out.println("Koç burcusunuz");
                        break;
            case 4:
                if (day <= 20) {
                    System.out.println("Koç Burcusunuz");
                } else
                    System.out.println("Boğa burcusunuz");
                break;
            case 5:
                if (day <= 21) {
                    System.out.println("Boğa Burcusunuz");
                } else
                    System.out.println("İkizler burcusunuz");
                break;
            case 6:
                if (day <= 22) {
                    System.out.println("İkizler Burcusunuz");
                } else
                    System.out.println("Yengeç burcusunuz");
                break;
            case 7:
                    if (day <= 22) {
                        System.out.println("Yengeç Burcusunuz");
                    } else
                        System.out.println("Aslan burcusunuz");
                break;
            case 8:
                if (day <= 22) {
                    System.out.println("Aslan Burcusunuz");
                } else
                    System.out.println("Başak burcusunuz");
                break;
            case 9:
                if (day <= 22) {
                    System.out.println("Başak Burcusunuz");
                } else
                    System.out.println("Terazi burcusunuz");
                break;
            case 10:
                if (day <= 22) {
                    System.out.println("Terazi Burcusunuz");
                } else
                    System.out.println("Akrep burcusunuz");
                break;
            case 11:
                if (day <= 21) {
                    System.out.println("Akrep Burcusunuz");
                } else
                    System.out.println("Yay burcusunuz");
                break;
            case 12:
                if (day <= 21) {
                    System.out.println("Yay Burcusunuz");
                } else
                    System.out.println("Oğlak burcusunuz");
                break;
            default:
                System.out.println("yanlış giriş yaptınız");










        }

        /*   2.YOL

        if(month<=12 && month>=1 && day<=31 && day>=1) {

            if (month == 1) {
                if (day <= 21) {
                    System.out.println("Oğlak Burcusunuz");
                } else
                    System.out.println("Kova burcusunuz");
            }

            if (month == 1) {
                if (day <= 21) {
                    System.out.println("Oğlak Burcusunuz");
                } else
                    System.out.println("Kova burcusunuz");
            }
            if (month == 2) {
                if (day <= 19) {
                    System.out.println("Kova Burcusunuz");
                } else
                    System.out.println("Balık burcusunuz");
            }
            if (month == 3) {
                if (day <= 20) {
                    System.out.println("Balık Burcusunuz");
                } else
                    System.out.println("Koç burcusunuz");
            }
            if (month == 4) {
                if (day <= 20) {
                    System.out.println("Koç Burcusunuz");
                } else
                    System.out.println("Boğa burcusunuz");
            }
            if (month == 5) {
                if (day <= 21) {
                    System.out.println("Boğa Burcusunuz");
                } else
                    System.out.println("İkizler burcusunuz");
            }
            if (month == 6) {
                if (day <= 22) {
                    System.out.println("İkizler Burcusunuz");
                } else
                    System.out.println("Yengeç burcusunuz");
            }
            if (month == 7) {
                if (day <= 22) {
                    System.out.println("Yengeç Burcusunuz");
                } else
                    System.out.println("Aslan burcusunuz");
            }
            if (month == 8) {
                if (day <= 22) {
                    System.out.println("Aslan Burcusunuz");
                } else
                    System.out.println("Başak burcusunuz");
            }
            if (month == 9) {
                if (day <= 22) {
                    System.out.println("Başak Burcusunuz");
                } else
                    System.out.println("Terazi burcusunuz");
            }
            if (month == 10) {
                if (day <= 22) {
                    System.out.println("Terazi Burcusunuz");
                } else
                    System.out.println("Akrep burcusunuz");
            }
            if (month == 11) {
                if (day <= 21) {
                    System.out.println("Akrep Burcusunuz");
                } else
                    System.out.println("Yay burcusunuz");
            }
            if (month == 12) {
                if (day <= 21) {
                    System.out.println("Yay Burcusunuz");
                } else
                    System.out.println("Oğlak burcusunuz");
            }

        }else System.out.println("Yanlış girdiniz");


         */









    }
}
