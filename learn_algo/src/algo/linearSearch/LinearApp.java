package algo.linearSearch;

public class LinearApp {

    public static void main(String[] args){
        int[] array = {12,13,4,25,7,98,9};
        int found = linearSearch(array, 25);
        System.out.println("If not found will return neg 1: " + found);
    }
    // O(n)
    public static int linearSearch(int[] a, int x){
        for(int i =0; i < a.length; i++){
            if(a[i] == x)
                return a[i];
        }
        return -1;
    }
}
