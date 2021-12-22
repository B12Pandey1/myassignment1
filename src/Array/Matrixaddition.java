package Array;

import java.util.Scanner;

public class Matrixaddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = 2;
        int col = 2;
        int[][] arr1 = new int[row][col];
        System.out.println("Matrix 1");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("enter an element:");
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix 2");

        int[][] arr2 = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("enter an element:");
                arr2[i][j] = sc.nextInt();
            }
        }

        int[][] resultArray = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                resultArray[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("Added Matrix");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(resultArray[i][j] + " ");
            }
            System.out.println();
        }
    }

}