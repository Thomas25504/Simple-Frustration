package edu.assignment.board;

public class BoardPositions {
    private final int index;
    private int size;


    public BoardPositions(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void boardSize(int size){
        this.size = size;
    }

    @Override
    public String toString() {
        if(index == 19){
            return "Position Tail 1";
        }
        else if(index == 20){
            return "Position Tail 2";
        }
        else if(index == 21){
            return "Position Tail 3";
        }
        return "Position " + index;
    }
}
