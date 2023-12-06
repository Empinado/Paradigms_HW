package Program;

import java.util.Arrays;

public class xyGame {
    public static int tmp;

    public static void showMenu() {

    }

    public static void printArr(String[] Array) {
        System.out.println(Array[0] + " " + Array[1] + " " + Array[2] + "\n" +
                Array[3] + " " + Array[4] + " " + Array[5] + "\n" +
                Array[6] + " " + Array[7] + " " + Array[8] + "\n");
    }

    public static void Game() {
        String[] cellGame = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};

        xyGame.printArr(cellGame);

        player playerX = new player("X");
        player player0 = new player("0");

        for (int i = 0; i < 4; i++) {
            if (victoryСheck(cellGame) == false) {
                playerX.gameMove(cellGame);

            }
            if (victoryСheck(cellGame) == false) {
                player0.gameMove(cellGame);
            }
        }
        //9 ход вне цикла, если на этот момент никто не победил.
        if (victoryСheck(cellGame) == false) {
            playerX.gameMove(cellGame);

        }
        if (tmp == 1) {
            System.out.println("Winner PlayerX!");
        }
        if (tmp == 2) {
            System.out.println("Winner Player0!");
        }
        if (tmp == 0) {
            System.out.println("Ничья!");
        }

    }

    public static boolean victoryСheck(String[] Array) {
        int[][] winCombo = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}, {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, {0, 4, 8}, {2, 4, 6}};

        for (int[] el : winCombo) {
            if (Array[el[0]].equals(Array[el[1]]) && Array[el[0]].equals(Array[el[2]])) {

                if (Array[el[0]].equals("X")) {
                    tmp = 1;

                }
                if (Array[el[0]].equals("0")) {
                    tmp = 2;

                }
                return true;
            }
        }
        return false;
    }

}
