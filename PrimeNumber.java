
class PrimeNumber{

public static boolean isPrime(int number) {
        if (number <= 1) return false;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int a=51,b=100;

        for (int num = 51; num <= 100; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }


    }
}