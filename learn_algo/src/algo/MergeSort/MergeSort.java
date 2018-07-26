package algo.MergeSort;

public class MergeSort {
    public static void sort(int inputArray[]){
        sort(inputArray, 0, inputArray.length-1);
    }

    public static void sort(int inputArray[], int start, int end){
        if(end <= start){
            return; // we're done traversing the array
        }

        int mid = (start + end)/2;
        sort(inputArray, start, mid); // sort the left half
        sort(inputArray, mid+1, end); //sort the right half
        merge(inputArray, start, mid, end); // merge sorted resulting into the inputArray
    }

    public static void merge(int inputArray[], int start, int mid, int end){

        int tempArray[] = new int[(end -start) + 1]; // store the result in this array

        int leftArray[] = new int[(mid-start) +2];
        int rightArray[] = new int[(end - mid) +1];

        int leftStart = start;
        int rightStart = mid+1;

        // adding values to each array
        for(int i = 0; i < leftArray.length-1; i++){
            leftArray[i] = inputArray[leftStart]; leftStart++;

        }
        leftArray[leftArray.length -1] = Integer.MAX_VALUE;
        for (int i = 0; i <rightArray.length; i++){
            rightArray[i] = inputArray[rightStart]; rightStart++;
        }
        rightArray[rightArray.length -1] = Integer.MAX_VALUE;
        int i  =0;
        int j = 0;
        int leftValue;
        int rightValue;
        // Compare the two arrays and store in temp array
        for (int rI = 0; rI < tempArray.length; rI++){
            leftValue = leftArray[i];
            rightValue = rightArray[j];
            if(leftValue < rightValue) {
                tempArray[rI] = leftValue;
                i++;
                continue;
            }
            tempArray[rI] = rightValue;
            j++;
        }

        for(int index =0; index < tempArray.length; index++){
            inputArray[start] = tempArray[index];
            start++;
        }

    }

    // Another solution
    public static void merge2(int inputArray[], int start, int mid, int end){
        int tempArray[] = new int [end - start + 1];

        // index coutner for the left side of the array
        int leftSlot = start;
        // index coutner for the right side of the array
        int rightSlot = mid+1;
        int k = 0;

        while (leftSlot <= mid && rightSlot <= end){
            if(inputArray[leftSlot] < inputArray[rightSlot]){
                tempArray[k] = inputArray[leftSlot];
                leftSlot++;
            }
            else {
                tempArray[k] = inputArray[rightSlot];
                rightSlot++;
            }
            k++;
        }

        /*
         * WHen it gets to here, that neabs tge above loop is completed.
         * So both the right and the left side of the sub-array can be considered sorted
         */

        if(leftSlot <= mid){ // consider the right side done being sorted. Left msut be sorted already
            while (leftSlot <= mid){
                tempArray[k] = inputArray[leftSlot];
                leftSlot++;
                k++;
            }
        }
        else if( rightSlot <= end){
            while (rightSlot <= end){
                tempArray[k] = inputArray[rightSlot];
                rightSlot++;
                k++;
            }
        }

        // copy over the temp array into the appropriate slot of the inputArray
        for(int i = 0; i < tempArray.length; i++){
            inputArray[start+i] = tempArray[i];
        }


    }
}
