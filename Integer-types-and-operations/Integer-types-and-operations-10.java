// Write a program that will help people who are going on vacation. The program should calculate the total required sum (e.g. $) of money to have a good rest for a given duration.

// There are four parameters which have to be considered:

// duration in days
// total food cost per day
// one-way flight cost
// cost of one night in a hotel (the number of nights equal duration minus one)
// Read values of these parameters from the standard input and then print the result.

// Sample Input 1:
// 7 30 100 40
// Sample Output 1:
// 650

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = scanner.nextInt();
        int foodPerDay = scanner.nextInt();
        int oneWayFlight = scanner.nextInt();
        int hotelPerNight = scanner.nextInt();

        int foodCost = days * foodPerDay;
        int flightCost = 2 * oneWayFlight;
        int hotelCost = (days - 1) * hotelPerNight;

        System.out.println(foodCost + flightCost + hotelCost);
    }
}
