package com.snipe.learning.arrays;

import java.util.Objects;
import java.util.Scanner;

public class Matrix {
	private int rows;
	private int cols;
	
	public Matrix(int rows, int cols) {
		this.rows = rows;
		this.cols = cols;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getCols() {
		return cols;
	}

	public void setCols(int cols) {
		this.cols = cols;
	}

	public int[][] readMatrix(){
		int[][] a = new int[rows][cols];
		System.out.println("the read the"+(this.rows*this.cols)  +"items::");
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<this.rows;i++)
			for(int j=0;j<this.cols;j++)
				a[i][j]=scan.nextInt();
		
		return a;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(cols, rows);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Matrix other = (Matrix) obj;
		return cols == other.cols && rows == other.rows;
	}

	public void displayMatrix(int[][] a){
		System.out.println("The input matrix");
		for(int i=0;i<this.rows;i++) {
			for(int j=0;j<this.cols;j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
}
