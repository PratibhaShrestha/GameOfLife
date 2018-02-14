package gameoflife;

import gameoflife.logic.Board2D;
import gameoflife.logic.Board2DByte2DArray;

public class Main {
    public static void main(String[] args) {

        Board2D board = new Board2DByte2DArray();

        board.createEmptyBoard(4, 4);

        board.setCellState(0, 0, true);
        board.setCellState(3, 0, true);
        board.setCellState(1, 3, true);
        board.setCellState(2, 3, true);

        for (int y = 0; y < board.getHeight(); y++) {
            for (int x = 0; x < board.getWidth(); x++) {
                if (board.getCellState(x, y)) {
                    System.out.print('X');
                } else {
                    System.out.print('-');
                }
            }
            System.out.println();
        }

    }
}
