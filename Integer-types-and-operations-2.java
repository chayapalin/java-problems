// Write a program that reads a three-digit number, calculates the new number by reversing its digits, and outputs a new number.

// Sample Input 1:
// 320
// Sample Output 1:
// 23
// Sample Input 2:
// 976
// Sample Output 2:
// 679

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int digit1 = n / 100;
        int digit2 = n % 100 / 10;
        int digit3 = n % 10;

        int hundred = digit3 * 100;
        int dozen = digit2 * 10;

        int sum = hundred + dozen + digit1;
        System.out.println(sum);
    }
}
