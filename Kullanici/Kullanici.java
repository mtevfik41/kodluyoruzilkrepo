package kodluyoruzilkrepo.Kullanici;

import java.util.Scanner;

public class Kullanici {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String user_id = "patika";
        String user_pw = "kodluyoruz";

        String user_id_input,user_pw_input;

        System.out.print("Kullanıcı adınızı giriniz: ");
        user_id_input = scn.next();
        System.out.print("Şifrenizi giriniz: ");
        user_pw_input = scn.next();

        if(user_id.equals(user_id_input) && user_pw.equals(user_pw_input)) {
            System.out.println("Başarıyla giriş yaptınız.");
        }
        else {
            System.out.println("Bilgileriniz yanlış");
        }
        scn.close();
    }
}
