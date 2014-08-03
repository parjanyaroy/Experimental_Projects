package com.tutorialspoint.struts2;

public class ByeWorldAction{
   private String name;

   public String execute() throws Exception {
	   System.out.println("GoodBye ");
      return "success";
   }
   
   public String getName() {
	   System.out.println("Running getName "+name);
      return name;
   }

   public void setName(String name) {
	  System.out.println("Running setName in goodbye "+name);
      this.name = name;
   }
}