import java.util.Scanner;

//13.Write a Java Program to find the smallest of 3 numbers (a,b,c) without using < or > symbol? 

public class Program13 {

    static int SmallestNum(int num1, int num2, int num3) {
        int number = 0;
        while (num1 != 0 && num2 != 0 && num3 != 0) {
            num1--;
            num2--;
            num3--;
            number++;
        }
        return number;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number");
        int num2 = sc.nextInt();
        System.out.println("Enter 3rd number");
        int num3 = sc.nextInt();

        System.out.println("Smallest number is " + SmallestNum(num1, num2, num3));

    }
}
