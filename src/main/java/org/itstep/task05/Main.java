package org.itstep.task05;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws RuntimeException {
        Runner runner = new Runner();
        try {
            runner.halt();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
