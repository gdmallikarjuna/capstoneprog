package com.snipe.learning.arrays;

public class SubMat extends Matrix{

	public SubMat(int row, int col) {
		super(row, col);
	}

	public int[][] subMatrices(int[][] a, int[][] b) {
		int[][] mat = new int[this.getRows()][this.getCols()];
		for (int i = 0; i < this.getRows(); i++)
			for (int j = 0; j < this.getCols(); j++)
				mat[i][j] = a[i][j] - b[i][j];
		return mat;
	}
}
