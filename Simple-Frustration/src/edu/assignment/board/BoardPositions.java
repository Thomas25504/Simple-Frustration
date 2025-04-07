package edu.assignment.board;

public class BoardPositions {
    private final int index;

    public BoardPositions(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public String toString() {
        return "Position " + index;
    }
}
