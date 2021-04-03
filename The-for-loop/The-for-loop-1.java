// Print the sum of all integers from a to b including both.
//
// It is guaranteed that a < b in all test cases.
//
// Sample Input 1:
// 3
// 22
// Sample Output 1:
// 250

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    int b = input.nextInt();
    int sum = 0;
    for (int i = a; i <= b; i++) {
        sum += i;
    }
    System.out.println(sum);
  }
}
