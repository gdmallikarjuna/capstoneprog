package com.snipe.learning.arrays;

import java.util.Scanner;

public class Matrix {

	public int getRows() {
		return rows;
	}

	public int getCols() {
		return cols;
	}

	private int rows;
	private int cols;

	public Matrix(int rows, int cols) {
		this.rows = rows;
		this.cols = cols;
	}

	public int[][] read() {
		int[][] a = new int[rows][cols];
		Scanner scan = new Scanner(System.in);
		System.out.println("the input to the matrix" + (rows * cols) + "items");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				a[i][j] = scan.nextInt();
			}
		}
    return a;
	}

	public void display(int[][] mat) {
		System.out.println("Array Items");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
