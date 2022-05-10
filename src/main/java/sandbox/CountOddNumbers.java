package sandbox;

public class CountOddNumbers {
    public static void main(String[] args) {
        int min = 3;
        int max = 7;

        if (min % 2 == 0) {
            min++;
        }
        if (max % 2 == 0) {
            max--;
        }

        int value = (max - min) / 2 + 1;
        System.out.println(value);
    }
}