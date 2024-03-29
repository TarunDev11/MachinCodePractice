package Model;

import Enums.GameSymbol;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@AllArgsConstructor
public class Cell {
    private int row;
    private int col;
    private GameSymbol gameSymbol;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public GameSymbol getGameSymbol() {
        return gameSymbol;
    }

    public void setGameSymbol(GameSymbol gameSymbol) {
        this.gameSymbol = gameSymbol;
    }
}
