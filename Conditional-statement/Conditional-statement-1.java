// In a computer game, each gamer has an army of units.
// Write a program that will classify the army of your enemies corresponding to the following rules:
// Units: Category
// less than 1: no army
// from 1 to 19: pack
// from 20 to 249: throng
// from 250 to 999: zounds
// 1000 and more: legion
//
// The program should read the number of units and output the corresponding category.
//
// Sample Input 1:
// 5
// Sample Output 1:
// pack
// Sample Input 2:
// 303
// Sample Output 2:
// zounds

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        int units = number.nextInt();

        if (units < 1) {
            System.out.println("no army");
        } else if (units < 20) {
            System.out.println("pack");
        } else if (units < 250) {
            System.out.println("throng");
        } else if (units < 1000) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}
