package com.crimedb.myapp.controller;




import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.crimedb.myapp.DAO.AccusedDAO;
import com.crimedb.myapp.DAO.Crime_recordDAO;
import com.crimedb.myapp.DAO.GrievantDAO;
import com.crimedb.myapp.DAO.VictimDAO;
import com.crimedb.myapp.pojo.Accused;
import com.crimedb.myapp.pojo.Crime_record;
import com.crimedb.myapp.pojo.Grievant;
import com.crimedb.myapp.pojo.Victim;

@Controller
@RequestMapping(value="/admin/addRecord/*")
public class CreateRecordController {
@Autowired
Crime_recordDAO recorddao;
@Autowired
VictimDAO victimdao;
@Autowired
AccusedDAO accuseddao;
@Autowired
GrievantDAO grievantdao;

@RequestMapping(value="/CreateRecord.htm", method=RequestMethod.POST)
public ModelAndView addRecord(HttpServletRequest request) throws Exception {
	Crime_record cr = new Crime_record();
	Grievant g = new Grievant();
	Accused a = new Accused();
	Victim v = new Victim();
	String Crime = request.getParameter("Crime");
	String Location = request.getParameter("Location");
	String Officer = request.getParameter("Officer");
	Date Date = new SimpleDateFormat("mm-dd-yy").parse(request.getParameter("Date"));
	java.sql.Date sqlDate = new java.sql.Date(Date.getTime());
	String CStatus =  request.getParameter("status");
	cr.setCase_status(CStatus);
	cr.setCrime(Crime);
	cr.setDate_of_offence(sqlDate);
	cr.setLocation(Location);
	cr.setPolice_officer(Officer);
	recorddao.createRecord(cr);
	String vname = request.getParameter("vname");
	String vage = request.getParameter("vage");
	String vadd = request.getParameter("vadd");
	String vgender = request.getParameter("vgender");
	String vno = request.getParameter("vno");
	v.setAddress(vadd);
	v.setGender(vgender);
	v.setName(vname);
	v.setPhone_number(vno);
	v.setAge(vage);
	victimdao.createRecord(v);
	String gname = request.getParameter("gname");
	String gage = request.getParameter("gage");
	String gadd = request.getParameter("gadd");
	String ggender = request.getParameter("ggender");
	String gno = request.getParameter("gno");
	g.setAddress(gadd);
	g.setGender(ggender);
	g.setName(gname);
	g.setPhone_number(gno);
	g.setAge(gage);
	grievantdao.createRecord(g);
	String aname = request.getParameter("aname");
	String aage = request.getParameter("aage");
	String aadd = request.getParameter("aadd");
	String agender = request.getParameter("agender");
	String ano = request.getParameter("ano");
	a.setAddress(aadd);
	a.setGender(agender);
	a.setName(aname);
	a.setPhone_number(ano);
	a.setAge(aage);
	accuseddao.createRecord(a);
	
	
	ModelAndView mv=new ModelAndView("CreateRecord");
	return mv;
}

}
