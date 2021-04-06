// Write a program that reads a string and two integer numbers. These two numbers are representing a range that includes them both. Print the substring enclosed in this range. Both numbers are always greater than or equal to 0 and less than the string length.
//
// Sample Input 1:
// Java
// 0 2
// Sample Output 1:
// Jav

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String string = input.nextLine();
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.println(string.substring(num1, num2 + 1));
    }
}
