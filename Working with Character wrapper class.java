package q35961;
public class CharacterDemo {
	public static void main(String[] args) {
		char ch1 = 'A';
		char ch2 = '7';
		char ch3 = '*';
		// Checking if ch1 is a character
		System.out.println("ch1 is a letter: " + Character.isLetter(ch1));
		// now its your turn
		// Check if ch2 is a character
		System.out.println("ch2 is a letter: "+ Character.isLetter(ch2));
		System.out.println("ch2 is a digit: "+Character.isDigit(ch2));
		// Check if ch2 is a digit
		
		// Checking if ch1 is a letter or digit
		System.out.println("ch1 is a letter or digit: "+Character.isLetterOrDigit(ch2));
		
		// Checking if ch3 is a letter or digit
		System.out.println("ch3 is a letter or digit: "+Character.isLetterOrDigit(ch3));
		
	}
}