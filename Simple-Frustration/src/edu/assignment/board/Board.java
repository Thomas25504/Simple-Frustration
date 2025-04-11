package edu.assignment.board;

import edu.assignment.player.Player;


import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<BoardPositions> board;
    public List<BoardPositions> player1path;
    public List<BoardPositions> player2path;



    public Board(int size) {
        switch(size){
            case 1:
                board = new ArrayList<>();
                for(int i = 1; i <= 18; i++){
                    board.add(new BoardPositions(i));
                }

                player1path = new ArrayList<>(board);

                player1path.add(new BoardPositions(19));
                player1path.add(new BoardPositions(20));
                player1path.add(new BoardPositions(21));

                player2path = new ArrayList<>();

                player2path.addAll(board.subList(8,18));
                player2path.addAll(board.subList(0,8));
                player2path.add(new BoardPositions(19));
                player2path.add(new BoardPositions(20));
                player2path.add(new BoardPositions(21));
                break;

                case 2:
                    board = new ArrayList<>();
                    for(int i = 1; i <= 36; i++){
                        board.add(new BoardPositions(i));
                    }

                    player1path = new ArrayList<>(board);

                    player1path.add(new BoardPositions(37));
                    player1path.add(new BoardPositions(38));
                    player1path.add(new BoardPositions(39));
                    player1path.add(new BoardPositions(40));
                    player1path.add(new BoardPositions(41));
                    player1path.add(new BoardPositions(42));


                    player2path = new ArrayList<>();

                    player2path.addAll(board.subList(18,36));
                    player2path.addAll(board.subList(0,18));
                    player2path.add(new BoardPositions(37));
                    player2path.add(new BoardPositions(38));
                    player2path.add(new BoardPositions(39));
                    player2path.add(new BoardPositions(40));
                    player2path.add(new BoardPositions(41));
                    player2path.add(new BoardPositions(42));
                    break;

        }



    }


    public void getBoard(){
        for (BoardPositions boardPositions : board) {
            System.out.println(boardPositions);
        }
    }
}
