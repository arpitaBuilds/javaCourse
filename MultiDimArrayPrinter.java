package q10947;
import java.util.*;
public class MultiDimArrayPrinter {
	public static void main(String[] args) {
		int[][] int2DArr = {
							{1},
							{2, 3},
							{4, 5, 6},
							{7, 8, 9, 10}
						};
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
for (int i=0;i<n;i++){
	for (int j=0;j<int2DArr[i].length;j++){
		System.out.print(int2DArr[i][j]+ " ");
	}
	System.out.println();
}
	}
}
	//Write your code here....