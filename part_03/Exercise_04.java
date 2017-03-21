package part_03;


import java.util.Scanner;

/**

 Code a "Rock Paper Scissors" Game

 */

public class Exercise_04 {

    public static void main(String[] strings) {

        // generate a random number >= 0 and <= 3
        int randomNumber = (int)(Math.random() * 3 + 1);
        // use this as the computer's hand
        int computerHand = randomNumber;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1 for scissor, 2 for rock, 3 for paper: ");
        int playerHand = input.nextInt();

        // call getHand(int hand) to determine the computers hand
        String compHand = getHand(computerHand);
        // call getHand(int hand) to determine the players hand
        String playHand = getHand(playerHand);
        // call determineWinner(int computerHand, int playerHand) to determine who one
        String winner = determineWinner(computerHand, playerHand);
        // print out a message to the console stating which hand the computer had, which hand
        // the play had and who won.
        System.out.println("Computer chose " + compHand + " , player chose " + playHand + "\n" +
                winner);

    }

    public static String getHand(int hand) {

        // use a switch statement to determine each players hand
        // 0 = scissor, 1 = rock, 2 = paper
        String choice = "";
        switch (hand) {
            case 1:
                choice = "scissor";
                break;
            case 2:
                choice = "rock";
                break;
            case 3:
                choice = "paper";
                break;
        }

        // return hand
        return choice;
    }

    public static String determineWinner(int computer, int player) {
        if (computer == player) return "It's a draw... Try again";

        String status = "";

        switch (player) {
            // use conditional ("?") operator
            case 1:
                status = (computer != 2) ? "You won!" : "You lost :(";
                break;
            case 2:
                status = (computer != 3) ? "You won!" : "You lost :(";
                break;
            case 3:
                status = (computer != 1) ? "You won!" : "You lost :(";
                break;
            // implement the two remaining cases
        }

         return status;
    }
}