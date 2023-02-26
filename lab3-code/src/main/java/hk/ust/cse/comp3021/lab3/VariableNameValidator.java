package hk.ust.cse.comp3021.lab3;
/**
 * Validates variable names for Java.
 */
public class VariableNameValidator extends Validator {

    @Override
    public boolean validate(final String input) {
	// TODO implement this function
    	if(Character.isAlphabetic(input.charAt(0)) == false) {
    		return false;
    	}
    	return StringUtils.allCharactersValid(input,true,true,"_$");
    }
}