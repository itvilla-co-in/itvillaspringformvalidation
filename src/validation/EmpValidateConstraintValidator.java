package validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmpValidateConstraintValidator implements ConstraintValidator<EmpValidate, String>{

	
	private String empPrefix;
	
	@Override
	public void initialize(EmpValidate theEmpCode) {
		empPrefix = theEmpCode.value();
	}
	
	@Override
	public boolean isValid(String myinputvalue, ConstraintValidatorContext arg1) {
		
boolean result;
		
		if (myinputvalue != null) {
			result = myinputvalue.startsWith(empPrefix);
		}
		else {
			result = true;
		}
		
		return result;
	}

}
