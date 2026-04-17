package q10944;

public class ArrayReverser {
	/**
	 * Compute the reverse order of the given array
	 * 
	 * 
	 * @return resultant array
	 */ 
	public int[] reverseArray(int[] arr) {
		//Write your code here
		int n=arr.length;
		int[] reversed=new int[n];
		for(int i=0;i<n;i++){
			reversed[i]=arr[n-i-1];
		}
		return reversed;
		
}
}
