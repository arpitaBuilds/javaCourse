package q10782;
public class CalculateDifference {
	public static void main(String[] args) {
		// In the below two lines write code to convert
		// the string value passed in args[0] and args[1] into int values using Float.parseFloat method
		// convert the value in args[0] to int and store in firstValue
		// convert the value in args[1] to int and store in secondValue
		float firstValue = Float.parseFloat(args[0]);
		float secondValue = Float.parseFloat(args[1]);
		System.out.println("The difference of args[0] and args[1] is : " + (firstValue - secondValue));
	}
}
