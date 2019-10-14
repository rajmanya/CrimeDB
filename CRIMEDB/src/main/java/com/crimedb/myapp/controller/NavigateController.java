package com.crimedb.myapp.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;




@Controller
@RequestMapping("/")
public class NavigateController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
public String index(Locale locale, Model model) {
		
		return "index";
	}
	@RequestMapping(value = "/admin/loginPage.htm", method=RequestMethod.GET)
	protected ModelAndView adminlogin(HttpServletRequest request) throws Exception {
		return new ModelAndView("AdminLogin");
	}
	@RequestMapping(value = "/user/loginPage.htm", method=RequestMethod.GET)
	protected ModelAndView Userlogin(HttpServletRequest request) throws Exception {
		return new ModelAndView("UserLogin");
	}
	@RequestMapping(value = "/user/CreateUser.htm", method=RequestMethod.GET)
	protected ModelAndView adminCreateUser(HttpServletRequest request) throws Exception {
		return new ModelAndView("CreateUser");
	}
	@RequestMapping(value = "/admin/CreateRecord.htm", method=RequestMethod.GET)
	protected ModelAndView adminCreateRecord(HttpServletRequest request) throws Exception {
		return new ModelAndView("CreateRecord");
	}
}
