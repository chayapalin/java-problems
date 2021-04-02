// N squirrels found K nuts and decided to divide them equally. Determine how many nuts each squirrel will get.

// Input data format

// There are two positive numbers N and K, each of them is not greater than 10000.

// Sample Input 1:
// 3
// 14
// Sample Output 1:
// 4

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int squirrels = scanner.nextInt();
        int nuts = scanner.nextInt();

        System.out.println(nuts / squirrels);
    }
}
