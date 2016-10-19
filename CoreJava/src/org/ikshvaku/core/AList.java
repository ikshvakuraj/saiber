package org.ikshvaku.core;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class AList {
	
	Iterator it;
	ArrayList a;
	Vector v;
	LinkedList l;
	LinkedHashSet lS;
	TreeSet tr;
	Hashtable h;
	HashMap map;
	TreeMap tmap;
	
	
	public void CreateList()
	
	{
	
		a = new ArrayList();
		a.add(new Integer(10));
		a.add(new Integer(20));
		a.add(new Integer(30));
		a.add(new Integer(40));
		a.add(new Integer(40));
		a.add(new String("java"));
		
		v = new Vector();
		v.add(new Integer(10));
		v.add(new Integer(20));
		v.add(new Integer(30));
		v.add(new Integer(40));
		v.add(new Integer(40));
		v.add(new String("java"));
		
		l = new LinkedList();
		l.add(new Integer(10));
		l.add(new Integer(20));
		l.add(new Integer(30));
		l.add(new Integer(40));
		l.add(new Integer(40));
		l.add(new String("java"));
		
		lS = new LinkedHashSet();
		lS.add(new Integer(10));
		lS.add(new Integer(20));
		lS.add(new Integer(30));
		lS.add(new Integer(40));
		lS.add(new Integer(40));
		lS.add(new String("java"));

		tr = new TreeSet();
		tr.add(new Integer(10));
		tr.add(new Integer(20));
		tr.add(new Integer(30));
		tr.add(new Integer(40));
		tr.add(new Integer(40));
		tr.add(new Integer(40));
		

		
		
		
		h = new Hashtable();
		h.put("1006","Rak");
		h.put("1007","Rav");
		h.put("1008","Raj");
		h.put("1009","Ran");
		h.put("1003","mak");
		
	
	    map= new HashMap();
		map.put("1006","Rak");
		map.put("1007","Rav");
		map.put("1008","Raj");
		map.put("1009","Ran");
		map.put("1003","mak");
		map.put("1003","mad");
		
		 tmap= new TreeMap();
			tmap.put("1006","Rak");
			tmap.put("1007","Rav");
			tmap.put("1008","Raj");
			tmap.put("1009","Ran");
			tmap.put("1003","mak");
			tmap.put("1003","mad");	
	}
	
	public void show()
	{
	

		it = a.iterator();	
		while (it.hasNext())
			{
		
			System.out.println(it.next());
		}
		
		
		it = v.iterator();	
		while (it.hasNext())
			{
		
			System.out.println(it.next());
		}
		
		
		
		it = l.iterator();	
		while (it.hasNext())
			{
		
			System.out.println(it.next());
		}
	
		
		it = tr.iterator();	
		while (it.hasNext())
			{
		
			System.out.println(it.next());
		}
		
		
		Set s = h.keySet(); 	
		
		it = s.iterator();
		while (it.hasNext())
			{
			
		String key	= (String)it.next();
		
		
			System.out.println("Key "+key);
			System.out.println("Value "+h.get(key));
			
			
		}
	
	Collection c =map.values();
	it = c.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	
Set a = map.keySet(); 	
		
		it = a.iterator();
		while (it.hasNext())
			{
			
		String key	= (String)it.next();
		
		
			System.out.println("Key "+key);
			System.out.println("Value "+map.get(key));
			
			
		}
	
		
		
		Set t = tmap.keySet();
		
		it = t.iterator();
		while(it.hasNext())
		{
		String key = (String)it.next();
		System.out.println(key);
		}
		}



	public static void main(String[] args)
	{
		AList al = new AList();
		
		al.CreateList();
		al.show();
	}
	
}


