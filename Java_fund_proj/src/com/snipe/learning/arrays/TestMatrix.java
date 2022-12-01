package com.snipe.learning.arrays;

public class TestMatrix {

	 public static void main(String args[]) {
		 
		 Matrix mat = new Matrix(2,2);
		 int[][] a =mat.read();
		 int[][] b =mat.read();
		 
		 System.out.println("ADDITION MATRIX");
		 AddMat add = new AddMat(2,2);
		 int[][] c=add.addMatrices(a, b);
		 mat.display(a);
		 mat.display(a);
		 mat.display(c);
		 
		 System.out.println("SUBTRACTION MATRIX");
		 SubMat sub = new SubMat(2,2);
		 c=sub.subMatrices(a, b);
		 mat.display(a);
		 mat.display(a);
		 mat.display(c);
		 
		 System.out.println("MULTIPLICATION MATRIX");
		 MultMat mul = new MultMat(2,2);
		 c=mul.mulMatrices(a, b);
		 mat.display(a);
		 mat.display(a);
		 mat.display(c);
	 }
}
