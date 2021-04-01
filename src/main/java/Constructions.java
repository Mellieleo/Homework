public class Constructions {
    static boolean checkIfSumWithinLimits(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    static void checkIfPositive(int number) {
        if (number >= 0) {
            System.out.println(number + " is positive");
        } else {
            System.out.println(number + " is negative");
        }
    }

    static boolean checkIfNegative(int number) {
        return number < 0;
    }

    static void printString(int print) {
        for (int i = 0; i < print; i++) {
            if (i > 0) {
                System.out.println("This line has been printed " + (i + 1) + " times.");
            } else {
                System.out.println("This line has been printed " + (i + 1) + " time.");
            }
        }
    }

    static boolean ifLeapYear (int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
        //делится на 4 И (не делится на 100 ИЛИ делится на 400)
    }

    public static void main(String[] args) {
        System.out.println(checkIfSumWithinLimits(3, 5));
        checkIfPositive(-6);
        System.out.println(checkIfNegative(-9));
        printString(7);
        System.out.println(ifLeapYear(838));
    }
}
