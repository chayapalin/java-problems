/*
Take a look at the method that takes a string, converts all characters of the string to the upper case and then returns the resulting string.

But there is a problem. Sometimes an input string is null. As you already know, in this case, the method throws NullPointerException.

Your task is to fix the method in order to avoid NPE.

If the input string is null, the method should return the empty string "".

Sample Input 1:

a string
Sample Output 1:

A STRING
*/
import java.util.Scanner;
import java.util.Locale;
import java.util.Objects;

public class NPE1 {

    /* Fix this method */
    public static String toUpperCase(String str) {
        String str2 = null;
        String result = null;
        if (Objects.equals(str2, str)) {
            result = "empty";
        } else {
            result = str.toUpperCase(Locale.ENGLISH);
        }
        return result;

        // or just this line return str == null ? "" : str.toUpperCase(Locale.ENGLISH);
        /* OR
        if (str != null) {
            return str.toUpperCase(Locale.ENGLISH);   
        } else {
            return "";
        }
        */
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        line = "none".equalsIgnoreCase(line) ? null : line;
        System.out.println(toUpperCase(line));
    }
}
