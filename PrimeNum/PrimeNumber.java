package kodluyoruzilkrepo.PrimeNum;

public class PrimeNumber {
    public static boolean isPrime(int n) {
        if (n == 1 || n == 0)
            return false;

        boolean flag = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 101; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
