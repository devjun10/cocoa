package main.java.indian;

public interface InputView {
    void printStartManual();

    int askYear() throws Exception;

    int askMonth() throws Exception;

    int askDay() throws Exception;
}
