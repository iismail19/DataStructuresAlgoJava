package ds_stack;


public class App {
    public static void main(String[] args){
        Stack myStrack = new Stack(5);
        myStrack.push(12);
        myStrack.push(14);
        myStrack.push(50);
        myStrack.push(5);
        myStrack.push(9);
        myStrack.push(7);

        Stack.printStack(myStrack);
        System.out.println(myStrack.pop());


        String original = "ISMAIL";
        String reversed = reverseString(original);
        System.out.println(reversed);



    }

    public static String reverseString(String str){
        int size = str.length();
        String reveresedString = "";
        GenericStack<Character> StrStack = new GenericStack(size);
        for(int i =0; i< size; i++){
            StrStack.push(str.charAt(i));
        }

        while (!StrStack.isEmpty()){
            reveresedString += StrStack.pop().toString();
        }

        return reveresedString;
    }
}
