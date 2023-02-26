package hk.ust.cse.comp3021.lab3;

import java.util.List;

/**
 * <p>Referenced from <a href="https://en.wikipedia.org/wiki/Email_address">here</a>.</p>
 */
public class EmailValidator extends Validator {

    @Override
    public boolean validate(final String input) {
    // TODO implement this function
    	List<String> split = StringUtils.splitByCharacter(input, '@');
    	if (split.size() != 2) {
    		return false;
    	}
    	String localPart = split.get(0);
    	int localSize = localPart.length();
    	// dot checking
    	if(localPart.charAt(0) == '.' || localPart.charAt(localSize-1) == '.') {
    		return false;
    	}
    	List<String> dotsplit = StringUtils.splitByCharacter(localPart, '.');
    	for (String s:dotsplit) {
    		if(StringUtils.containsWhitespace(s) == true) {
    			return false;
    		}
    	}
    	return true;
    }
}
