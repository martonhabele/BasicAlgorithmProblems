package sandbox;

public class HammingWeight {
    public static void main(String[] args) {
        int input = 00000000000000000000010000001011;
        int solution = 0;

        //Using Brian Kernighan's algorithm

        while (input != 0) {
            input = input & (input - 1);
            solution++;
        }
        System.out.println(solution);
    }
}