package Program;

import java.util.Scanner;

public class player {
    String gameSide;
    Scanner scanner = new Scanner(System.in);

    public player(String gameSide) {
        this.gameSide = gameSide;
    }

    public void getGameSide() {
        System.out.println(this.gameSide);
    }

    public void gameMove(String[] Array) {
        int num;

        if (this.gameSide.equals("X")) {
            System.out.println("Введите номер ячейки для X: \n");
        } else {
            System.out.println("Введите номер ячейки для 0: \n");
        }
        num = scanner.nextInt();


        if (this.gameSide.equals("X")) {
            Array[num - 1] = "X";
        } else Array[num - 1] = "0";
        xyGame.printArr(Array);
    }

}
