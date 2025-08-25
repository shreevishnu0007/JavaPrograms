
//Odd series with same length for even input

package Programs;

import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        int limit = (a % 2 == 0) ? a - 1 : a; // If even, subtract 1
        for (int i = 1; i <= limit; i++) {
            System.out.print((2 * i - 1));
            if (i < limit) System.out.print(", ");
        }

        sc.close();
    }
}
