package com.Guo.JSON;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.json.simple.JSONArray;
import java.io.File;
import java.io.IOException;

public class JavaObjectToJsonExample {
                                                           
	public static void main(String[] args) {
	    
	     // 1. Define your own class' method runConversion() that will implement the conversion
	    JavaObjectToJsonExample obj = new JavaObjectToJsonExample();
		obj.runConversion();                                         
	}

	     // 2. Define the function of method runConversion()
	private void runConversion() {
	
	     //3. New a mapper of Jackson
		ObjectMapper mapper = new ObjectMapper();  
        
         //4. New a Java Object of Employee 
		Employee employee = new Employee();  
		
		employee.setName("LGuo");
		employee.setAge(35);
		employee.setAddress("10 Canadian Road");
		employee.setPosition("QA");
		
		JSONArray skills = new JSONArray();
		skills.add("Java");
		skills.add("Selenium");
		skills.add("Unix/Linux");
		skills.add("SQL");

		employee.setSkills(skills);
		

	     //5. Convert the object (employee) to JSON
		try {
			mapper.writeValue(new File("C:\\Employee\\employee.json"), employee);

			String employeeInJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee);
			System.out.println(employeeInJson);

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public class Employee {  
		private String name;
		private int age;
		private String address;
		private String position;
		private JSONArray skills;		
		
		public String getName(){
			return name;
		}
        
		public void setName(String name){
			this.name = name;
		}
		
		public int getAge(){
			return age;
		}

		public void setAge(int age){
			this.age = age;
		}

		public String getAddress(){
			return address;
		}
		
		public void setAddress(String address){
			this.address = address;
		}
		
		public String getPosition(){
			return position;
		}
		
		public void setPosition(String position){
			this.position = position;
		}
				
		public JSONArray getSkills(){
			return skills;
		}
		
        public void setSkills(JSONArray skills){
        	this.skills = skills;
        }
	}

}