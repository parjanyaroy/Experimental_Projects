package com.tutorialspoint.struts2;

import com.tutorialspoint.actions.CustomActions;

public class HelloWorldAction{
   private String name;

   public String execute() throws Exception {
	   System.out.println("Running execute ");
	   if(getName().equalsIgnoreCase("pj"))
		   return CustomActions.GOOD;
	   else
		   return CustomActions.BAD;
   }
   
   public String getName() {
	   System.out.println("Running getName "+name);
      return name;
   }

   public void setName(String name) {
	   System.out.println("Running setName "+name);
      this.name = name;
   }
}