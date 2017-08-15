package com.Guo.JSON;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;


public class JsonToJavaObjectExample {
	
	public static void main(String[] args) {		
		JsonToJavaObjectExample obj = new JsonToJavaObjectExample();
		obj.runConversion();
	}
		
   private void runConversion(){
	    ObjectMapper mapper = new ObjectMapper();
	    
	   // Convert JSON string from file to Java Object
	    try{							
					Employee employee = mapper.readValue(new File("C:\\Employee\\employee.json"), Employee.class);
					System.out.println(employee);				
			}
		catch (Exception e) {
					e.printStackTrace();				
			}                
  }      
}