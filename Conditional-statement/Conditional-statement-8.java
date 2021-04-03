// You are given coordinates of two queens on a chess board. Find out whether or not they hit each other.
//
// Input data format
// Four integer numbers x1, y1, x2, y2.
//
// Output data format
// Type "YES" (uppercase) if they hit each other or "NO" if they don't.
//
// You may need a method that calculates the absolute value of the number, so here it is:
//
// Math.abs(n)
//
// Hint
// Queen is the most powerful and valuable attacking piece in the game of chess. It combines the powers of the bishop and the rook. It is able to move any number of unoccupied squares in a straight line: vertically, horizontally or diagonally.
// These are all legal moves of the queen 1. Its coordinates are x1 = 4, y1 = 4x. The coordinates of the queen 2 are x2 = 7, y2 = 5. In this case, queen 1 can't hit queen 2.
//
// Sample Input 1:
// 1 1 3 3
// Sample Output 1:
// YES
// Sample Input 2:
// 1 1 4 3
// Sample Output 2:
// NO
// Sample Input 3:
// 2 2 5 2
// Sample Output 3:
// YES

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();

        if (x1 == x2) { // vertically
            System.out.println("YES");
        } else if (y1 == y2) { // horizontally
            System.out.println("YES");
        } else if (Math.abs(x1 - x2) == Math.abs(y1 - y2)) { // diagonally
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
