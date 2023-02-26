package hk.ust.cse.comp3021.lab3;

import java.util.*; 
public class StringUtils {

    /**
     * Obtains the character in a string at the given position.
     *
     * @param input The input string.
     * @param idx The index of the string.
     * @return The character at the given position of the string.
     */
    static char getCharAt(final String input, final int idx) {
    	// TODO implement this function
    	return input.charAt(idx);
    }

    /**
     * Checks whether the length of a string is less than the given maximum length.
     *
     * @param input The input string.
     * @param len The maximum length of the string (inclusive).
     * @return {@code true} if the string has fewer or equal number of characters than {@code len}.
     */
    static boolean lengthLessThanEqual(final String input, final int len) {
    	// TODO implement this function
    	if (input.length() <= len) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    /**
     * Splits the input string by the given delimiter character.
     *
     * <p>
     * For example, given a string {@code "a,b,ca,dd,12345"} and delimiter {@code ','}, the returned list should contain
     * the following elements:
     * </p>
     * <ul>
     *     <li>{@code a}</li>
     *     <li>{@code b}</li>
     *     <li>{@code ca}</li>
     *     <li>{@code dd}</li>
     *     <li>{@code 12345}</li>
     * </ul>
     * <p>
     * You should keep empty string in the list. For example, splitting {@code "a,,b"} by {@code ','} should contain
     * three elements, {@code "a"}, {@code ""}, and {@code "b}.
     * </p>
     *
     * @param input The input string to split.
     * @param delimiter The delimiter to split by.
     * @return A {@link List} of {@link String} containing the split elements.
     */
    static List<String> splitByCharacter(final String input, final char delimiter) {
    	// TODO implement this function
    	String[] split = input.split(Character.toString(delimiter),-2);
    	List<String> list = Arrays.asList(split);   
    	return list;
    }

    /**
     * Checks whether the given input string contains any whitespace character.
     *
     * <p>
     * Hint: {@link Character#isWhitespace(char)}.
     * </p>
     *
     * @param input The input string to check.
     * @return {@code true} if any character in the string is a whitespace.
     */
    static boolean containsWhitespace(final String input) {
    	// TODO implement this function	
    	for (int i = 0; i < input.length(); i++) {
    		if (Character.isWhitespace(input.charAt(i)) == true) {
    			return true;
    		}
    		else {
    			continue;
    		}
    	}
    	return false;
    }

    /**
     * Checks whether the given input string starts with an alphabet character.
     *
     * <p>
     * Hint: {@link Character#isAlphabetic(int)}.
     * </p>
     *
     * @param input The input string to check.
     * @return {@code true} if the input string starts with an alphabet character.
     */
    static boolean startWithAlphabet(final String input) {
    	// TODO implement this function	
    	return Character.isAlphabetic(input.charAt(0));
    }

    /**
     * Checks whether all characters in the given string are "valid characters".
     *
     * <p>
     * Valid characters are any of the following characters:
     * </p>
     * <ul>
     *     <li>Alphabetic characters, if {@code alphabetsValid} is {@code true}</li>
     *     <li>Digit characters, if {@code digitsValid} is {@code true}</li>
     *     <li>Any character within the {@code validChars} string</li>
     * </ul>
     * <p>
     * For example, to check whether a string only contains question marks ({@code ?}) and exclamation points
     * ({@code !}), this method should be invoked as such:
     * {@code StringUtils.allCharactersValid(input, false, false, "?!")}.
     * </p>
     *
     * @param input The input string to check.
     * @param alphabetsValid Whether all alphabet characters are considered to be valid characters.
     * @param digitsValid Whether all digit characters are considered to be valid characters.
     * @param validChars A string of characters which can also be considered to be valid characters.
     * @return Whether all characters in the input string are valid.
     */
    static boolean allCharactersValid(final String input, final boolean alphabetsValid, final boolean digitsValid, final String validChars) {
    	// TODO implement this function
    	boolean alphabet = true;
    	boolean digit = true;
    	boolean otherchar = false;
    	for (int i = 0; i < input.length(); i++) {
    		alphabet = Character.isAlphabetic(input.charAt(i)) && alphabetsValid;
    		digit = Character.isDigit(input.charAt(i)) && digitsValid;
    		for (int j = 0; j < validChars.length();j++) {
    			int contain = Character.compare(input.charAt(i), validChars.charAt(j));
    			if (contain == 0) {
    				otherchar = true;
    				break;
    			}
    		}
    		if(alphabet || digit || otherchar) {
    			continue;
    		}
    		else {
    			return false;
    		}
    	}
    	return true;
    }
   
}
