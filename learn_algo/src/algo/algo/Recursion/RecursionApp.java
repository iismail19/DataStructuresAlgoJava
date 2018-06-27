package algo.algo.Recursion;

import javax.annotation.processing.SupportedSourceVersion;

public class RecursionApp {
    public static void main(String[] args){
        System.out.println(facotrial(5));
        reduceByOne(3);

        System.out.println("Linear Search...");
        int [] a = new int[11]; // does not matter if it is sorted
        for(int i = 0; i < a.length; i++){
            a[i] = (3 + i) * 2;
        }
        int key = 26;
        System.out.println("Looking for Key:" + key + "\n" +
                "If not found will return neg 1 else return the key:");
       System.out.println("Index: " + recursionLinearSearch(a, 0, key));
        System.out.println();

        System.out.println("Fibonacci Sequence...");
        int nthElement = 8;
        System.out.println("Looking for n: " + nthElement +" = " + fibonacciSequence(nthElement));

    }
    public static int facotrial(int n){
        if(n <= 1)
            return 1;
        else
            return facotrial(n -1) * n;
    }

    public static void reduceByOne(int n){
        if(n >= 0){
            System.out.println("Current n: " + n);
            reduceByOne(n -1);
        }
        System.out.println("Completed Call: " + n);
    }

    // challenge prob
    public static int recursionLinearSearch(int[] a, int index, int searchKey){
        int size = a.length - 1;
        if(index > size) // not found, went through all the array
            return -1;
        else if(a[index] == searchKey) // return the index of found element
            return index;
        else
            return recursionLinearSearch(a, index+1, searchKey); // search next index
    }

    // return the nth element in the sequence
    // ex: 0, 1, 1, 2, 3, 5, 8, 13, 21
    public static int fibonacciSequence(int n){
        if (n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return (fibonacciSequence((n-1)) + fibonacciSequence(n-2));
    }
}
