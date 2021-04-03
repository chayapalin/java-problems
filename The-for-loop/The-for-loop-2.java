// Find the sum of numbers divisible by 6 in the given sequence of natural numbers.
// The first line of the input is the number of elements in the sequence; the next lines are the elements themselves.
// It is guaranteed, that there is always a number divisible by 6 in the sequence.
//
// Sample Input 1:
// 8
// 11
// 12
// 68
// 6
// 98
// 81
// 36
// 86
// Sample Output 1:
// 54

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberOfElements = input.nextInt();
        int sum = 0;
        for (int i = 0; i < numberOfElements; i++) {
            int elements = input.nextInt();
            if (elements % 6 == 0) {
                sum += elements;
            }
        }
        System.out.println(sum);
    }
}
