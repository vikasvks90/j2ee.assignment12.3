package assignment12.session3.controller;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import assignment12.session3.bean.Student;

@Controller
public class StudentAdmissionController {

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		//it will not show the mobile number
		binder.setDisallowedFields(new String[] {"studentMobile"});
		//will change the date format
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
		binder.registerCustomEditor(Date.class, "studentDOB", new CustomDateEditor(dateFormat, false));
		//it will bind to StudentName Class
		binder.registerCustomEditor(String.class, "studentName", new StudentNameEditor());
	}

	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() {

		ModelAndView model1 = new ModelAndView("AdmissionForm");
		
		return model1;
	}

	@ModelAttribute
    public void addingCommonObjects(Model model1) {
		
		model1.addAttribute("headerMessage", "Institute of Engineering and Technology, India");
	}

	@RequestMapping(value="/admissionSuccess", method = RequestMethod.GET)
	public ModelAndView submitAdmissionForm(@ModelAttribute("student1") Student student, BindingResult result) {
		
		 if (result.hasErrors()) {

				ModelAndView model1 = new ModelAndView("AdmissionForm");
				return model1;
		 }

		ModelAndView model1 = new ModelAndView("AdmissionSuccess");
		return model1;
	}
	
}

