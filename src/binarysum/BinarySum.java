package binarysum;

import java.util.Scanner;

public class BinarySum {
    public static void main(String[] args) {
        long binary1, binary2;
        int i = 0, remainder =0;
        int sum [] = new int[50];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first binary number: ");
        binary1 = scanner.nextInt();
        System.out.println("Enter second binary number: ");
        binary2 = scanner.nextInt();

        while(binary1 != 0 || binary2 != 0){
            sum[i++] = (int) ((binary1 % 10 + binary2 % 10 + remainder) % 2);
            remainder = (int) ((binary1 % 10 + binary2 % 10 + remainder) / 2);
            binary1 /=10;
            binary2 /=10;
        }
        if(remainder != 0){
            sum[i++] = remainder;
        }

        System.out.println("Sum of binary number is: ");

        for ( int j = i-1; j >= 0 ; j--) { //instead of writing i-1, we can reduce the value of i before for loop by writing i--
            System.out.print(sum[j]);
        }
    }
}
