package com.crimedb.myapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.crimedb.myapp.DAO.AdminDAO;
import com.crimedb.myapp.DAO.UserDAO;
import com.crimedb.myapp.pojo.Admin;
import com.crimedb.myapp.pojo.User;



@Controller
@RequestMapping("/admin/*")
public class AdminController {
@Autowired
AdminDAO adminDao;
@Autowired
UserDAO userdao;
@RequestMapping(value = "/dashboard.htm", method=RequestMethod.POST)
protected ModelAndView loginAdmin( HttpServletRequest request) throws Exception {
	System.out.println("Change 2");
	String username=request.getParameter("username");
	String password=request.getParameter("password");
	System.out.println(username+" ...."+password);
	Admin a= adminDao.loginAdmin(username, password);
	if(a==null) {
	return new ModelAndView("AdminLogin");
	}
	HttpSession session=request.getSession();
	session.setAttribute("admin", a);
	ModelAndView mv=new ModelAndView("AdminHome");
	return mv;
}
@RequestMapping(value = "/ApproveUser.htm", method=RequestMethod.GET)
protected ModelAndView redirectUserPage(HttpServletRequest request) throws Exception {
	List<User> ulist= userdao.getUserList();
	ModelAndView mv=new ModelAndView("AdminAddUser");
	mv.addObject("ulist", ulist);
	return mv;
}
@RequestMapping(value = "/approve/request.htm", method=RequestMethod.POST)
protected ModelAndView addStudent(HttpServletRequest request) throws Exception {
	
	int id= Integer.parseInt(request.getParameter("id"));
	User u=userdao.getUser(id);
	u.setStatus(1);
	adminDao.grantUserAccess(u);;
	
	List<User> ulist= userdao.getUserList();
	ModelAndView mv=new ModelAndView("AdminAddUser");
	mv.addObject("ulist", ulist);
	return mv;
}
@RequestMapping(value = "/DeleteUser.htm", method=RequestMethod.GET)
protected ModelAndView redirectDeleteUserPage(HttpServletRequest request) throws Exception {
	List<User> udlist= userdao.getValidUserList();
	ModelAndView mv=new ModelAndView("DeleteUser");
	mv.addObject("ulist", udlist);
	return mv;
}
@RequestMapping(value="/delete/DeleteUSer.htm", method=RequestMethod.GET)
protected ModelAndView DeleteUserPage(HttpServletRequest request) throws Exception {
	int id= Integer.parseInt(request.getParameter("id"));
	User u=userdao.getUser(id);
	adminDao.DeleteUser(u);
	List<User> ulist= userdao.getValidUserList();
	ModelAndView mv=new ModelAndView("DeleteUser");
	mv.addObject("ulist", ulist);
	return mv;
}
}
