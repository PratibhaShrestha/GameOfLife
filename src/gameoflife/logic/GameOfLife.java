package gameoflife.logic;

public interface GameOfLife {
    public void nextGeneration();
    public Board2D getBoard();
    public void setBoard(Board2D board);

}
