import java.util.*;

//10.Write a Java Program to print the digits of a Given Number. 

public class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        String number = sc.next();
        for (int i = 0; i < number.length(); i++) {
            char ch = number.charAt(i);

            System.out.print(ch + " ");
        }

    }
}
