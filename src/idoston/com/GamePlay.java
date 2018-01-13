package idoston.com;
/**
 * @author Doston Hamrakulov <doston.hamrakulov@gmail.com> ID: 151ADB089
 * @version 1.0
 * @since 12/01/18
 * Here is the core of the MinMax algorithm
 */

public class GamePlay {	
    int row;
    int col;
    private int value;      //Value of utility function
    ////////////////////

    public GamePlay() {
        row = -1;
        col = -1;
        value = 0;
    }//end Constructor

    //Move done
    public GamePlay moveDone(int row, int col) {
        GamePlay moveDone = new GamePlay();
        moveDone.row = row;
        moveDone.col = col;
        moveDone.value = -1;
        return moveDone;
    }// end moveDone
    
    //Move for expansion (with utility function)
    public GamePlay possibleMove(int row, int col, int value) {
        GamePlay posisibleMove = new GamePlay();
        posisibleMove.row = row;
        posisibleMove.col = col;
        posisibleMove.value = value;
        return posisibleMove;
    }//end possibleMove

    ///Today is done 07.12.2018
    //Move used to compare in MinMax algorithm
    public GamePlay moveToCompare(int value) {
        GamePlay moveToCompare = new GamePlay();
        moveToCompare.row = -1;
        moveToCompare.col = -1;
        moveToCompare.value = value;
        return moveToCompare;
    }//end moveCOmpare

    public int getValue() {
        return value;
    }//end getValue

    public void setRow(int aRow) {
        row = aRow;
    }//end setRow

    public void setCol(int aCol) {
        col = aCol;
    }//end setCol

    public void setValue(int aValue) {
        value = aValue;
    }//end setValue
}//end class GamePlay
