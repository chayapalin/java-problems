// Residents of the country of Malevia often experiment with the plan of their rooms. Rooms can be triangular, rectangular, and round.
//
// Write a program that calculates the floorage of the rooms.
//
// Input data format
// The type of the room shape and the relevant parameters.
//
// Output data format
// The area of the resulting room.
//
// Note that the value of 3.14 is used instead of the number π in Malevia.
//
// Input format used by the Malevians:
// triangle
// a
// b
// c
// where a, b and c — lengths of the triangle sides.
//
// rectangle
// a
// b
// where a and b — lengths of the rectangle sides.
//
// circle
// r
// where r — circle radius.
//
// Note, the input values (a, b, c, r) are doubles and your answer should be, too.
//
// Sample Input 1:
// rectangle
// 4
// 10
// Sample Output 1:
// 40.0
// Sample Input 2:
// circle
// 5
// Sample Output 2:
// 78.5
// Sample Input 3:
// triangle
// 3
// 4
// 5
// Sample Output 3:
// 6.0

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String shape = input.nextLine();
        //double a, b, c, r, s, area; OK but not good quality
        double a;
        double b;
        double c;
        double r;
        double s;
        double area;
        switch (shape) {
            case "triangle":
                a = input.nextDouble();
                b = input.nextDouble();
                c = input.nextDouble();
                s = (a + b + c) / 2;
                area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                System.out.println(area);
                break;
            case "rectangle":
                a = input.nextDouble();
                b = input.nextDouble();
                area = a * b;
                System.out.println(area);
                break;
            case "circle":
                r = input.nextDouble();
                area = 3.14 * r * r;
                System.out.println(area);
                break;
            default:
                break;
        }
    }
}
