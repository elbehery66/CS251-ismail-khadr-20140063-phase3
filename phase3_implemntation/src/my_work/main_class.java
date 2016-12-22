package my_work;

import java.io.IOException;
import java.util.Scanner;

public class main_class {

	public static void main(String[] args) throws IOException 
	{
		
	
		// TODO Auto-generated method stub
    
		System.out.println("-------------WELCOME-------------");
		while(true)
		{   Scanner s=new Scanner(System.in);
			System.out.println("1- log in ");
			System.out.println("2- sign up ");
			int x=s.nextInt();
			if(x==1)
			{
				System.out.println("your email ");	
				String mail=s.next();
				
				System.out.println("your password ");	
				String pass=s.next();
				Account ac=new Account();
				ac.Email=mail;
				ac.password=pass;
				
				
				accountcontlorel acc=new accountcontlorel();
				acc.loadAccount();
				 
				if(acc.matchAccount(ac))//
				{
					System.out.println("WELCOME "+ac.userName);
					if(ac.type.equals("student"))
					{
						StudenContoraller sc=new StudenContoraller();
						sc.runAccount();
					}
					else if(ac.type.equals("teacher")) {
						
						TeacherController te=new TeacherController();
						te.runAccount();     
					}
					
				}
				
				
				
				
				
			}
			else if(x==2)
			{
				Account ac=new Account();
				System.out.println("Enter the User Name :");
				ac.userName=s.next();
				System.out.println("Enter the Email :");
				ac.Email=s.next();
				System.out.println("Enter the Password :");
				ac.password=s.next();
				System.out.println("Enter the Your Gender  :");
				ac.gender=s.next();
				System.out.println("Enter the Your Birth Date  :");
				ac.birthDate=s.next();
				System.out.println("Enter the Your Account Type (student,teacher) :");
				ac.type=s.next();
				accountcontlorel acc=new accountcontlorel();
				acc.addAccount(ac);
				//acc.loadAccount();
				acc.saveAccount();
				
			}
			
			
			
		}
}
	
	}
