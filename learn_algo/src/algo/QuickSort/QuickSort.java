package algo.QuickSort;

public class QuickSort {

    public void quickSort(int[] inputArray, int start, int end){

        if(start < end){
            int part = partition(inputArray, start, end);
            quickSort(inputArray, start, part-1);
            quickSort(inputArray, part+1, end);
        }
    }

    public int partition(int[] inputArray, int start, int end){
        int i = start -1;
        int pivot = inputArray[end];
        for(int j =start; j < end; j++){
            if(inputArray[j] <= pivot){
                i++;
                swap(inputArray, i, j);
            }
        }
        swap(inputArray,i+1, end);
        return i+1;
    }

    public void swap(int[] inputArray, int i, int j){
        int temp = inputArray[i];
        inputArray[i] = inputArray[j];
        inputArray[j] = temp;
    }
}
