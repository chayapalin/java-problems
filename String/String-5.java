// Write a program that reads two lines and compares them without whitespaces. The program should print true if both lines are equal, otherwise – false.
//
// Sample Input 1:
//   string
// str ing
// Sample Output 1:
// true
// Sample Input 2:
// string
// my string
// Sample Output 2:
// false

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String line1 = input.nextLine();
        String line2 = input.nextLine();
        String trimmedLine1 = line1.trim().replace(" ", "");
        String trimmedLine2 = line2.trim().replace(" ", "");

        System.out.println(trimmedLine1.equals(trimmedLine2));
    }
}
