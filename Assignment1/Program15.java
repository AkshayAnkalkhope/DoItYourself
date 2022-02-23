import java.util.Scanner;

//15.Write a java program to Reverse a given number. 

public class Program15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        while (number > 0) {
            int digit = number % 10;
            System.out.print(digit);

            number = number / 10;
        }
    }

}
