package by.anjei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by IntelliJ IDEA.
 * User: Home
 * Date: 24.09.2014
 * Time: 17:56:11
 * To change this template use File | Settings | File Templates.
 */
public class MatrixRotationRunner {
    public static void main(String []args){
        int matrixSize = 1;
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, enter the size of matrix.");
        try{
            matrixSize = Integer.valueOf(buf.readLine());
        }catch(IOException e){
            System.err.println(e);
        }
        MatrixInt matrix = new MatrixInt(matrixSize);
        matrix.setMatrix();
        matrix.showMatrix();
        MatrixRotation matrixRotator = new MatrixRotation(matrix.getMatrix(),matrixSize);
        matrixRotator.setRotationAngle();
        matrixRotator.rotateCounterclockwise();
        matrix.showMatrix();
    }
}
