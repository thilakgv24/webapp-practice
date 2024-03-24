package in.thilak.springboot.myfirstwebapp.contoller.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String userName, String password) {
		
		return userName.equalsIgnoreCase("sachin") 
				&& password.equalsIgnoreCase("dummy");
		
	}

}
