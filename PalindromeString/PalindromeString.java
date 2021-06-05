package kodluyoruzilkrepo.PalindromeString;

import java.util.Scanner;

public class PalindromeString {

    static boolean isPalindrome(String s1) {
        for (int i = 0, j = s1.length() - 1; i < j; i++, j--) {
            if (s1.charAt(i) != s1.charAt(j))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String s1;
        System.out.print("Kelimeyi giriniz: ");
        s1 = scn.next();

        boolean answer = isPalindrome(s1);
        if (answer) {
            System.out.println("Kelime palindrom");
        } else {
            System.out.println("Kelime palindrom değil");
        }
        scn.close();
    }
}
