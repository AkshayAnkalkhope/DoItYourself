import java.util.Scanner;

//17.Write a java program to LCM of TWO given number. 

public class Program17 {
    static int gcd(int a, int b) {
        if (a == 0)
            return b;
        else
            return gcd(b % a, a);
    }

    static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number");
        int b = sc.nextInt();

        System.out.println("LCM of " + a + " and " + b + " is: " + lcm(a, b));

    }
}
