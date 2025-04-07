package edu.assignment.player;

import edu.assignment.board.BoardPositions;

public class Player{
    private String name;
    private int turn = 0;
    private BoardPositions currentPosition;

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


}
