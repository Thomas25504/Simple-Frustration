package edu.assignment.board;

import edu.assignment.player.Player;
import edu.assignment.player.PlayerPath;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<BoardPositions> board;

    private PlayerPath playerOnePath;
    private PlayerPath playerTwoPath;

    public Board() {
        board = new ArrayList<>();
        for(int i = 1; i <= 18; i++){
            board.add(new BoardPositions(i));
        }

        List<BoardPositions> player1path = new ArrayList<>(board);
        player1path.add(new BoardPositions(19));
        player1path.add(new BoardPositions(20));
        player1path.add(new BoardPositions(21));

        List<BoardPositions> player2path = new ArrayList<>();
        player2path.addAll(board.subList(8,18));
        player2path.addAll(board.subList(0,8));
        player2path.add(new BoardPositions(22));
        player2path.add(new BoardPositions(23));
        player2path.add(new BoardPositions(24));

        this.playerOnePath = new PlayerPath(player1path);
        this.playerTwoPath = new PlayerPath(player2path);
    }

    public PlayerPath getPlayerPath(int playerNumber) {
        return playerNumber == 1 ? playerOnePath : playerTwoPath;
    }

    public void getBoard(){
        for (BoardPositions boardPositions : board) {
            System.out.println(boardPositions);
        }
    }
}
