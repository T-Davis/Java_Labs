package part_04;

/**

 Implement, and populate a non-circular, consumptive queue (once a value has been retrieved
 it cannot be retrieved again) of integers 0 through 100. Then print out every other
 value in the queue.

 expected output: 0,2,4,6,8.....100

 */

class Queue {
    private char q[];
    private int putloc, getloc;

    Queue(int arrSize) {
        q = new char[arrSize];
        putloc = 0;
        getloc = 0;
    }

    void put(char ch) {
        if(putloc == q.length) {
            System.out.println(" -- Queue is full.");
            return;
        }

        q[++] = ch;
    }

    char get() {
        if(getloc == putloc) {
            System.out.println(" -- Queue is empty.");
            return (char) 0;
        }

        return q[getloc++];
    }
}

// Demonstrate the Queue class.
class QDemo {
    public static void main(String args[]) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("Using bigQ to store the alphabet.");
        for(i=0; i < 26; i++)
            bigQ.put((char) ('A' + i));

        // retrieve and display elements from bigQ
        System.out.print("Contents of bigQ: ");
        for(i=0; i < 26; i++) {
            ch = bigQ.get();
            if(ch != (char) 0) System.out.print(ch);
        }

        System.out.println("\n");


        System.out.println("Using smallQ to generate erros.");
        for(i=0; i < 5; i++) {
            System.out.print("Attempting to store " +
                    (char) ('Z' - i));

            smallQ.put((char) ('Z' - i));

            System.out.println();
        }
        System.out.println();

        System.out.print("Contents of smallQ: ");
        for(i=0; i < 5; i++) {
            ch = smallQ.get();

            if(ch != (char) 0) System.out.print(ch);
        }
    }
}
