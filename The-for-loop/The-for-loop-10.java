// Write a program that prints the product of all integer numbers from a to b (a < b).
// Include a and exclude b from the product.

// Sample Input 1:
// 1 2
// Sample Output 1:
// 1
// Sample Input 2:
// 100 105
// Sample Output 2:
// 11035502400

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        long productOfAllNumbers = 1; // = a
        for (int i = a; i < b; i++) { // int i = a + 1
            productOfAllNumbers *= i;
        }
        System.out.println(productOfAllNumbers);
    }
}
