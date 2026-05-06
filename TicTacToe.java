/**
 * TicTacToe
 * UC8 controls the continuous game loop and alternates
 * turns until the game ends.
 */

public class TicTacToe {

    static boolean isHumanTurn = true;
    static boolean gameOver = false;

    public static void main(String[] args) {

        while (!gameOver) {

            if (isHumanTurn) {

                System.out.println("Human player's turn");

            } else {

                System.out.println("Computer player's turn");
            }

            checkGameStatus();

            isHumanTurn = !isHumanTurn;
        }

        System.out.println("Game Over");
    }

    static void checkGameStatus() {

        // Sample condition to stop the loop
        gameOver = true;
    }
}