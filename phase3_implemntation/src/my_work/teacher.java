package my_work;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale.Category;
import java.util.Scanner;

public class teacher {
	public game g;
	public Data_base DB= new Data_base();
	public Account ac1;
	//controller s=new controller();
	//public String category;
	public teacher() {
		g=new game("","",0);
		
	}
	
//	
//	Scanner sc=new Scanner (System.in);
//	int x;
//	int  y;
//	char c;
//	public void add_question()
//	{  
//		//if(gategory=="calculation")
//		//{};
//		for(int i=0;i<10;i++)
////		{   
//			System.out.println("level "+i);
//			 
//			for(int j=0;j<5;j++){
//				x=sc.nextInt();
//			 c=sc.next().charAt(0);
//			 y=sc.nextInt();
//			 char s=c;
//			
//			if(c=='+')
//			{
//				System.out.println(x+ " + " +y +" = "+".......");
//			}
//			else if(c=='*')
//			{
//				System.out.println(x+ " * " +y +" = "+".......");
//			}
//			if(c=='/')
//			{
//				System.out.println(x+ " / " +y +" = "+".......");
//			}
//			
//		}
//			
//		}
//		
//		
//		
//		
//	}
	
	public void create_Game() throws IOException{
		g=new game();
		Scanner s=new Scanner(System.in);
		
		
		System.out.println("enter Game name : ");
		g.gameName=s.next();
		
		
		
		System.out.println("enter Game Gatogory : ");
		g.gameType=s.next();
		
		System.out.println("enter number of Question : ");
		int x=s.nextInt();
		
		for (int i=0;i<x;i++)
		{
		Question q=new Question();
		System.out.print("Enter Question "+ (i+1) );
		q.question=s.next();
		
		System.out.println("Enter answr of Question "+ (i+1) );
		q.answer=s.next();
		g.question.add(q);
		
			
		}
		DB.load_game("database.txt");
		DB.add_game(g);
		DB.saveGame("database.txt");
		System.out.println("game saved to data base " );
		
	}
	public void tryGame() {
		System.out.println("now u want try your game ");
		g.playGame();
		
	}
public void remove_game( String G_name ) throws IOException{
	
	DB.load_game("database.txt");
	for(int i=0;i<DB.list_game.size();i++)
	{
		if(DB.list_game.get(i).gameName.equals(G_name))
		{
			DB.list_game.remove(i);
			DB.saveGame("database.txt");
			System.out.println("removed sucDBesful");
			try {
				DB.saveGame("database.txt");
				return;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	}///////////////////////////////////////////////////////////
public void edit(String G_name) throws IOException
{//
	Scanner s=new Scanner (System.in);
	System.out.println("enter new game name");
    String s_name=s.next();
	DB.load_game("database.txt");
	for(int i=0;i<DB.list_game.size();i++)
	{
		if(DB.list_game.get(i).gameName.equals(G_name))
		{    DB.list_game.get(i).gameName=s_name;
			
			
			DB.saveGame("database.txt");
			System.out.println("edit successfully");
			
			try {
				DB.saveGame("database.txt");
				return;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	
}
}
