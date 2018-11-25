import java.util.Scanner;

public class Main {
    ////// exercise 1 - isLeapYear ///////////
    public static boolean isLeapYear(int x) {
        if ((x % 4 == 0) && (0 != x % 100)) {
            return true;
        } else {
            if (x % 400 == 0) {
                return true;
            }
        }
        return false;
    }

    public static void isLeapYearMain() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Submit year: ");
        int year = scanner.nextInt();
        if (isLeapYear(year) == true) {
            System.out.println(year + " is leap year");
        } else {
            System.out.println(year + " isn't leap year");
        }
    }

    /////////////////////////////////////////
    //////// exercise 2 - signum ////////////
    public static int signum(int x) {
        if (x < 0) {
            return -1;
        } else if (x > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void signumMain() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("Signum number " + x + " is " + signum(x));
    }

    ///////////////////////////////////////////
    ///////// exercise 3 - quadratic equation /
    public static void quadraticEquation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ax^2 + bx + c = 0");
        System.out.println("Submit a, b and c: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(a + "x^2 + " + b + "x +" + c + "= 0");

        double delta = b ^ 2 - 4 * a * c;
        if (signum((int) delta) > 0) {
            double x1 = (-b - Math.sqrt(delta)) / (2 * a);
            double x2 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("x1 = " + String.format("%.2f", x1) + ", x2 = " + String.format("%.2f", x2));
        } else if (signum((int) delta) == 0) {
            double x1 = (-b) / (2 * a);
            System.out.println("x1 = " + String.format("%.2f", x1));
        } else {
            System.out.println("error delta < 0");
        }
    }
    ////////////////////////////////////////////////////////////
    ////////// exercise 4 - Chinese's year//////////////////////

    public static void chinesesYear(){
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int rest = year%12;
        switch(rest){
             case(4):
                System.out.println("Rat's year");
                break;
            case(5):
                System.out.println("Ox's year");
                break;
            case(6):
                System.out.println("Tiger's year");
                break;
            case(7):
                System.out.println("Rabbit's year");
                break;
            case(8):
                System.out.println("Dragon's year");
                break;
            case(9):
                System.out.println("Snake's year");
                break;
            case(10):
                System.out.println("Horse's year");
                break;
            case(11):
                System.out.println("Goat's year");
                break;
            case(0):
                System.out.println("Monkey's year");
                break;
            case(1):
                System.out.println("Rooster's year");
                break;
            case(2):
                System.out.println("Dog's year");
                break;
            case(3):
                System.out.println("Pig's year");
                break;
            default:
                System.out.println("Error value, one more try ");
                chinesesYear();
                break;
        }

    }


    public static void main(String[] args) {
      chinesesYear();
    }

}
