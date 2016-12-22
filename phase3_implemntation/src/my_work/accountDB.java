
package my_work;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class accountDB {
      public  ArrayList <Account> accounts = new ArrayList<Account>();
      public  void addAccount(Account acc){
         accounts.add(acc);
      }
      public boolean matchAccount(Account acc){
          Account temp=new Account();
           for(int i=0;i<accounts.size();i++){
               temp=accounts.get(i);
               if(acc.Email.equals(temp.Email)){
                  if(acc.password.equals(temp.password)){
                	  acc.userName=temp.userName;
                	  acc.type=temp.type;
                      return true;
                  }
                  else{
                      System.out.println(" the password is not correct ");
                      return  false;
                  }
               }
               
           }
           System.out.println("invalid Email");
           return false;
      }
      public Account getAccount(String email){
            Account temp=new Account();
           for(int i=0;i<accounts.size();i++){
               temp=accounts.get(i);
               if(email.equals(temp.Email)){
                  return temp;
               }
               
           }
           System.out.println("the user has no account");
           return (null);
      }
      public void saveAccount(String file_name) throws IOException
      {
       
      	File f=new File(file_name);
      	f.createNewFile();
      	FileWriter out=new FileWriter(f);
      	
      	for (int i=0;i<accounts.size();i++)
      	{

      		out.write(accounts.get(i).userName + "\n");
      		out.write(accounts.get(i).birthDate + "\n");
      		out.write(accounts.get(i).gender + "\n");
      		out.write(accounts.get(i).Email + "\n");
      		out.write(accounts.get(i).password + "\n");
      		out.write(accounts.get(i).type + "\n");
      	}

      	
      	  out.flush();
          out.close();
      	
      
      }
      

 public void loadAccount(String file_name) throws IOException 
    {
      
    	 accounts.clear();
    	   Scanner s = new Scanner(new File(file_name));
	    	
	    	while (s.hasNext())
	    	{
	    	
	    		Account Obj = new Account();
	    		
	    		Obj.userName = s.next();
	    		Obj.birthDate= s.next();
	    		Obj.gender= s.next();
	    		Obj.Email = s.next();
	    		Obj.password= s.next();
	    		Obj.type = s.next();
	    		
	    		accounts.add(Obj);
	    		
	    	}
    
    }
      
}
