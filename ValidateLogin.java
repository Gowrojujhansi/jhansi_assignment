package armstrong;
import java.io.*;

import java.util.*;

import java.lang.Math;

class ValidateLogin 

{
	
static void validation(String name,String pwd,int attempts)
	
{
		
String n="Mahesh",p="456";
		
int result;
		
if(attempts!=3)
		
{
			
if(name.equals(n) && pwd.equals(p))
			
{
				
System.out.println("Welcome " + name);
			
}
			
else
			
{
				
System.out.println("Invalid Login");
				
attempts=attempts+1;
				
enterDetails(attempts);
				
if(attempts==3)
				
{
					
System.out.println("Login limit exceeded....!!!");
				
}
			
}

		
}
	
}
	
static void enterDetails(int attempts)
	
{
		
Scanner sc=new Scanner(System.in);
		
String password,name;
		
System.out.println("Enter the username:");
		
name=sc.next();
		
System.out.println("Enter password:");
		
password=sc.next();
		
//System.out.println(name+"  "+password);
		
validation(name,password,attempts);
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int attempts=1;
		
		enterDetails(attempts);
			
		}
	}

