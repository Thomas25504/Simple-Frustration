package edu.assignment.board;

import edu.assignment.player.Player;
import edu.assignment.player.PlayerPath;

import java.util.ArrayList;

public class Board {
    private ArrayList<BoardPositions> board;

    private PlayerPath playerOnePath;
    private PlayerPath playerTwoPath;

    public Board() {
        board = new ArrayList<>();
        for(int i = 1; i <= 18; i++){
            board.add(new BoardPositions(i));
        }
    }

    public void getBoard(){
        for (BoardPositions boardPositions : board) {
            System.out.println(boardPositions);
        }
    }
}
