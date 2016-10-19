package org.ikshvaku.core;

class Student6{  
    int id;  
    String name;  
    Student6(int i,String n)
    {  
    id = i;  
    name = n;  
    }  
      
    Student6(Student6 s){  
    id = s.id;  
    name =s.name;  
    }  
    void display(){System.out.println(id+" "+name);}  
   
   
}
