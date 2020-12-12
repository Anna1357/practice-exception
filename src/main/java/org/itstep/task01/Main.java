package org.itstep.task01;

public class Main {
    public static void main(String[] args) {
        List list = new List(10);
        for (int i = 0; i <= 10; i++) {
            try {
                list.add(i);
            } catch (FullListException exp) {
                System.err.println(exp.getMessage());
            }
        }
        for (int i = 0; i <= 10; i++) {
            try {
                list.removeLast();
            } catch (EmptyListException exp) {
                System.err.println(exp.getMessage());
            }
        }
    }
}
