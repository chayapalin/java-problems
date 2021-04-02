// Write a program that reads three integer numbers and prints true if exactly ONE number is positive (i.e. > 0).
//
// Otherwise, it should print false.
//
// Sample Input 1:
// 1 1 1
// Sample Output 1:
// false
// Sample Input 2:
// 1 0 -1
// Sample Output 2:
// true

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        boolean check1 = num1 > 0 && num2 <= 0 && num3 <= 0;
        boolean check2 = num1 <= 0 && num2 > 0 && num3 <= 0;
        boolean check3 = num1 <= 0 && num2 <= 0 && num3 > 0;
        
        System.out.println(check1 || check2 || check3);
    }
}
