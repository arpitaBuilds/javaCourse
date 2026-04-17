package q35974;
public class CharacterDemo2 {
	public static void main(String[] args) {
		char ch1 = 'A';
		char ch2 = 'd';
		char ch3 = '-';
		// Checking  if ch1 is an uppercase character
        System.out.println("ch1 is an uppercase char: " + Character.isUpperCase(ch1));
		
        // now its your return 
        System.out.println("ch1 is a lowercase char: "+Character.isLowerCase(ch1));
        // Check if ch1 is a lowercase character
        System.out.println("ch2 is a lowercase char: "+Character.isLowerCase(ch2));
       // Check if ch2 is a lowercase character
       System.out.println("ch2 to uppercase: "+Character.toUpperCase(ch2));
       // Convert ch2 to uppercase
       System.out.println("ch1 to lowercase: "+Character.toLowerCase(ch1));
       // Convert ch1 to lowercase
       System.out.println("ch3 is a letter or digit: "+Character.isLetterOrDigit(ch3));
       // Check if ch3 is a letter or digit
       System.out.println("ch3 is a whitespace char: "+Character.isWhitespace(ch3));
       // Check if ch3 is a whitespace character
       
	}

}
