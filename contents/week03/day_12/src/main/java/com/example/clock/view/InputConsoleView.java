package com.example.clock.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class InputConsoleView implements InputView {
    private Input input = new Input();

    @Override
    public int inputHour() throws Exception {
        int value;
        while (true) {
            try {
                value = input.integer();
                validateHour(value);
                break;
            } catch (IndexOutOfBoundsException e) {
                System.out.println("범위를 초과한 값입니다. 올바른 값을 입력해주세요.");
            } catch (IllegalArgumentException e) {
                System.out.println("올바르지 않은 입력값 입니다. 올바른 값을 입력해주세요.");
                e.getMessage();
            } catch (NoSuchElementException e) {
                System.out.println("최소 한 자리수 이상의 숫자를 입력해주세요.");
            } catch (Exception e) {
                e.getMessage();
            }
        }
        return value;
    }

    private void validateHour(int hour) {
        if (hour < 0 || hour > 24) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public int inputMinute() throws Exception {
        int value;
        while (true) {
            try {
                value = input.integer();
                validateMinute(value);
                break;
            } catch (IndexOutOfBoundsException e) {
                System.out.println("범위를 초과한 값입니다. 올바른 값을 입력해주세요.");
            } catch (IllegalArgumentException e) {
                System.out.println("올바르지 않은 입력값 입니다. 올바른 값을 입력해주세요.");
                e.getMessage();
            } catch (NoSuchElementException e) {
                System.out.println("최소 한 자리수 이상의 숫자를 입력해주세요.");
            } catch (Exception e) {
                e.getMessage();
            }
        }
        return value;
    }

    private void validateMinute(int minute) {
        if (minute < 0 || minute > 60) {
            throw new IndexOutOfBoundsException();
        }
    }

    class Input {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        public int integer() throws Exception {
            if (!st.hasMoreElements()) {
                st = new StringTokenizer(br.readLine());
            }
            return Integer.parseInt(st.nextToken());
        }

        public String next() throws Exception {
            if (!st.hasMoreElements()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }
    }
}
