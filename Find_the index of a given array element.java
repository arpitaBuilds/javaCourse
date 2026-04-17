package q10941;

public class IndexFinder {
	/**
	 * Find the first index match of the element in the array
	 * 
	 * 
	 * @return index
	 */ 
	
	public int printIndex(int[] intArr, int element) {
		
		//Write your code here
		for(int i=0;i<intArr.length;i++){
			if(intArr[i]==element){
				return i;
			}
		}
		return -1;
	}
}
