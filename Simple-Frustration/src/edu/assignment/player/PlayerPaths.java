package edu.assignment.player;

import edu.assignment.board.Board;
import edu.assignment.board.BoardPositions;

import java.util.List;

public interface PlayerPaths {

    void playerPath(List<BoardPositions> boardPositions);

    BoardPositions getCurrentPosition();

    void setNewPosition(int moves);

    boolean isAtEnd();
}
