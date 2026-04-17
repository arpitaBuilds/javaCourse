public class MultiplicationOfMatrix{
	public int[][] multiplication(int[][] matrix1, int[][] matrix2) {
		/*Return the result if the matrix1 coloumn size is equal to matrix2 row size and print the result.
		* @Return null.
		*/
		// Write your logic here for matrix multiplication
		if(matrix1==null || matrix2==null){
			return null;
		}
		int rows1 = matrix1.length;
		int cols1 = matrix1[0].length;
		int rows2 = matrix2.length;
		int cols2 = matrix2[0].length;

		if (cols1!=rows2){
			return null;
			
		}
		int[][] result = new int [rows1][cols2];
		for(int i=0;i<rows1;i++){
			for(int j=0;j<cols2;j++){
				for(int k=0;k<cols1;k++){
					result[i][j]+= matrix1[i][k]*matrix2[k][j];
				}
			}
		}
		return result;
	}
}
