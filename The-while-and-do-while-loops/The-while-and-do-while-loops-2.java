// A user inputs a long positive number m. You need to find out what is the smallest int number n such that n! > m.
//
// Just in case: wiki on factorials.
//
// Sample Input 1:
// 6188989133
// Sample Output 1:
// 13
// Sample Input 2:
// 6
// Sample Output 2:
// 4

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        long counter = 0; //It is the starting number to calculate factorial.
        long fact = 1;
        while (fact <= m) {
            counter++;
            fact = fact * counter;
        }
        System.out.println(counter);
    }
}
