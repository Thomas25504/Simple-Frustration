package edu.assignment.player;

import edu.assignment.board.BoardPositions;

import java.util.ArrayList;
import java.util.List;

public class PlayerPath {
    private ArrayList<BoardPositions> path;
    private int startPos;

    public PlayerPath(ArrayList<BoardPositions> path, int startIndex) {
        this.path = path;
        this.startPos = startIndex;
    }

    public BoardPositions getStartPosition() {
        return path.get(startPos);
    }

    public BoardPositions getNextPosition(BoardPositions current, int moves) {
        int currentPos = path.indexOf(current);
        int nextPos = currentPos + moves;

        if(nextPos >= path.size()) return null;
        return path.get(nextPos);

    }

    public boolean isAtEnd(BoardPositions current) {
        return path.indexOf(current) == path.size() - 1;
    }
}
