package Model;

import Enums.GameSymbol;

public class HumanPlayer extends Player{

    private String name;
    private String email;
    private GameSymbol gameSymbol;

    public HumanPlayer(String name, String email, GameSymbol gameSymbol)
    {
        this.name = name;
        this.email = email;
        this.gameSymbol = gameSymbol;
    }


    @Override
    void makeMove(Board board) {
        super.makeMove(board);
    }
}
