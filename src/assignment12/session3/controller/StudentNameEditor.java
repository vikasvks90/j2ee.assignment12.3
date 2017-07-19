package assignment12.session3.controller;

import java.beans.PropertyEditorSupport;

public class StudentNameEditor extends PropertyEditorSupport {
	// After submitting the form Spring MVC will run setAsText function
	// Before performing data binding task for studentName property of student object
	
	@Override
	public void setAsText(String studentName)throws IllegalArgumentException {
		//if Student Name contains Mr. or Ms. then set it as it is		
		if(studentName.contains("Mr.") || studentName.contains("Ms.")) {
			setValue(studentName);
		//if Student Name does not contain Mr. or Ms. then append Mr. by default
		}else {
			studentName = "Mr."+studentName;
			setValue(studentName);  
		}
	}

}