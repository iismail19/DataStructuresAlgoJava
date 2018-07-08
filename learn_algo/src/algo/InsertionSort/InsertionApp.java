package algo.InsertionSort;

public class InsertionApp {
    public static void main(String[] args){
        int[] myArray = {9,8,3,13,87,12,99,15};
        System.out.println("The array pre-sorting:");
        for (int i = 0; i < myArray.length; i++){
            System.out.print(" [" + myArray[i] + "] ");
        }
        System.out.println();
        System.out.println("The array after sorting:");
        int[] sortedArray = insertionSort(myArray);
        for (int i = 0; i < sortedArray.length; i++){
            System.out.print(" [" + sortedArray[i] + "] ");
        }
    }

    public static int [] insertionSort(int [] a){
        for (int i =1; i <a.length -1; i++){
            int j = i-1;
            int element = a[i];
            while (j >= 0 && a[j] > element){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = element; // this can be in while loop??
        }
        return a;
    }

}
