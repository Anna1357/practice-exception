package org.itstep.task03;

public class Triangle {
    private final int a;
    private final int b;
    private final int c;


    public Triangle(int a, int b, int c) throws CreateTriangleException {
        if ((a + b) < c) {
            throw new CreateTriangleException("Невозможно создать треугольник ");
        }
        if ((b + c) < a){
            throw new CreateTriangleException("Невозможно создать треугольник ");
        }
        if ((c + a) < b){
            throw new CreateTriangleException("Невозможно создать треугольник ");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getSide1() {
        return a;
    }

    public int getSide2() {
        return b;
    }

    public int getSide3() {
        return c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "Сторона 1=" + a +
                ", Сторона 2=" + b +
                ", Сторона 3=" + c +
                '}';
    }
}
