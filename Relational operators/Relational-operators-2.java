// Write a program that reads three numbers and checks that they all are different, i.e. not equal to one another.
//
// The output should be true or false.
//
// Sample Input 1:
// 5 5 9
// Sample Output 1:
// false

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        boolean checkDifference = num1 != num2 && num2 != num3 && num1 != num3;
        System.out.println(checkDifference);
    }
}
