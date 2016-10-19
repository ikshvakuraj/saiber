package org.ikshvaku.core;

/* There are many ways to copy the values of one object into another in java. They are:

By constructor
By assigning the values of one object into another
By clone() method of Object class
In this example, we are going to copy the values of one object into another using java constructor

* 1.JSps
2.core java: 
//contstructor overloading
//object creatiomn
//method with param
//method with no parameters
//return type 
//no return 
//capturing method return type into variables
//array list 
-list interface
//linked list
//vector
-set interface
//hashset
//treeset
-map interface
//treemap
-sorted set class
-concurrent sync

-threading
-servlets
-jsps
*/

public class CopyConstructor {

	 public static void main(String args[])
	 {  
		    Student6 s1 = new Student6(111,"Karan");  
		    Student6 s2 = new Student6(s1);  
		    
	        MyMethods m = new MyMethods();
	        
	        int val = m.total();//methods without param
	      System.out.println(val);
	      int val1 = m.total(10);// methods with param
	      System.out.println(val1);
	      
	      m.display();
	      s1.display();  
		  s2.display();
	 }
}