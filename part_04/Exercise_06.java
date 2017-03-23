//package part_04;
//
///**
//
// Implement, and populate a non-circular, consumptive queue (once a value has been retrieved
// it cannot be retrieved again) of integers 0 through 100. Then print out every other
// value in the queue.
//
// expected output: 0,2,4,6,8.....100
//
// */
//
//class Queue {
//    private int q[];
//    private int putloc, getloc;
//
//    Queue(int size) {
//        q = new int[size];
//        putloc = getloc = 0;
//    }
//
//    void put(char ch) {
//        if(putloc==q.length) {
//            System.out.println(" -- Queue is full.");
//            return;
//        }
//
//        q[putloc++] = ch;
//    }
//
//    int get() {
//        if(getloc == putloc) {
//            System.out.println(" -- Queue is empty.");
//            return (char) 0;
//        }
//
//        return q[getloc++];
//    }
//}
//
//class QController {
//    public static void main(String args[]) {
//        Queue qArr = new Queue(100);
//        char ch;
//        int i;
//
//        System.out.println("storing ints...");
//        for(int x : qArr)
//            bigQ.put((char) ('A' + i));
//
//        // retrieve and display elements from bigQ
//        System.out.print("Contents of bigQ: ");
//        for(i=0; i < 26; i++) {
//            ch = bigQ.get();
//            if(ch != (char) 0) System.out.print(ch);
//        }
//
//        System.out.println("\n");
//
//
//        System.out.println("Using smallQ to generate erros.");
//        // Now, use smallQ to generate some errors
//        for(i=0; i < 5; i++) {
//            System.out.print("Attempting to store " +
//                    (char) ('Z' - i));
//
//            smallQ.put((char) ('Z' - i));
//
//            System.out.println();
//        }
//        System.out.println();
//
//        // more errors on smallQ
//        System.out.print("Contents of smallQ: ");
//        for(i=0; i < 5; i++) {
//            ch = smallQ.get();
//
//            if(ch != (char) 0) System.out.print(ch);
//        }
//    }
//}
