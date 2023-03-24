package org.example;

public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(3,3);
        matrix.randomFill();

        Matrix other = new Matrix(3, 3);
        other.randomFill();
        Matrix result = matrix.add(other);
        System.out.println("Addition: \n");
        System.out.println("first: \n" + matrix);
        System.out.println("second: \n" + other);
        System.out.println("result: \n" + result);

        result = matrix.mult(other);
        System.out.println("Multiplication: \n");
        System.out.println("first: \n" + matrix);
        System.out.println("second: \n" + other);
        System.out.println("result: \n" + result);
    }
}