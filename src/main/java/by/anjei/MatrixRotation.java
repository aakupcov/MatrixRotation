package by.anjei;

import java.io.*;
/**
 * Created by IntelliJ IDEA.
 * User: Home
 * Date: 24.09.2014
 * Time: 17:59:11
 * To change this template use File | Settings | File Templates.
 */
public class MatrixRotation {
    private int [][] matrix;
    private int matrixSize;
    private int rotationAngle;

    public MatrixRotation(int[][] matrix, int matrixSize){
        this.matrix = matrix;
        this.matrixSize = matrixSize;
    }

    public void setRotationAngle() {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, enter the angle of rotation:");
        try{
            rotationAngle = Integer.valueOf(buf.readLine());
        } catch(IOException e){
            System.err.println(e);
        }
    }
    // counterclockwise rotation
    public void rotateCounterclockwise(){
        int k = rotationAngle / 90;
        while (k > 0) {
            for (int i = 0; i < matrixSize / 2; i++) {
                int f = matrixSize - 1 - i * 2;
                int q = matrixSize - i;
                while (f > 0) {
                    int t = matrix[i][i];
                    for (int j = i; j < q; j++) {
                        if (j < q - 1) {
                            matrix[i][j] = matrix[i][j + 1];
                        } else {
                            for (int r = i; r < q; r++) {
                                if (r < q - 1) {
                                    matrix[r][j] = matrix[r + 1][j];
                                } else {
                                    for (int b = j; b > i - 1; b--) {
                                        if (b > i) {
                                            matrix[r][b] = matrix[r][b-1];
                                        } else {
                                            for (int y = r; y > i; y--) {
                                                if (y > i + 1) {
                                                    matrix[y][b] = matrix[y - 1][b];
                                                } else {
                                                    matrix[y][b] = t;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    f--;
                }
            }
            k--;
        }
    }

     public void showMatrix() {
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
