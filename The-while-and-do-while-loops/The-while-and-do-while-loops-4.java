// Find the sum of all elements of a sequence, ending with the number 0.
//
// The number 0 itself is not included into the sequence and serves as a sign of cessation.
//
// Sample Input 1:
// 3
// 6
// 8
// 0
// Sample Output 1:
// 17

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int element;
        int sum = 0;
        do {
            element = input.nextInt();
            sum += element;
        } while (element != 0);
        System.out.println(sum);

    }
}
