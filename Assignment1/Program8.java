import java.util.Scanner;

//8.Write a Java Program to find whether given number is Leap year or NOT? 

public class Program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year to check is it leap year or not");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not leap year");
        }

    }
}
