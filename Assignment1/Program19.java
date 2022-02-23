import java.util.Scanner;

//19.Check whether the Given Number is a Palindrome or NOT. 

public class Program19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        String str = "";
        String num = sc.nextLine();
        int length = num.length();
        for (int i = length - 1; i >= 0; i--)
            str = str + num.charAt(i);
        if (num.equals(str))
            System.out.println("The entered string " + num + " is a palindrome.");
        else
            System.out.println("The entered string " + num + " isn't a palindrome.");

    }
}
