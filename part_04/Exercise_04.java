package part_04;

class Exercise_04 {
    public static void main(String[] args) {
        int[][] table = {
                {12, 45, 67},
                {8, 4, 13, -43, 98},
                {567, 1, 0, -2},
                {18, -456, 14, 6, 48, -80}
        };


        int min = 0;
        int max = 0;

        for (int t=0; t < table.length; t++) {
            for (int i=0; i < table[t].length; i++) {
                if (table[t][i] < min) min = table[t][i];
                if (table[t][i] > max) max = table[t][i];
            }
        }

        System.out.println("min = " + min + " and max = " + max);

//        System.out.println(getMaxVal(dataArray));
//        System.out.println(getMinVal(dataArray));
    }

      // iterate through array and determine max value in array
//    public static int getMaxVal(int[][] dataArray) {
//
//    }


      // iterate through array and determine minimum value
//    public static int getMinVal(int[][] dataArray) {
//
//    }
}