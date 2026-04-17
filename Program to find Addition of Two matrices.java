package q11053;
public class AdditionOfMatrix {
	
	/**
	 * Computes the addition of the two given matrices if the sizes of the matrices are the same. 
	 * Otherwise, returns null.
	 * 
	 * @return the resultant matrix, null if addition is not possible 
	 */
	public int[][] add(int[][] matrix1, int[][] matrix2) {
		// Write the code
		if(matrix1.length!=matrix2.length){
			return null;
		}
		for(int i=0;i<matrix1.length;i++){
			if(matrix1[i].length!=matrix2[i].length){
				return null;
			}
		}
		int [][] result = new int[matrix1.length][matrix1[0].length];
		for(int i=0;i<matrix1.length;i++){
			for(int j=0;j<matrix1[i].length;j++){
				result[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
		return result;
	}
}