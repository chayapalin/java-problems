Write a program, which reads the number of the shape (1 – square, 2 – circle, 3 – triangle, 4 – rhombus) and prints the text "You have chosen a square" (or circle, or triangle, or rhombus, depending on the number). If it is a number that doesn't correspond to any of the listed shapes, the program should output: "There is no such shape!".

Note: output text should exactly match the sample, including letters' case and location of spaces.

Sample Input 1:
1
Sample Output 1:
You have chosen a square

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        switch (number) {
            case 1:
                System.out.println("You have chosen a square");
                break;
            case 2:
                System.out.println("You have chosen a circle");
                break;
            case 3:
                System.out.println("You have chosen a triangle");
                break;
            case 4:
                System.out.println("You have chosen a rhombus");
                break;
            default:
                System.out.println("There is no such shape!");
                break;
        }
    }
}
