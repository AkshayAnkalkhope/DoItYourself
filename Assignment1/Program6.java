//6.Swap two numbers without using third variable approach 3. 

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = sc.nextInt();// 9
        System.out.println("Enter 2nd number");
        int b = sc.nextInt();// 7
        System.out.println("Two numbers before Swapping are " + a + " and " + b);
        a = a * b;// 63
        b = a / b;// 63/7=9
        a = a / b;// 63/9=7
        System.out.println("Two numbers After Swapping are " + a + " and " + b);
    }
}
