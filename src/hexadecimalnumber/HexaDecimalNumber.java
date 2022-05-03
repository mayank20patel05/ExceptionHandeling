package hexadecimalnumber;

import java.util.Scanner;

public class HexaDecimalNumber {
    public static void main(String[] args) {
        int decNum, rem;
        String hexaNum = "";

        char[] hex = {'0','1', '2', '3', '4','5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter decimal number: ");
        decNum = scanner.nextInt();

        while (decNum > 0 ){
            rem = decNum % 16;
            hexaNum = hex[rem] + hexaNum;
            decNum = decNum/16;
        }

        System.out.print("Hexa-decimal number is: " + hexaNum + "\n");

    }
}