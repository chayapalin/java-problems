// Write a program that reads two numbers aa and bb from the keyboard and calculates and outputs to the console the arithmetic average of all numbers from the interval [a; b][a;b], which are divisible by 33.
// In the example below, the arithmetic average is calculated for the numbers on the interval [-5; 12][−5;12]. Total numbers divisible by 33 on this interval 66: -3, 0, 3, 6, 9, 12−3,0,3,6,9,12. Their arithmetic average equals to 4.54.5
// The program input contains intervals, which always contain at least one number, which is divisible by 33.
// Remember that int type cannot contain fractions. Use double variable to store the precise result of the division.

// Sample Input 1:
// -5
// 12
// Sample Output 1:
// 4.5

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double totalNumbersDivisibleBy3 = 0;
        double countIntervalDivisibleBy3 = 0;
        for (double i = a; i <= b; i++) {
            if (i % 3 == 0) {
                totalNumbersDivisibleBy3 += i;
                countIntervalDivisibleBy3++;
            }
        }
        double average = totalNumbersDivisibleBy3 / countIntervalDivisibleBy3;
        System.out.println(average);
    }
}
