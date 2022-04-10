package syracuse;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SyracuseList {
    public static void main(String[] args) {
        List<Long> result = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean isLoop = false;

        System.out.print("Give me a number: ");
        long inputNumber = sc.nextLong();             //No exception handling; reused variable
        result.add(inputNumber);

        while (isLoop == false) {
            if (inputNumber == 1) {
                isLoop = true;
                result.add(inputNumber);
                System.out.println(result);
            }

            if (inputNumber % 2 == 0) {
                inputNumber /= 2;
                result.add(inputNumber);
            } else {
                inputNumber = 3 * inputNumber + 1;
                result.add(inputNumber);
            }
        }
    }
}