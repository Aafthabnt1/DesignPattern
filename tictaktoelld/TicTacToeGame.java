package tictaktoelld;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class TicTacToeGame {
    Deque<Player> players;
    Board gameBoard;

    public TicTacToeGame(){
        initilizeGame();
    }

    public void initilizeGame() {
        players=new LinkedList<>();
        PieceX pieceX=new PieceX();
        Player player1=new Player("player1",pieceX);
        PieceO pieceO=new PieceO();
        Player player2=new Player("player2",pieceO);
        players.add(player1);
        players.add(player2);

        gameBoard=new Board(3);
    }

    public String startGame(){
        boolean noWinner=true;
        while(noWinner){
            Player playerTrun=players.removeFirst();
            gameBoard.printBoard();
            if(gameBoard.totalSize==0){
                noWinner=false;
                continue;
            }
            System.out.println("Player:"+playerTrun.name+" Enter the row and column: ");
            Scanner sc=new Scanner(System.in);
            var row=sc.nextInt();
            var col=sc.nextInt();
            var pieceAddedSuccessfully= gameBoard.addPiece(row,col,playerTrun.piece);
            if(!pieceAddedSuccessfully){
                System.out.println("Incorrect position chosen,try again");
                players.addFirst(playerTrun);
                continue;
            }
            players.addLast(playerTrun);
            boolean winner=isThereWinner(row,col,playerTrun.piece.pieceType);
            if(winner){
                return playerTrun.name + " is Winner";
            }
        }
        return "tie";
    }

    private boolean isThereWinner(int row, int col, PieceType pieceType) {

        var isRow=true;
        var isCol=true;
        var isDiagonal=true;
        var isCrossDiagonal=true;
        for (int i=0;i<gameBoard.size;i++){
            if(gameBoard.board[row][i]==null || gameBoard.board[row][i].pieceType!=pieceType){
                isRow=false;
            }
        }
        for (int i=0;i<gameBoard.size;i++){
            if(gameBoard.board[i][col]==null || gameBoard.board[i][col].pieceType!=pieceType){
                isCol=false;
            }
        }

        for (int i=0,j=0;i<gameBoard.size;i++,j++){
            if(gameBoard.board[i][j]==null || gameBoard.board[i][j].pieceType!=pieceType){
                isDiagonal=false;
            }
        }

        for (int i=0,j=gameBoard.size-1;i<gameBoard.size;i++,j--){
            if(gameBoard.board[i][j]==null || gameBoard.board[i][j].pieceType!=pieceType){
                isCrossDiagonal=false;
            }
        }
        return isRow || isDiagonal || isCol || isCrossDiagonal;
    }
}
