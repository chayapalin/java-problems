// Write a program that reads a string, and then outputs the string without its middle character when the length is odd, and without the middle 2 characters when the length is even.
//
// Sample Input 1:
// Hello
// Sample Output 1:
// Helo
// Sample Input 2:
// abcd
// Sample Output 2:
// ad

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] array = input.split("");
        if (input.length() % 2 != 0) { // {"H", "e", "l", "l", "o"}
            int middle = input.length() / 2;
            System.out.print(input.substring(0, middle));
            System.out.print(input.substring(middle + 1));
        } else { // // {"a", "b", "c", "d"}
            int middle = input.length() / 2;
            System.out.print(input.substring(0, middle - 1));
            System.out.print(input.substring(middle + 1));
        }
    }
}
