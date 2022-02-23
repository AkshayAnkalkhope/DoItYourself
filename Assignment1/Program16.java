import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

//16.Write a Java Program to find GCD of two given numbers. 

public class Program16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd number");
        int n2 = sc.nextInt();
        while (n1 != n2) {
            if (n1 > n2)
                n1 = n1 - n2;
            else
                n2 = n2 - n1;
        }
        System.out.println("GCD of n1 and n2 is: " + n2);
    }

}
