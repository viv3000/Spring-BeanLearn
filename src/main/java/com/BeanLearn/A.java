package com.BeanLearn;

import com.BeanLearn.B;
import org.springframework.stereotype.Component;

@Component("ABean")
public class A implements B{
	
	@Override
	public String Gen(){
		return "Class B";
	}
}
