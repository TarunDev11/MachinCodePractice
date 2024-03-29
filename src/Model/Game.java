package Model;

import Enums.GameStatus;
import Enums.GameSymbol;
import lombok.*;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Exception.*;

@Getter
@Setter
@NoArgsConstructor
public class Game {
    private Board board;
    private GameSymbol gameSymbol;
    private GameStatus gameStatus;
    private List<Player> players = new ArrayList<>();
    private BotPlayer botPlayer;

    public void startGame()
    {
        getUserInput();
        gameStatus = GameStatus.IN_PROGRESS;
        board.displayBoard();

    }

    private void getUserInput() {
        System.out.println("Input the size of the board");
        Scanner scn = new Scanner(System.in);
        int dimension = scn.nextInt();

        scn.nextLine();
        System.out.println("Do you wish to play against a bot? Y OR N");
        int count = 0;
        String ans = scn.nextLine();
        if(ans.equalsIgnoreCase("Y"))
        {
            BotPlayer botPlayer = new BotPlayer(board, gameSymbol.Z);
            count++;
        }
        else if(ans.equalsIgnoreCase("N"))
        {

            System.out.println("Enter the number of players");
            int numOfPlayers = scn.nextInt();
            board = new Board(numOfPlayers+1);

            while(count < numOfPlayers) {
                System.out.println("Enter your name");
                String name = scn.nextLine();

                System.out.println("Enter your email id");
                String email = scn.nextLine();

                System.out.println("Choose a symbol between A to Z");
                try
                {
                    GameSymbol gameSymbol = GameSymbol.valueOf(scn.nextLine().toUpperCase());
                }
                catch(Exception e)
                {
                    throw new InvalidSymbolException("Kindly choose an alphabet within A-Z");
                }


                players.add(new HumanPlayer(name, email, gameSymbol));
                count++;
            }
        }
        else
        {
            throw new IllegalInputException("Kindly provide Y or N");
        }





    }


    public void checkWinner()
    {

    }



}
