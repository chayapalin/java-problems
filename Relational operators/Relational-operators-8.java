// Groundhogs like to throw fun parties, and at their parties, they like to eat Reese's peanut butter cups. But not too many of them, or they feel sick! A successful groundhog party will have between 10 and 20 Reese's peanut butter cups, inclusive unless it is the weekend, in which case they will need 15 to 25 Reese's peanut butter cups, inclusive.
//
// Write a Java program that reads two values:
//
// the first is the number of Reese's peanut butter cups;
// the second is a boolean representing whether it is the weekend.
// The program must print the boolean value that indicates the party is successful or not.
//
// Sample Input 1:
// 5 true
// Sample Output 1:
// false
// Sample Input 2:
// 16 false
// Sample Output 2:
// true

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cups = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();

        boolean successWeekday = 10 <= cups && cups <= 20 && !weekend;
        boolean successWeekend = 15 <= cups && cups <= 25 && weekend;
        boolean successParty = successWeekday || successWeekend;
        System.out.println(successParty);

    }
}
