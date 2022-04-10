package syracuse;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Basic & inefficient algorithm for generating numbers for the Collatz conjecture
// Every number you give generates a list ending with the recursive numbers of [4, 2, 1]

public class SyracuseList {
    public static void main(String[] args) {
        List<Long> result = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean isLoop = false;

        System.out.print("Give me a number: ");
        long inputNumber = sc.nextLong();             // No exception handling; reused variable
        result.add(inputNumber);

        while (!isLoop) {
            if (inputNumber == 1) {                   // Separate if-clause for searching the value 1
                isLoop = true;
                System.out.println(result);
            }

            if (inputNumber % 2 == 0) {               // If even, then divide by 2
                inputNumber /= 2;
                result.add(inputNumber);
            } else {
                inputNumber = 3 * inputNumber + 1;    // If odd, multiply by 3 and add 1
                result.add(inputNumber);
            }
        }
    }
}