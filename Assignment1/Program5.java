import java.util.Scanner;

//5.Swap two numbers without using third variable approach 2. 
public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number");
        int A = sc.nextInt();
        System.out.println("Enter 2nd number");
        int B = sc.nextInt();
        System.out.println("Two numbers before swapping are " + A + " and " + B);

        A = A ^ B;
        B = A ^ B;
        A = A ^ B;
        System.out.println("Two numbers After swapping are " + A + " and " + B);

    }
}
