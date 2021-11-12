package main.java.simplerpg.view;

public class OutputConsoleView implements OutputView{
    @Override
    public void printMap() {
        for(int row=0; row<4;row++){
            System.out.println();
            for(int col=0;col<4; col++){
//                System.out.print(temp[row][col]+" ");
            }
        }
    }
}
