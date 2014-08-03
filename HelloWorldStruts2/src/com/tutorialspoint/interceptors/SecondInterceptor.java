package com.tutorialspoint.interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class SecondInterceptor extends AbstractInterceptor {

	   public String intercept(ActionInvocation invocation)throws Exception{

	      /* let us do some pre-processing */
	      String output = "Pre-Processing second interceptor"; 
	      System.out.println(output);

	      /* let us call action or next interceptor */
	      String result = invocation.invoke();

	      /* let us do some post-processing */
	      output = "Post-Processing second interceptor"; 
	      System.out.println(output);

	      return result;
	   }
	}