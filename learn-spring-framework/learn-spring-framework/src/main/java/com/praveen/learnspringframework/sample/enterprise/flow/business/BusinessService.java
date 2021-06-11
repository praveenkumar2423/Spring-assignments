package com.praveen.learnspringframework.sample.enterprise.flow.business;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.praveen.learnspringframework.sample.enterprise.flow.data.DataService;


//Business Logic
@Component
  public class BusinessService{
	
	@Autowired
	private DataService dataService;
	
	 public long Calculatesum() {
		  List<Integer> data = dataService.retrieveData();
		  return data.stream().reduce(Integer::sum).get();
	 }
 }