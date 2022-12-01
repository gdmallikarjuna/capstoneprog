package com.snipe.learning.arrays;

public class AddMat extends Matrix {

	public AddMat(int row, int col) {
		super(row, col);
	}

	public int[][] addMatrices(int[][] a, int[][] b) {
		int[][] mat = new int[this.getRows()][this.getCols()];
		for (int i = 0; i < this.getRows(); i++)
			for (int j = 0; j < this.getCols(); j++)
				mat[i][j] = a[i][j] + b[i][j];
		return mat;
	}
}
