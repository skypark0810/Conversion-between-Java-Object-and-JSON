
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;
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
		Employee employee = createEmployeeObject();                 

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

	private Employee createEmployeeObject() {  
		Employee employee = new Employee();

		employee.setName("Mike");
		employee.setAge(30);
		employee.setAdress("10 Canadian Road");
		employee.setPosition("QA");
		
		List<String> skills = new ArrayList<>();
		skills.add("Java");
		skills.add("Selenium");
		skills.add("Unix/Linux");
		skills.add("SQL");

		employee.setSkills(skills);

		return employee;

	}

}
