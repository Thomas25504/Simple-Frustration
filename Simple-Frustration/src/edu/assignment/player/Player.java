package edu.assignment.player;

import edu.assignment.board.Board;
import edu.assignment.board.BoardPositions;

import java.util.List;

public class Player implements PlayerPaths{
    private String name;
    private int turn = 1;
    public int currentPosition = 0;

    private List<BoardPositions> path;


    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getTurn() {
        return turn;
    }

    public void incrementTurn() {
        this.turn++;
    }




    @Override
    public BoardPositions getCurrentPosition() {
        return path.get(currentPosition);

    }

    @Override
    public void setNewPosition(int moves) {
        int target = currentPosition + moves;

        if (target >= path.size()) {
            currentPosition = path.size() - 1; // 🛑 Last valid index
        } else {
            currentPosition = target;
        }
    }

    @Override
    public boolean isAtEnd() {
        if(currentPosition >= path.size()-1){
            return true;
        }
        return false;
    }

    @Override
    public void playerPath(List<BoardPositions> path) {
        this.path = path;
    }



}
