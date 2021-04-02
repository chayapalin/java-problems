// A university has decided to open math courses and equip classrooms for 3 groups with special new desks. The faculty agreed that in the sake of productivity only two students may share one table. The enrollment has ended, and now the task is to count the number of desks to order the correct amount from the shop. Of course, the university is short of money, so you need to calculate the minimum of desks. But don't forget that each group will sit in its own classroom!

// Input data format

// The program receives the input of the three non-negative integers: the number of students in each of the three groups (the numbers is not bigger than 1000).

// Sample Input 1:
// 20
// 21
// 22
// Sample Output 1:
// 32
// Sample Input 2:
// 16
// 18
// 20
// Sample Output 2:
// 27

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int group1 = scanner.nextInt();
        int group2 = scanner.nextInt();
        int group3 = scanner.nextInt();

        int sum = group1 / 2 + group1 % 2 + group2 / 2 + group2 % 2 + group3 / 2 + group3 % 2;
        System.out.println(sum);
    }
}
