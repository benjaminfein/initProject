package learning;

import java.util.Arrays;

public class Main {
    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            // в этой точке мы вышли, так что j так же -1
            // или в первом элементе, где текущий >= a[j]
            array[j+1] = current;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {4, 5, 2, 3, 1};
//        insertionSort(array);
        System.out.println(Arrays.toString(insertionSort(array)));
    }
}
