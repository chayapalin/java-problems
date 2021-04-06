// Write a method with the name sign that takes an int number and checks whether the number is negative, positive or zero. The method should return -1, +1 or 0 respectively.
//
// Sample Input 1:
// 11
// Sample Output 1:
// 1
// Sample Input 2:
// 0
// Sample Output 2:
// 0
// Sample Input 3:
// -3
// Sample Output 3:
// -1

import java.util.Scanner;

public class Main {

    public static int sign(int number) {

        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 0;
        } else {
            return +1;
        }
        // or just this statement return number < 0 ? -1 : number == 0 ? 0 : +1;
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        System.out.println(sign(n));
    }
}
