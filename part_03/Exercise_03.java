package part_03;


/**

 Implement the following methods

 */

class Exercise_03 {


    public static void main(String[] strings) {

        // Generate a random int between >= 1 and <= 12
        //int randomMonth = (int)(Math.random() * 12 + 1);
//        int randomMonth() {
//            return (int)(Math.random() * 12 + 1);
//        }
//        private int generateRandomNumber(){
//            int randomMonth = (int)(Math.random() * 12 + 1);
//            return randomMonth;
//        }


        // use a for loop to iterate 1000 times
        for (int i = 0; i < 1000; i++) {

            int randomMonth = (int)(Math.random() * 12 + 1);

            // call getMonthName(int month) and pass your random int
            String month = getMonthName(randomMonth);

            // print the name of the month and the random int generated to the console
            System.out.println("Month number " + randomMonth + " is " + month);
        }

    }

    // Get the name for the month using the random int you generated
    public static String getMonthName(int month) {

        // use a switch statement to determine the name of the month
        String monthString;
        switch (month) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            case 7:
                monthString = "July";
                break;
            case 8:
                monthString = "August";
                break;
            case 9:
                monthString = "September";
                break;
            case 10:
                monthString = "October";
                break;
            case 11:
                monthString = "November";
                break;
            case 12:
                monthString = "December";
                break;
            default:
                monthString = "Invalid month";
                break;
        }

        return monthString;
        // for instance if the random int is 1 the name of month is January

        // return the month name

    }
//    public static void main(String[] strings) {
//
//
//
//        // use a for loop to iterate 1000 times {
//            // Generate a random int between >= 1 and <= 12
//            // call getMonthName(int month) and pass your random int
//            // print the name of the month and the random int generated to the console
//          }
//
//    }
//
//    // Get the name for the month using the random int you generated
//    public static String getMonthName(int month) {
//
//        // use a switch statement to determine the name of the month
//        // for instance if the random int is 1 the name of month is January
//
//        // return the month name
//
//    }
}
