package org.ikshvaku.core;

public class Student5 {
	
	/*Constructor Overloading in Java:
	Constructor overloading is a technique in Java in which a class can have any number of constructors that differ in parameter lists.The 
	compiler differentiates these constructors by taking into account the number of parameters in the list and their type.*/
	
	    int id;  
	    String name;  
	    int age;  
	    Student5(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	    Student5(int i,String n,int a){  
	    id = i;  
	    name = n;  
	    age=a;  
	    }  
	    void display(){System.out.println(id+" "+name+" "+age);}  
	   
	    
	 

	public static void main(String[] args) {
		
		
		  
	    Student5 s1 = new Student5(111,"Karan");  
	    Student5 s2 = new Student5(222,"Aryan",25);  
	    s1.display();  
	    s2.display();  
	   
		
		// TODO Auto-generated method stub

	}

}
