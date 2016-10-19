package org.ikshvaku.core;

public class ThreadCl extends Thread {

	public void run(){
	
		
		for (int i=1;i<=10;i++)
		{
		System.out.println(i+" atrun");
		
		try
		{
	Thread.sleep(100);
	
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		
		}
		}
	}

		
	
	public static void main(String args[])
	
	{
		
		ThreadCl t= new ThreadCl();
		t.start();
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+" atmain");
		
			try
			{
			Thread.sleep(100);
			}
			catch(Exception ex)
			{
			System.out.println(ex.getMessage());
			
			}
		}
	}
		}
	
		
		
		
	
	

	


	

