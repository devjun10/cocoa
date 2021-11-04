package main.java.indian.view;

public interface InputView {
    void printStartManual();

    int inputYear() throws Exception;

    int inputMonth() throws Exception;

    int inputDay() throws Exception;
}
