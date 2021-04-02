// Find how many seconds passed between the two moments of time on the same day.

// You are given the integer values representing these moments: hours, minutes and seconds for each of them. It is guaranteed that the earlier moment goes first in the input.

// Input data format

// The program gets the input of six integers: three defining the first moment of time in hours, minutes, seconds, and the other three defining the second one.

// For example, six numbers 1, 2, 30, 15, 21, 1 will represent two moments of time: 1:02:30 am and 3:21:01 pm (or just 15:21:01).

// Output data format

// Just one number: seconds between these two moments of time. It's 51511 (14 hours, 18 minutes and 31 seconds) in our example.
  
// Sample Input 1:
// 1
// 1
// 1
// 2
// 2
// 2
// Sample Output 1:
// 3661
// Sample Input 2:
// 1
// 2
// 30
// 1
// 3
// 20
// Sample Output 2:
// 50

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();

        int firstMoment = hours1 * 3600 + minutes1 * 60 + seconds1;
        int secondMoment = hours2 * 3600 + minutes2 * 60 + seconds2;

        int secondsBetween = secondMoment - firstMoment;

        System.out.println(secondsBetween);
    }
}
