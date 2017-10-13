package com.crmindz.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.crmindz.model.User;
import com.crmindz.service.RegisterService;

/**
 * Acts as controller and contains all the handlers related to registration functionality.
 * 
 * @author Sravan Ganta
 */

@Controller
public class RegisterController {
	
	@Autowired
	RegisterService registerService;
	
	/**
	 * Returns the registration view.
	 * 
	 * @return	returns model object with user object as model attribute,
	 * 			list of states and user types for the registration page.
	 */
	@RequestMapping(value="/register", method = RequestMethod.GET)
	public ModelAndView showRegister(){
		
		ModelAndView modelAndView = new ModelAndView("registration");
		
		List<Map<String,String>> states = registerService.getStates();
		String statesHtmlStr = "";
		
		for(Map<String,String> state:states){
			statesHtmlStr +="<option value='"+ state.get("code") +"'>"+ state.get("name") +"</option>";
	    }
		
		List<Map<String,Object>> userTypes = registerService.getUserTypes();
		String usertypesHtmlStr = "";
		
		for(Map<String,Object> usertype:userTypes){
			usertypesHtmlStr += "<option value='"+ usertype.get("usertype") +"'>"+ usertype.get("usertype") +"</option>";
		}
		
		modelAndView.addObject("user",new User());
		modelAndView.addObject("states", statesHtmlStr);
		modelAndView.addObject("usertypes", usertypesHtmlStr);
		
		return modelAndView;
	}
	
	
	/**
	 *Registers new user and returns home page upon successful registration.
	 * 
	 * @param user	User object with all the properties mapped with 
	 * 				respective parameters from the registration page.
	 * @return		returns model object with welcome view and an attribute
	 * 				with the first name of the user registered.
	 */
	@RequestMapping(value="/RegisterProcess", method = RequestMethod.POST)
	public ModelAndView registrationProcess(@ModelAttribute("user") User user){
		
		registerService.register(user);

	    return new ModelAndView("welcome", "firstname", user.getFirstName());
	}
	
	
	/**
	 * Validates the username, checks if it is already taken.
	 * and returns appropriate message.
	 * 
	 * @param userName	the username entered by the user.
	 * @return			appropriate message for the entered username.
	 */
	@ResponseBody
	@RequestMapping(value="/validateUsername", method = RequestMethod.POST)
	public String validateUserName(@RequestBody String userName){
		
		
		if(!registerService.validateUserName(userName)){
			return "User name is already taken, please choose another one";
		}
		
		return "unique";
	}
}
