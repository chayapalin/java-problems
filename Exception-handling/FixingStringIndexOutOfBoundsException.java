/*
Take a look at the program that reads a string and a number N and outputs the Nth element of a string (starting from 0).

This program may throw StringIndexOutOfBoundsException. Fix it to avoid the exception.

Hint

Do not forget about negative numbers!

In the case when the exception might happen, your updated program should output: "Out of bounds!".
*/

import java.util.*;

public class FixingStringIndexOutOfBoundsException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        int index = scanner.nextInt();

        if (index < 0 || index > string.length() - 1) {
            System.out.println("Out of bounds!");
        } else {
            System.out.println(string.charAt(index));
        }
    }
}