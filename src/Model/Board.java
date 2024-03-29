package Model;

import Enums.GameSymbol;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Board {

    @Setter
    @Getter
    private List<List<Cell>> cell = new ArrayList<>();
    private int size;

    public Board(int size) {
        this.size = size;
        this.cell = initializeCell(size);
    }

    public int getSize() {
        return size;
    }

    private List<List<Cell>> initializeCell(int size) {
        List<List<Cell>> cell = new ArrayList<>();
        for(int row = 0; row < size; row++)
        {
            List<Cell> rowCell = new ArrayList<>();
            for(int col=0; col < size; col++)
            {
                Cell boardCell = new Cell(row, col);
                rowCell.add(boardCell); //add to the inner loop
            }
            cell.add(rowCell); //add to external loop
        }
        return cell;
    }

    public void displayBoard()
    {
       int dimension =  cell.size();
        System.out.println("Dimension" + dimension);
       for(int row=0; row<dimension; row++)
       {
           for(int col=0; col<dimension; col++)
           {
                GameSymbol gameSymbol = cell.get(row).get(col).getGameSymbol();

                if(gameSymbol == null)
                {
                    System.out.print("| - |");
                }
                else
                {
                    System.out.print("|"+gameSymbol+"|");
                }
           }
           System.out.println("\n");
       }
    }

    public List<Cell> isEmpty(Board board)
    {
        int size = board.getSize();
        List<Cell> emptyCell = new ArrayList<>();
        for(int row=0; row<size; row++)
        {
            for(int col=0; col<size; col++) {
                Cell currentCell = cell.get(row).get(col);
                if (currentCell.getGameSymbol() == null) {
                    emptyCell.add(currentCell);
                }
            }
        }
        return emptyCell;
    }





    public void undoMove()
    {

    }
}
