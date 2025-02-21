package tictaktoelld;

public class Board {
    int size;
    int totalSize;
    PlayingPiece[][] board;

    Board(int size){
        this.size=size;
        board=new PlayingPiece[size][size];
        totalSize=size*size;
    }

    void printBoard(){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(board[i][j]!=null){
                    System.out.print(board[i][j].pieceType+"\t"+"|");
                }else {
                    System.out.print(board[i][j] + "\t" + "|");
                }
            }
            System.out.println();
        }
    }

    public boolean addPiece(int row, int col, PlayingPiece pieceType) {
        if(board[row][col]==null){
            board[row][col]=pieceType;
            totalSize--;
            return true;
        }
        return false;
    }
}
