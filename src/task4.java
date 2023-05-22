import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Виберіть опцію: (1) Погодитись, (2) Відмовитись");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Введіть свою відповідь:");
                String response1 = scanner.next();

                switch (response1.toLowerCase()) {
                    case "так":
                    case "ok":
                    case "yes":
                    case "y":
                    case "+":
                        System.out.println("Я погоджуюсь!");
                        break;
                    default:
                        System.out.println("Невідома відповідь");
                        break;
                }
                break;
            case 2:
                System.out.println("Введіть свою відповідь:");
                String response2 = scanner.next();

                switch (response2.toLowerCase()) {
                    case "ні":
                    case "no":
                    case "n":
                    case "-":
                        System.out.println("Я відмовляюсь!");
                        break;
                    default:
                        System.out.println("Невідома відповідь");
                        break;
                }
                break;
            default:
                System.out.println("Невірний вибір опції");
                break;
        }

        scanner.close();
    }
}