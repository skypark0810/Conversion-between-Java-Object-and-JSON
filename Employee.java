package com.Guo.JSON;

import java.util.List;


	public class Employee {  
		private String name;
		private int age;
		private String address;
		private String position;
		private List<String> skills;		
		
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
				
		public List<String> getSkills(){
			return skills;
		}
		
        public void setSkills(List<String> skills){
        	this.skills = skills;
        }
       
        @Override
        public String toString() {
            return "Employee [name=" + name + ", age=" + age + ", address=" + address
                    + ", positon=" + position + ", skills=" + skills + "]"; 
        }
	}
	


