package kodluyoruzilkrepo.Palindrom;

public class Palindrom {
    public static boolean isPalindrome(int n) {

        int mod, reverseNumber = 0, temp = n;
        while (temp > 0) {
            mod = temp % 10;
            reverseNumber = (reverseNumber * 10) + mod;
            temp /= 10;
        }
        return reverseNumber == n;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 102; i++) {
            if (isPalindrome(i)) {
                System.out.printf("%d is palindrome\n", i);
            } else {
                System.out.printf("%d is not palindrome\n", i);
            }
        }
    }
}
