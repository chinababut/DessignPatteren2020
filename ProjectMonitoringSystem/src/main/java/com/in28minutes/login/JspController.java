package com.in28minutes.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class JspController {
	
    @Autowired
	private LoginService loginService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage() {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String handleUserLogin(ModelMap model, @RequestParam String uName,
			@RequestParam String password) {
           System.out.println("login post method::"+uName+"..."+password);
		if (!loginService.validateUser(uName, password)) {
			model.put("errorMessage", "Invalid Credentials");
			return "login";
		}

		// model.put("uName", uName);
		return "home";
	}
	
	@RequestMapping(value = "/projectcreation", method = RequestMethod.GET)
	public String showNewProjectPage() {
		
		return "projectcreation";
	}
	@RequestMapping(value = "/modulecreation", method = RequestMethod.GET)
	public String showModuleCreationProjectPage() {
		
		return "modulecreation";
	}
	                          
	@RequestMapping(value = "/dashboard", method = RequestMethod.GET)
	public String dashboardPage() {
		
		return "dashboard";
	}
	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public String contactPage() {
		
		return "contact";
	}
}
