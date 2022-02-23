import java.util.Scanner;

//9.Write a Java Program to Print 1 To 10 Without Using Loop. 

public class Program9 {

    static void printNo(int n) {
        if (n > 0) {
            printNo(n - 1);
            System.out.print(n + " ");
        }
        return;
    }

    public static void main(String[] args) {
        printNo(10);

    }
}
