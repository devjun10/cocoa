package com.example.clock.model;

public class Board {

    private final String[] board = {
            "한", "두", "세", "네", "다", "섯",
            "여", "섯", "일", "곱", "여", "덟",
            "아", "홉", "열", "한", "두", "시",
            "자", "이", "삼", "사", "오", "십",
            "정", "일", "이", "삼", "사", "육",
            "오", "오", "칠", "팔", "구", "분"
    };

    public String[] getBoard() {
        String[] newBoard = new String[board.length];
        for (int i = 0; i < board.length; i++) {
            newBoard[i] = board[i];
        }
        return newBoard;
    }
}
