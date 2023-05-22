public class task3 {
    public static void main(String[] args) {
        String direction = "До низу";
        int floor = 6;

        if (direction.equals("До гори")) {
            if (floor == 1) {
                System.out.println("Ви піднялись на 1 поверх");
            } else if (floor == 2 || floor == 3) {
                System.out.println("Ви піднялись на 3 поверх");
            } else if (floor == 4) {
                System.out.println("Ви піднялись на 4 поверх");
            } else if (floor == 5) {
                System.out.println("Ви піднялись на 5 поверх");
            } else if (floor == 6) {
                System.out.println("Ви піднялись на 6 поверх");
            } else if (floor == 7) {
                System.out.println("Ви піднялись на 7 поверх");
            } else if (floor == 8) {
                System.out.println("Ви піднялись на 8 поверх");
            } else if (floor == 9) {
                System.out.println("Ви піднялись на 9 поверх");
            } else {
                System.out.println("Ви вказали неіснуючий поверх!");
            }
        } else if (direction.equals("До низу")) {
            if (floor == 9) {
                System.out.println("Ви спустились на 9 поверх");
            } else if (floor == 8) {
                System.out.println("Ви спустились на 8 поверх");
            } else if (floor == 7) {
                System.out.println("Ви спустились на 7 поверх");
            } else if (floor == 6) {
                System.out.println("Ви спустились на 6 поверх");
            } else if (floor == 5) {
                System.out.println("Ви спустились на 5 поверх");
            } else if (floor == 4) {
                System.out.println("Ви спустились на 4 поверх");
            } else if (floor == 3) {
                System.out.println("Ви спустились на 3 поверх");
            } else if (floor == 2 || floor == 1) {
                System.out.println("Ви спустились на 1 поверх");
            } else {
                System.out.println("Ви вказали неіснуючий поверх!");
            }
        }
    }
}