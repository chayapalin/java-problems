// Given the sequence of positive integer numbers (which ends with the number 0). Find the largest element of the sequence.
//
// The number 0 itself is not included in the sequence but serves only as a sign of the sequence’s end.
//
// Sample Input 1:
// 1
// 7
// 9
// 0
// Sample Output 1:
// 9

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int largestElement = 0;
        while (input.hasNext() != 0) {
            int element = input.nextInt();
            if (element >= largestElement) {
                largestElement = element;
            }
        }
        System.out.println(largestElement);
    }
}
