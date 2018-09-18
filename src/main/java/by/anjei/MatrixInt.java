package by.anjei;

import java.util.*;
/**
 * Created by IntelliJ IDEA.
 * User: Home
 * Date: 23.09.2014
 * Time: 11:46:49
 * To change this template use File | Settings | File Templates.
 */
public class MatrixInt {
    private int [][] matrix;
    private int size;

    public MatrixInt(int size) {
        this.size = size;
        matrix = new int [size][size];
    }

    public void setMatrix() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
               if((new Random()).nextBoolean()) {
                   matrix[i][j] = (new Random()).nextInt(size);
               } else {
                   matrix[i][j] = (-1) * (new Random()).nextInt(size);
               }
            }
        }
    }

    public int [][] getMatrix() {
        return matrix;
    }

    public void showMatrix() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
