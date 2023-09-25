package com.Mvc2.MvcDemo2.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.Mvc2.MvcDemo2.Model.User;

@Controller
public class userController {
	
	
	List<User> userList=new ArrayList<>();
	
	{
		userList.add(new User(101,"Rohan","rohan98@gmail.com",12326557));
		
				}
	@GetMapping("/")
	public String getMessage() {
		return "index";
	}
	
	@GetMapping("/displayUser")
	public String displayUser(Model model) {
		
		model.addAttribute("userInfo",userList);
		return "display";
	}
	
	@GetMapping("/addUser")
	public String addTempUser(Model model) {
		model.addAttribute("tempUser",new User());
		return "add";
	}

	@PostMapping("/addUserInfo")
	public String addUser(User u) {
		userList.add(u);
		return "redirect:/displayUser";
	}
	
	@GetMapping("/UpdateCurrentUser/{id}")
	public String  updateUser(Model model,@PathVariable int id) {
		  User temp=userList.get(id-1);
		  model.addAttribute("tempObject",temp);
		  return "update";
		}
	
	@GetMapping("/updateUser")
	public String update(User u) {
		userList.set(u.getUserId()-1, u);
		return "redirect:/displayUser";
		
	}
	
	@GetMapping("/deleteCurrentUser/{id}")
	public String delete(Model model,@PathVariable int id) {
		userList.remove(id-1);
		return "redirect:/displayUser";
	}
}
