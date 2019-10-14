package com.crimedb.myapp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.crimedb.myapp.DAO.UserDAO;
import com.crimedb.myapp.pojo.User;

@Controller
@RequestMapping(value="/user/*")
public class UserController {
@Autowired
UserDAO userdao;
@RequestMapping(value="/signIn.htm", method=RequestMethod.POST)
public ModelAndView addUser(HttpServletRequest request) {
	User u = new User();
	String username=request.getParameter("username");
	String password=request.getParameter("password");
	u.setPassword(password);
	u.setUsername(username);
	u.setStatus(0);
	userdao.addUser(u);
	ModelAndView mv=new ModelAndView("UserLogin");
	return mv;
}
@RequestMapping(value="/LoginUser.htm", method=RequestMethod.POST)
public ModelAndView loginUser(HttpServletRequest request) {
	String username=request.getParameter("username");
	String password=request.getParameter("password");
	System.out.println(username+" ...."+password);
	User u= userdao.loginUser(username, password);
	if(u.getStatus()==0||u==null) {
	return new ModelAndView("UserLogin");
	}
	HttpSession session=request.getSession();
	session.setAttribute("user", u);
	ModelAndView mv=new ModelAndView("SearchRecord");
	return mv;
}

}
