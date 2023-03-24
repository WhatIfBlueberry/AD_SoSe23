package org.example;

import java.util.Scanner;
import java.util.function.BiConsumer;

public class Matrix {

    private final int rows;
    private final int columns;
    private final double[][] matrix;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.matrix = new double[rows][columns];
    }

    public double getCell(int row, int column) {
        return this.matrix[row][column];
    }

    public double[][] getArray() {
        return this.matrix;
    }

    public void init() {
        forEach((i,j) -> this.matrix[i][j] = 0);
    }

    public Matrix add(Matrix other) {
        int actions = rows * columns;
        //long startTime = System.currentTimeMillis();
        Matrix ret = new Matrix(rows, columns);
        double[][] array = ret.getArray();
        forEach((i,j) -> array[i][j] = this.getCell(i, j) + other.getCell(i, j));
        //long endTime = System.currentTimeMillis();
        //printActionsAndTime(actions, endTime - startTime);
        return ret;
    }

    public Matrix mult(Matrix other) {
        int actions = rows * columns * columns;
        //long startTime = System.currentTimeMillis();
        Matrix ret = new Matrix(this.rows, other.columns);
        double [][] array = ret.getArray();
        forEach((i,j) -> {
            for (int k = 0; k < this.columns; k++) {
                array[i][j] += this.getCell(i, k) * other.getCell(k, j);
            }
        });
        //long endTime = System.currentTimeMillis();
        //printActionsAndTime(actions, endTime - startTime);
        return ret;
    }

    public void randomFill() {
        forEach((i,j) -> this.matrix[i][j] = Math.random());
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        forEach((i, j) -> {
            System.out.printf("Enter value for row %d, column %d: ", i+1, j+1);
            matrix[i][j] = scanner.nextInt();
        });
    }

    public void print() {
        System.out.println(this);
    }

    private void forEach(BiConsumer<Integer, Integer> action) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                action.accept(i, j);
            }
        }
    }

    private void printActionsAndTime(int actions, long time) {
        System.out.printf("this calcuations took %d actions", actions);
        System.out.printf(" and %.2f ms \n", (float) time);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (double[] row : matrix) {
            sb.append("[ ");
            for (double num : row) {
                sb.append(num).append(" ");
            }
            sb.append("]\n");
        }
        return sb.toString();
    }
}
