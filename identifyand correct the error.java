package q10780;
public class HolidaysCalculator {
	public static void main(String[] args) {
		int nationalHolidays = Byte.parseByte(args[0]);
		int companyHolidays = Byte.parseByte(args[1]);
		int totalHolidays = nationalHolidays + companyHolidays;
		System.out.println("totalHolidays = " + totalHolidays);
	}
}
