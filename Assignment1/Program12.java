import java.util.Scanner;

//12.Write a Java Program to find sum of the digits of a given number. 

public class Program12 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        while (number > 0) {
            int digit = number % 10;

            // System.out.print(" ");
            // System.out.print(digit);
            sum = sum + digit;
            number = number / 10;

        }
        System.out.print("Sum of digits in given no. is " + sum);

    }
}