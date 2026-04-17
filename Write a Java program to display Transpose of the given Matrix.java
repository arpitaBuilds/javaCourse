package q11105;
public class TransposeMatrix {
/**
	 * Computes the transpose of the given matrix. 
	 * 
	 * @return the resultant matrix
	 */
	
public int[][] transposeMatrix(int[][] matrix1) {
		int rows=matrix1.length;
		int cols= matrix1[0].length;
	int [][] transpose=new int [cols][rows];
	for (int i=0;i<rows;i++){
		for(int j=0;j<cols;j++){
				transpose[j][i]=matrix1[i][j];
			}
		}
	return transpose;
	}
}
