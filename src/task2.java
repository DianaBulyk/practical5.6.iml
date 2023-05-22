public class task2 {
    public static void main(String[] args) {
        int n = 547;

        int maxDigit = getMaxDigit(n);

        System.out.println("Найбільша цифра числа " + n + ": " + maxDigit);
    }

    public static int getMaxDigit(int number) {
        int maxDigit = 0;

        while (number > 0) {
            int digit = number % 10;
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            number /= 10;
        }

        return maxDigit;
    }
}