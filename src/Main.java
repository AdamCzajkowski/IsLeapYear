import java.util.Scanner;

public class Main {
    public static boolean isLeapYear(int x){
        if ((x%4==0 )&& (0!=x%100)){
            return true;
        } else {
            if (x%400==0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Submit year: ");
        int year = scanner.nextInt();
        if (isLeapYear(year)==true){
            System.out.println(year + " is leap year");
        } else {
            System.out.println(year + " isn't leap year");
        }
    }
}
