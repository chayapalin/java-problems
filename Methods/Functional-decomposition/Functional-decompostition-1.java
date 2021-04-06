// Here is a math function that Kate wants to use in her program:
//
// f(x) =
// x^2+1 if x≤0
// 1/x^2 if 0<x<1
// x^2-1 if x≥1
// ​
// The template for this function is defined below. Let's decompose it!
//
// Your task is to create three additional methods f1, f2, and f3 for each case and complete the method f. Each method should accept x as an argument with double type.
//
// Sample Input 1:
// 0.5
// Sample Output 1:
// 4.0
// Sample Input 2:
// -4
// Sample Output 2:
// 17.0

import java.util.Scanner;

class MultipleFunction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.println(f(x));
    }

    public static double f(double x) {
        //call your implemented methods here.
        double result = 0;
        if (x <= 0) {
            result = f1(x);
        } else if (0 < x && x < 1) {
            result = f2(x);
        } else if (x >= 1) {
            result = f3(x);
        }
        return result;
    }

    //implement your methods here
    public static double f1(double x) {
        return Math.pow(x, 2) + 1; // return x * x + 1;
    }

    public static double f2(double x) {
        return 1 / Math.pow(x, 2); // return 1 / x * x;
    }

    public static double f3(double x) {
        return Math.pow(x, 2) - 1; // return x * x - 1;
    }
}
