package Model;

import Enums.GameSymbol;

public class BotPlayer extends Player{

    private Board board;
    private GameSymbol gameSymbol;
    public BotPlayer(Board board, GameSymbol gameSymbol) {
        this.board = board;
        this.gameSymbol = gameSymbol;
    }

    @Override
    public void makeMove(Board board)
    {

    }
}
