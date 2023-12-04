package lap_01;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] array = new int[]{105, 56, 54, 72, 40, 13, 12, 26};
        long sum = 0;
        double average;

        Arrays.sort(array);
        System.out.print("Elements of array sorted in ascending order: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
            sum += array[i];
        }

        average = (double) sum / array.length;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}

