package octalnumbers;

import java.util.Scanner;

public class OctalNumber {
    public static void main(String[] args) {
    int decNum, i=0, k,t;
    int octNum[] = new int[100];

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter decimal number: ");
    decNum = scanner.nextInt();

    t = decNum;

    while(t != 0 ){
        octNum[i++] = t % 8;
        t = t/8;
    }

        System.out.println("Octal number is: ");
        for (k = i-1; k >=0; k--) {
            System.out.print(octNum[k]);
        }
        System.out.println("");
    }
}
