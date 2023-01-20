import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        int select;
        String userName,password,password2;
        Scanner inp=new Scanner(System.in);

        System.out.print("Kullanıcı Adı  :");
        userName=inp.nextLine();

        System.out.print("Şifreniz  :");
        password=inp.nextLine();

        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş Yaptınız.");
        }
         if(!userName.equals("patika") || !password.equals("java123")){
            System.out.println("Bilgileriniz Yanlış.");
            System.out.println("Şifrenizi Sıfırlamak İstermisiniz? ");
            System.out.println("1-Sıfırla\n2-Sıfırlama");
            select=inp.nextInt();
            if(select==1){
                Scanner inp2=new Scanner(System.in);
                System.out.print("Yeni Şifreniz  :");
                password2=inp2.nextLine();
                if(!password.equals(password2)){
                    password=password2;
                    System.out.println("Şifre Oluşturulamadı.Lütfen Başka şifre girin.");

                }
                else{
                    System.out.println("Şifre oluşturuldu.");
                }


            }
            else{
                System.out.println("Çıkış Yapılıyor.");
            }


        }



    }

}

