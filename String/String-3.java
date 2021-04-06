// Write a program that checks if a given string starts with the prefix "J" ignoring the case.
//
// The program should output true or false.
//
// Sample Input 1:
// Java
// Sample Output 1:
// true
// Sample Input 2:
// Kotlin
// Sample Output 2:
// false

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        String wordUpper = word.toUpperCase();
        boolean checkJ = wordUpper.startsWith("J");
        System.out.println(checkJ);
    }
}
