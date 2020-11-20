package rockPaperScissors;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char playerChoice;
        int wins = 0, losses = 0, ties = 0;

        while (true) {
            System.out.print("Enter [r]ock, [p]aper, [s]cissors, or [q]uit: ");
            playerChoice = sc.nextLine().charAt(0);

            if (playerChoice == 'q') {
                System.out.println("\nWins: " + wins);
                System.out.println("Losses: " + losses);
                System.out.println("Ties: " + ties);
                break;
            }

            switch (seeWhoWon(playerChoice)) {
                case 1:
                    System.out.println("You won!");
                    ++wins;
                    break;
                case 0:
                    System.out.println("It was a tie");
                    ++ties;
                    break;
                case -1:
                    System.out.println("You lost!");
                    ++losses;
                    break;
            }
        }
    }

    //1 if player winners, -1 if computer wins, 0
    static int seeWhoWon(char playerChoice) {
        char[] choices = {'r', 'p', 's'};
        char computerChoice = choices[(int) (Math.random()*3)];

        System.out.println("The computer chose: " + computerChoice);

        if (playerChoice == computerChoice)
            return 0;

        if (playerChoice == 'r') {
            if (computerChoice == 's')
                return 1;
            else
                return -1;
        } else if (playerChoice == 'p') {
            if (computerChoice == 'r')
                return 1;
            else
                return -1;
        } else {
            if (computerChoice == 'p')
                return 1;
            else
                return -1;
        }

    }
}
