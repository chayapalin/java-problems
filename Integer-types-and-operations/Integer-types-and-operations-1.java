// Given a two-digit number. Print its first digit (i.e. the number of tens).

// Sample Input 1:
// 42

// Sample Output 1:
// 4

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int result = num / 10;

        System.out.println(result);
    }
}
