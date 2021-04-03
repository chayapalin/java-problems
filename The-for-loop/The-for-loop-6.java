// Your task is to find the roots of a cubic equation.
// The input contains four numbers: a, b, c, da,b,c,d.
// Output all the integer roots between 0 and 1000 (inclusive) for the equation ax^3+bx^2+cx+d=0 in ascending order.
// If the specified interval does not contain the roots of the equation, do not output anything.
// Remember, that cubic equation always has 3 roots, meaning it can't have more than 3 integer roots. Keep this in mind in order to optimize the code.

// Sample Input 1:
// -1
// 1
// -1
// 1
// Sample Output 1:
// 1
// Sample Input 2:
// 0
// 1
// -6
// 5
// Sample Output 2:
// 1
// 5
// Sample Input 3:
// 1
// 1
// 1
// 1
// Sample Output 3:

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        for (int x = 0; x <= 1000; x++) {
            boolean equation = (a * x * x * x) + (b * x * x) + (c * x) + d == 0;
            if (equation) {
                System.out.println(x);
            }
        }
    }
}
