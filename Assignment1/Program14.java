import java.util.Scanner;

//14.How to add two numbers without using the arithmetic operators in Java? 

public class Program14 {
    static int Add(int a, int b) {
        for (int i = 1; i <= b; i++) {
            a++;
        }
        return a;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = sc.nextInt();
        System.out.println("Enter 1st number");
        int b = sc.nextInt();

        System.out.println("Addition of two number is " + Add(a, b));

    }
}
