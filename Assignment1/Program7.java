import java.util.Scanner;

//7.How to check the given number is Positive or Negative in Java? 

public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("number is positive");
        } else if (num < 0) {
            System.out.println("number is negative");

        } else {
            System.out.println("number is neither positive nor negative");
        }
    }
}
