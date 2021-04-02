// Given a natural number, not greater than 10000. Output the even number following this number.
  
// Sample Input 1:
// 7
// Sample Output 1:
// 8
// Sample Input 2:
// 8
// Sample Output 2:
// 10

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int natural = scanner.nextInt();
        if (natural % 2 == 0) {
            System.out.println(natural + 2);
        } else if (natural % 2 != 0) {
            System.out.println(natural + 1);
        }
    }
}
