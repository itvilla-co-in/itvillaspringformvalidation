package itvilla;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/employee")
public class EmpController {

	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	
	@RequestMapping("/showForm")
	public String helloWorld(Model model){
		
		Employee e1 = new Employee();
		model.addAttribute("e1",e1);
		return "empform";
		
	}
	
	
	@RequestMapping("/")
	public String homepage(){
		return "index";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("e1") Employee tempemp,
			BindingResult theBindingResult) {
		
		// log the input data
		System.out.println("tempemp1: " + tempemp.getEmpid()
							+ " " + tempemp.getEmpname() + " " + tempemp.getEmpdept()+ " " );
		
		System.out.println("Lets display checkbox array " +  Arrays.toString(tempemp.getKlang()));
		System.out.println("dipsplaying our bindingresult" + theBindingResult );
		if (theBindingResult.hasErrors()) {
			return "empform";
		}
		else {
			return "empconfirm";
		}
		
		
	}
	
	
}
