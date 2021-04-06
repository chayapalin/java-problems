// According to the formula, the area of a parallelogram is a result of the multiplication of the base and the height of the figure. Call the method countAreaOfParallelogram that calculates the area of the parallelogram with the following parameters bb and hh.
//
// Sample Input 1:
// 8 10
// Sample Output 1:
// 80

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base = input.nextInt(); //var base = scanner.nextInt();
        int height = input.nextInt(); //var height = scanner.nextInt();
        countAreaOfParallelogram(base, height);
    }

    public static void countAreaOfParallelogram(int b, int h) {
        System.out.println(b * h);
    }
}
