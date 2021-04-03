// Given a sequence of natural numbers, not exceeding 30000. Find the maximum element divisible by 4. There is always an element divisible by 4 in the sequence and the number of elements does not exceed 1000.
// As input, the program receives the number of elements in the sequence n (first line) and then the elements themselves (next n lines). The program should print a single number: the maximum element of the sequence divisible by 4.
// Try to solve this problem by using a for-loop.

// Sample Input 1:
// 12
// 16
// 87
// 58
// 25
// 73
// 86
// 36
// 79
// 40
// 12
// 89
// 32
// Sample Output 1:
// 40

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberOfElements = input.nextInt();
        int maxElement = 0;
        for (int i = 0; i < numberOfElements && numberOfElements <= 1000; i++) {
            int eachElement = input.nextInt();
            if (eachElement % 4 == 0 && eachElement > maxElement) {
                maxElement = eachElement;
            }
        }
        System.out.println(maxElement);
    }
}
