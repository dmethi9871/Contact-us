package com.niet.signodes.Controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.niet.signodes.UserRepo.userRepo;
import com.niet.signodes.entity.UserDltscontact;




@Controller
public class userController {
	@Autowired
	private userRepo repo3;
	@GetMapping("/")
	public String index() {
		return "Contact";
	}
	@PostMapping("/register")
	public String createuser(@ModelAttribute UserDltscontact user) {
		System.out.print(user);
		repo3.save(user);
		
//		String first_name = request.getParameter("name");
//		String last_name = request.getParameter("email");
//		String username = request.getParameter("Contact");
//		String password = request.getParameter("Message");
	
		return "redirect:/";
		
	}
}
