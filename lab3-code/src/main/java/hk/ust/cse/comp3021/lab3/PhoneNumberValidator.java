package hk.ust.cse.comp3021.lab3;

/**
 * Validates a phone number with E.164 format.
 */
public class PhoneNumberValidator extends Validator {

    @Override
    public boolean validate(final String input) {
	// TODO implement this function
    	int PhoneLength = input.length();
    	boolean withPrefix = false;
    	if (Character.compare(input.charAt(0),'+') == 0) {
    		withPrefix = true;
    		PhoneLength = input.length()-1;
    	}
    	else if (Character.isDigit(input.charAt(0))) {
    		PhoneLength = input.length();
    	}
    	else {
    		return false;
    	}
    	
    	if (PhoneLength > 15) {  //Phone length number check
    		return false;
    	}
    	
    	if (withPrefix == true) {//Valid phone with prefix
    		if (PhoneLength > 15) {  //Phone length number check
        		return false;
        	}
    		for(int i = 0; i < PhoneLength; i++) {
    			if (Character.isDigit(input.charAt(i+1)) == false) {
    				return false;
    			}
    		}
    	}
    	else {
    		if (PhoneLength > 12) {  //Phone length number check
        		return false;
        	}
    		for(int i = 0; i < PhoneLength; i++) {
    			if (Character.isDigit(input.charAt(i)) == false) {
    				return false;
    			}
    		}
    	}
    	return true;
    		
    		
  
    	
    }
}
