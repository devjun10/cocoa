package com.example.clock.view;

public class OutputConsoleView implements OutputView {
    private static final StringBuilder sb = new StringBuilder();

    @Override
    public void printCurrentTime(CurrentTime currentTime) {
        String[] timeBoard = currentTime.getTimeBoard();
        for (int i = 0; i < timeBoard.length; i++) {
            if (i != 0 && i % 6 == 0)
                sb.append("\n");
            sb.append(timeBoard[i]).append(" ");
        }
        System.out.println(sb);
    }
}
