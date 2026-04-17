package q10810;
public class GuessHoliday {
	public static void main(String[] args) {
		//write code to convert the value pased in args[0] into a boolean
		boolean isHoliday = Boolean.parseBoolean(args[0]);
		if (isHoliday) {
			System.out.println("I am sleeping!");
		} else {
			System.out.println("I am working hard!");
		}
	}
}
