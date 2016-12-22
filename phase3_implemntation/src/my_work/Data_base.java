package my_work;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Data_base {
	public ArrayList<game>list_game=new ArrayList<game>();
	
	public void saveGame ( String filename) throws IOException
	{
		
		  File f=new File(filename);
          f.createNewFile();
          
          FileWriter out= new FileWriter(f);
          for(int i=0;i<list_game.size();i++)
          {
        	  out.write(list_game.get(i).gameName + "\n");
        	  out.write(list_game.get(i).gameType + "\n");
        	  out.write(list_game.get(i).score + "\n");
        	  out.write(list_game.get(i).question.size()+"\n");
        	  
        	  for(int j=0;j<list_game.get(i).question.size();j++)
        	  {
        		 
        		  out.write(list_game.get(i).question.get(j).question+"\n");
        		  out.write(list_game.get(i).question.get(j).answer+"\n");
        		 // System.out.println(list_game.get(i).question.get(j).answer);
        	  }
        	
        	  
          }
         
          out.flush();
          out.close();
      
	}
	
	public ArrayList<game> load_game (String filename  ) throws FileNotFoundException
	{
		list_game.clear();
		int length ;
		Scanner s=new Scanner(new File(filename));
		while (s.hasNext())
		{
          game gam = new game();
          Question Ques ;
          
          gam.gameName=s.next();
          gam.gameType=s.next();
          gam.score =s.nextInt();
          length =s.nextInt();
          for (int i=0;i<length;i++)
          {   Ques =new Question();
        	  Ques.question=s.next();
        	  Ques.answer = s.next();
        	  gam.question.add(Ques);
          }
          list_game.add(gam);
          
          
			
		}
		return list_game;
		
		
	}
	public void add_game(game s)
	{
		list_game.add(s);
		
		
		
	}
	public void printAllGame ( ) 
	{
		
          
       
          for(int i=0;i<list_game.size();i++)
          {
        	  System.out.print(list_game.get(i).gameName + "\n");
        	  System.out.print(list_game.get(i).gameType + "\n");
        	  System.out.print(list_game.get(i).score + "\n");
        	  System.out.print(list_game.get(i).question.size()+"\n");
        	  
        	  for(int j=0;j<list_game.get(i).question.size();j++)
        	  {
        		 
        		  System.out.print(list_game.get(i).question.get(j).question+"\n");
        		  System.out.print(list_game.get(i).question.get(j).answer+"\n");
        		  
        	  }
        	
        	  
          }
         
         
      
	}
	
	
	
	

}
