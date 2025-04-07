package edu.assignment.player;

import edu.assignment.board.BoardPositions;

import java.util.ArrayList;
import java.util.List;

public class PlayerPath {
    private List<BoardPositions> path;

    public PlayerPath(List<BoardPositions> path) {
        this.path = path;

    }

    public BoardPositions getStartPosition() {
        return path.get(0);
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
