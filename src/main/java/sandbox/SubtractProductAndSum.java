package sandbox;

public class SubtractProductAndSum {
    public static void main(String[] args) {
        int number = 234;
        int sumOfDigits = 0;
        int productOfDigits = 1;

        while (number > 0) {
            sumOfDigits += number % 10;
            productOfDigits *= number % 10;
            number /= 10;
        }
        System.out.println(productOfDigits - sumOfDigits);
    }
}