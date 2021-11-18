package com.example.clock.view;

import java.util.Objects;

public class CurrentTime {
    private String[] timeBoard;

    public CurrentTime(String[] value) {
        validateValue(value);
        this.timeBoard = value;
    }

    private void validateValue(String[] value) {
        Objects.requireNonNull(value);
        if (value.length == 0) {
            throw new IllegalArgumentException();
        }
    }

    public String[] getTimeBoard() {
        return timeBoard;
    }

    //    public String getBoard() {
//        sb.setLength(0);
//        for (int i = 0; i < board.length; i++) {
//            if (i != 0 && i % 6 == 0)
//                sb.append("\n");
//            sb.append(board[i]).append(" ");
//        }
//        return sb.toString();
//    }
}
