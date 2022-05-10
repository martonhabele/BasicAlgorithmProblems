package sandbox;

public class avgExcludingMinAndMax {
    public static void main(String[] args) {
        int total = 0;

        int[] array = {4000, 3000, 1000, 2000};
        int minSalary = array[0];
        int maxSalary = array[0];

        for (int item : array) {
            total += item;
            if (maxSalary < item) {
                maxSalary = item;
            }
            if (minSalary > item) {
                minSalary = item;
            }
        }

        double avgSalary = (double) (total - (minSalary + maxSalary)) / (array.length - 2);

        System.out.println(minSalary);
        System.out.println(maxSalary);
        System.out.println(total);
        System.out.println(avgSalary);
    }
}