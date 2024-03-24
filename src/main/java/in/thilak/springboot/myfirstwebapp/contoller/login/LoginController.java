package in.thilak.springboot.myfirstwebapp.contoller.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private AuthenticationService authenticationService;
	
	

	// ModelMap = if you want any values to be transfered to jsp
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {		
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String gotoWelcomePage(
			@RequestParam(name = "name") String name,
			@RequestParam(name = "password") String password, 
			ModelMap map) {				
		map.put("name", name);
		
		// add authnetication logic
		// name = sachin
		// password = dummy
		if(authenticationService.authenticate(name, password)) 	
			return "welcome";
		
		map.put("errorMesage ", "Invalid Credentials");
		return "login";
	}
}
