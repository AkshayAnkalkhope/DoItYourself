import java.util.Scanner;

//3.Find the Factorial of a number using Recursion. 
class Program3 {
    static int factorial(int num) {
        if (num == 1) {
            return 1;
        } else {
            return (num * factorial(num - 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num;
        num = sc.nextInt();
        factorial(num);
        System.out.println("Factorial of " + num + " is " + factorial(num));

    }
}