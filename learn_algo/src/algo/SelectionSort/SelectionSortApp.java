package algo.SelectionSort;

public class SelectionSortApp {
    public static void main(String[] args){
        int[] myArray = {9,8,3,13,87,12,99,15};
        System.out.println("The array pre-sorting:");
        for (int i = 0; i < myArray.length; i++){
            System.out.print(" [" + myArray[i] + "] ");
        }
        System.out.println();
        System.out.println("The array after sorting:");
        int[] sortedArray = selectionSort(myArray);
        for (int i = 0; i < sortedArray.length; i++){
            System.out.print(" [" + sortedArray[i] + "] ");
        }

    }

    public static int [] selectionSort(int a[]){
        for(int i =0; i < a.length -1; i++){
            int min = i;
            for(int j = i+1; j < a.length; j++){
                if(a[j] < a[min]){
                    min = j;
                }
            }
            if(a[i] != a[min]) {
                int temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }
        }
        return a;
    }

}
