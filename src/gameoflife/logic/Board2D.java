package gameoflife.logic;

public interface Board2D {
    public void createEmptyBoard(int width, int height);
    public Board2D copy();
    public boolean getCellState(int x, int y);
    public void setCellState(int x, int y,boolean state);
    public int getWidth();
    public int getHeight();
}
