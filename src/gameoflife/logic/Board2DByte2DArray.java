package gameoflife.logic;

public class Board2DByte2DArray implements Board2D {

    private byte[][] board;
    private int boardWidth, boardHeight;

    @Override
    public void createEmptyBoard(int width, int height) {
        boardWidth = width;
        boardHeight = height;
        board = new byte[width][height];
    }

    @Override
    public Board2D copy() {
        return null;
    }

    @Override
    public boolean getCellState(int x, int y) {
        return board[x][y] != (byte) 0;
    }

    @Override
    public void setCellState(int x, int y, boolean state) {
        if (state)
            board[x][y] = 1;
        else
            board[x][y] = 0;
    }

    @Override
    public int getWidth() {
        return boardWidth;
    }

    @Override
    public int getHeight() {
        return boardHeight;
    }
}
