package com.snipe.learning.arrays;

public class MultMat extends Matrix {

	public MultMat(int row, int col) {
		super(row, col);
	}

	public int[][] mulMatrices(int[][] a, int[][] b) {
		int[][] mat = new int[this.getRows()][this.getCols()];
		for (int i = 0; i < this.getRows(); i++) {
			for (int j = 0; j < this.getCols(); j++) {
				mat[i][j] = 0;
				for (int k = 0; k < this.getCols(); k++) {
					mat[i][j] = a[i][k] + b[k][j];

				}

			}
		}
		return mat;
	}
}
