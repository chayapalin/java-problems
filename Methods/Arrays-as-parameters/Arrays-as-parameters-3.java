// Write a method named getFirstAndLast. The method should take an array of ints and return a new array of ints. The returned array must contain two elements: the first and the last elements of the input array.
//
// It's guaranteed, the input array always has at least one element.
//
// Sample Input 1:
// 1 2 3 4
// Sample Output 1:
// 1 4

import java.util.*;

public class Main {

    public static int[] getFirstAndLast(int[] array) {
        return new int[] {array[0], array[array.length - 1]};
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] result = getFirstAndLast(array);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }
}
