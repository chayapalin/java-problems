// A detector compares the size of parts produced by a machine with the reference standard.
//
// If the size of the part is larger, it can be sent to be fixed, and the detector prints the number 1.
// If the size of the part is smaller, it is removed as a reject, and the detector prints the number -1.
// If the part is perfect, it is sent to the box with products, that are ready to ship, and the detector prints 0.
//
// Write a program, which takes the number of parts n as input, and then the sequence of detector prints. The program should output numbers in a single line containing the number of parts ready to be shipped, the number of parts to be fixed, and the number of rejects.
//
// Sample Input 1:
// 14
// 0
// -1
// -1
// 1
// 0
// 0
// 0
// 0
// 0
// 1
// 0
// -1
// 1
// -1
// Sample Output 1:
// 7 3 4

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfParts = input.nextInt();
        int larger = 0;
        int smaller = 0;
        int perfect = 0;
        for (int i = 0; i < numberOfParts; i++) {
            int size = input.nextInt();
            if (size == 0) {
                perfect++;
            } else if (size == 1) {
                larger++;
            } else if (size == -1) {
                smaller++;
            }
        }
        System.out.println(perfect + " " + larger + " " + smaller);
    }
}
