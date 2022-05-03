package binarynumber;

import java.util.Scanner;

public class BinaryNumber {
    public static void main(String[] args) {

    int i=0, j, d, t ;
    int[] b = new int[100];

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter decimal number: ");
    d = scanner.nextInt();

    t = d ;

    while (t != 0){
        b[i++] = t % 2;
        t = t/2;
    }
    System.out.print("Binary Value is: ");

        for ( j = i-1; j >= 0 ; j--) {
            System.out.print(b[j]);
        }
        System.out.print("\n");
    }
}
