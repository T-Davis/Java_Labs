/**
 * Created by tdavis on 3/24/17.
 *
 * 1. no
 * 2. precede
 * 3. see code
 * 4. see code
 * 5. no, params must be different, not just return type
 * 6. see code
 * 7. static
 * 8. to do something that objects will require before being instantiated
 * 9. a class inside another class
 * 10. private
 * 11. signature
 * 12. value
 * 13.
 */

//class Stack {
//
//    private int sizeOfArr;
//    private int[] stackArr = new int[10]; //why can't I pass size through? stackArr = new int[sizeOfArr]
//    private int stackPosition;
//
//    public Stack(int sizeOfArr) {
//        this.sizeOfArr = sizeOfArr;
//    }
//
//    public void put(int x) {
//
//        stackArr[stackPosition] = x;
//        System.out.println("You placed " + x + " at position " + stackPosition);
//        stackPosition++;
//    }
//
//    public int get() {
//
//        int getItem = stackArr[stackPosition-1];
//        System.out.println("You got " + getItem);
//        stackPosition--;
//        return getItem;
//    }
//
//}
//class StackController {
//
//    public static void main(String[] args) {
//
//        Stack firstStack = new Stack(10);
//        firstStack.put(1);
//        firstStack.put(2);
//        firstStack.put(3);
//        firstStack.put(4);
//        firstStack.get();
//        firstStack.get();
//        firstStack.put(5);
//        firstStack.put(6);
//        firstStack.get();
//
//
//
//    }
//}


//public class ch6 {
//}

//// Question 3
//class Stack {
//    private char stackArr[];
//    private int top;
//
//    Stack(int stackSize) {
//        this.stackArr = new char[stackSize];
//        this.top = 0;
//    }
//
//    public void push(char ch) {
//        if(pushloc==stackArr.length) {
//            System.out.println(" -- Stack is full");
//            return;
//        }
//
//        stackArr[pushloc++] = ch;
//    }
//
//    // Get a character from the Stack.
//    char pop() {
//        if(poploc == pushloc) {
//            System.out.println(" -- Stack is empty.");
//            return (char) 0;
//        }
//
//        return stackArr[poploc++];
//    }
//}
//
//// Demonstrate the Stack class.
//class StackController {
//    public static void main(String args[]) {
//
//        Stack stackOne = new Stack(10);
//
//        char ch;
//        int i;
//
//        // put some characters into q1
//        for(i=0; i < stackOne[]; i++)
//            stackOne.push((char) ('A' + i));
//
//    }
//}


//// Question 4
//class Test {
//    int a;
//
//    Test(int a) {
//        this.a = a;
//    }
//
//    void swap(Test ob1, Test ob2) {
//
//        int x;
//
//        x = ob1.a;
//        ob1.a = ob2.a;
//        ob2.a = x;
//
//    }
//}


//// Question 6
//class RecFun {
//
//    String str;
//
//
//    RecFun(String str) {
//
//        this.str = str;
//    }
//
//
//    public void recStr(int y) {
//
//        if (y == str.length()) return;
//
//        recStr(y + 1); //y++ doesn't work. Why?
//
//        System.out.print(str.charAt(y));
//    }
//
//
//    public static void main(String[] args) {
//
//        RecFun strToRec = new RecFun("This is my string!");
//        strToRec.recStr(0);
//    }
//}

// Question 13

class Varargs {

    public static int example(int... nums) {
        int sum = 0;
        for( int x : nums) sum += x;
        System.out.println(sum);
        return sum;
    }

}

class VarargsController {

    public static void main(String[] args) {

        Varargs.example(1, 2, 3, 4, 5, 6, 7);
    }
}