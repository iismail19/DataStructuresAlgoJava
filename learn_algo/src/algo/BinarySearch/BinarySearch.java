package algo.BinarySearch;

public class BinarySearch {
    public static void main(String[] args){
        System.out.println("Binary Search...");
        int [] sortedArray = new int[10];
        for(int i = 0; i < sortedArray.length; i++){
            sortedArray[i] = (3 + i) * 2;
        }
        System.out.println("Looking for Key 14 \n" +
                "If not found will return neg 1 else return the key:");
        System.out.println(binarySearch(69, sortedArray));
    }

    public static int binarySearch(int searchKey, int[] array){ // return the position of the found element
        int lowerBound = 0;
        int upperBound = array.length -1;
        while (lowerBound <= upperBound){
            int midPoint = (lowerBound + upperBound) / 2;
            if(array[midPoint] == searchKey)
                return midPoint;
            else if(array[midPoint] > searchKey) // if my index position is greater than the searchKey than change my upperBound
                upperBound = midPoint - 1;
            else
                lowerBound = midPoint + 1;
        }
        return -1; // if nothing is found
    }
}
