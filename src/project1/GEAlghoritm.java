package project1;

public class GEAlghoritm {
	
	private double[][] matrix;
	private int numOfRows , numOfCols ,currPivRow, currPivCol;
	
	public GEAlghoritm(double m[][]) {
		this.matrix = m;
		this.numOfRows = m.length;
		this.numOfCols = m[0].length;
		currPivRow = 0;
		currPivCol = 0;
	}
	
	public void start() {
//		this.swap(0, 1);
		double a = 1.0 / 3.0;
		this.mult(0, a);
	}
	
	// finds nonzero pivot
	private void findNonzeroPivot() {
		
			if(matrix[currPivRow][currPivCol] == 0) {
				
				for(int j = currPivRow ; j < numOfRows ; j++) {
					
					if(matrix[j][currPivCol] != 0) {
						swap(currPivRow , j);
						break;
					}
				}
			}
		
		
		
	}
	
	/* ERO
	1. swap rows
	2. replace rows
	3. multiply by scalar
	*/
	// swapping first row with second vice versa
	private void swap(int firstRow, int secondRow) {
		double[] temp = matrix[firstRow];
		matrix[firstRow] = matrix[secondRow];
		matrix[secondRow] = temp;
	}
	
	// firstRow = secondRow * scalar
	private void repl(int firstRow,int secondRow, double scalar) {
		double[] tempSecondRow = matrix[secondRow];
		
		// insert values from second row to temporary row multiplyed by scalar
		for(int i=0 ; i < matrix[secondRow].length ; i++) {
			tempSecondRow[i] = matrix[secondRow][i] * scalar;
		}
		
		// adding second row times scalar to first row
		for(int i=0 ; i < matrix[firstRow].length ; i++) {
			matrix[firstRow][i] += tempSecondRow[i];
		}
	}
	
	private void mult(int row , double scalar) {
		// multiplaying the row by scalar
		for(int i=0 ; i < matrix[row].length ; i++) {
			matrix[row][i] *= scalar; 
		}
	}
}
