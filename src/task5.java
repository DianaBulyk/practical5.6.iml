public class task5 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 2;
        int num3 = 8;

        // Сортування чисел в порядку зростання
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 > num3) {
            int temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.println("Відсортовані числа в порядку зростання: " + num1 + ", " + num2 + ", " + num3);
    }
}