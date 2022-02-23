import java.util.Scanner;

//4.Swap two numbers without using third variable approach 1. 

public class Program4 {
    static int a;
    static int b;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");

        int a = sc.nextInt();
        int b = sc.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("swaped value of a is " + a);
        System.out.println("swaped value of b is " + b);

    }

}
