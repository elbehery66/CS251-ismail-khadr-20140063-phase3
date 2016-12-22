package my_work;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.transform.Templates;

public  class game {
   public String gameName="";
    public String gameType="";
    public int score=0;
    public ArrayList<Question> question;
    
     public void help() {
 		
    	 
 		System.out.println("you must enter the true answer to increase your score if you enter the wrong answer you will lose point  ");
 		
 	}
     
 	
    
    
    public game(String name,String type,int score) {
    	this.gameName=name;
    	this.gameType=type;
    	this.score=score;
    	question=new ArrayList<Question>();
		
	}
    public game() {
    	this.gameName="";
    	this.gameType="";
    	this.score=0;
    	question=new ArrayList<Question>();
		
	}
    
    public void playGame() {
		Scanner s=new Scanner(System.in);
		String answer;
		
		
		System.out.println("Enter true or false");
		for (int i=0;i<question.size();i++)
		{   
			System.out.println(question.get(i).question);
			
			answer=s.next();
			
			if(question.get(i).answer.equals(answer))
			{
				score++;
				
				
			}
			else 
			{
				
				if(score==0)
					{
					continue;}
				else
					{
						System.out.println("you will lose one point");
						score --;
						
					}
			}
			
		}
		System.out.println("\n your score is : " +score+" from " +question.size() );
		
		
		
		
	}
    
    
    
	
}
