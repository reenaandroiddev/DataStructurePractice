package com.prep.arrays;

/*Given an array of scores that are non-negative integers. Player 1 picks one of the numbers from either end of the array followed by the player 2 and then player 1 and so on. Each time a player picks a number, that number will not be available for the next player. This continues until all the scores have been chosen. The player with the maximum score wins.

Given an array of scores, predict whether player 1 is the winner. You can assume each player plays to maximize his score.

Example 1:

Input: [1, 5, 2]
Output: False
Explanation: Initially, player 1 can choose between 1 and 2.
If he chooses 2 (or 1), then player 2 can choose from 1 (or 2) and 5. If player 2 chooses 5, then player 1 will be left with 1 (or 2).
So, final score of player 1 is 1 + 2 = 3, and player 2 is 5.
Hence, player 1 will never be the winner and you need to return False.


Example 2:

Input: [1, 5, 233, 7]
Output: True
Explanation: Player 1 first chooses 1. Then player 2 have to choose between 5 and 7. No matter which number player 2 choose, player 1 can choose 233.
Finally, player 1 has more score (234) than player 2 (12), so you need to return True representing player1 can win.


Constraints:

1 <= length of the array <= 20.
Any scores in the given array are non-negative integers and will not exceed 10,000,000.
If the scores of both players are equal, then player 1 is still the winner.*/


public class PlayerWinProblem {

    public static void main(String[] args) {
                            // 0,2,4,6
        // p1 = 10 + 2 + 9 = 0 + 2 + 4 = 21
        // p2 = 20 + 8 = 28 = 1 + 3 + // 5 ArrayIndexError will be thrown
        // I need to make sure that or p2 should be less than or equal to lenght-1
        //

        int[] arrOfScores = {1,2,89,8,9};
        System.out.println("is player one winner:"+isPlayer1Winner(0,arrOfScores.length,arrOfScores));
        // How to achieve same solution in for reverse
        System.out.println("is player one winner:"+isPlayer1Winner(arrOfScores.length,0,arrOfScores));

    }

    public static boolean isPlayer1Winner(int startIndex, int endIndex,int[] arrOfScores) {

        int player1Count = 0;
        int player2Count = 0;
        int player1Position = 0;
        int player2Position = 0;

        for (int i = startIndex; i < endIndex-1; i++) {
            player1Position = (i * 2);

                if (player1Position<endIndex) {
                    player1Count += arrOfScores[player1Position];
                    player2Position = player1Position + 1;
                }
                if(player2Position<endIndex) {
                    player2Count += arrOfScores[player2Position];
                }
        }

        System.out.println("Final Player1 Count:" + player1Count);
        System.out.println("Final Player2 Count:" + player2Count);
        return player1Count > player2Count;
    }
}
