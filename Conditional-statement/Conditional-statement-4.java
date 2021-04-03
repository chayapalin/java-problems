// Given a four-digit number. Determine whether its decimal notation is symmetric. If the number is symmetric, output 1; otherwise output any other integer.
//
// Sample Input 1:
// 2002
// Sample Output 1:
// 1
// Sample Input 2:
// 2008
// Sample Output 2:
// 37

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int fourDigitNumber = input.nextInt();

        int firstDigit = fourDigitNumber / 1000;
        int secondDigit = fourDigitNumber / 100 % 10;
        int thirdDigit = fourDigitNumber / 10 % 10;
        int fourthDigit = fourDigitNumber % 10;

        if (firstDigit == fourthDigit && secondDigit == thirdDigit) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
