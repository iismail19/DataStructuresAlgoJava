package algo.QuickSort;


import java.util.Arrays;

public class QuickSortApp {
    public static void main(String[] args){

        int[] myArray = {12, 18, 3, 4, 6, 10, 15, 90, 7, 27, 25};
        QuickSort q = new QuickSort();
        q.quickSort(myArray, 0, myArray.length-1);
        System.out.println(Arrays.toString(myArray));
    }
}
