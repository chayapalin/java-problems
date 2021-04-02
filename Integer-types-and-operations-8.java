// Given a three-digit integer (i.e. an integer from 100 to 999). Find the sum of its digits.

// Sample Input 1:
// 476
// Sample Output 1:
// 17

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int digit1 = n / 100;
        int digit2 = n % 100 / 10;
        int digit3 = n % 10;
        System.out.println(digit1 + digit2 + digit3);
    }
}
