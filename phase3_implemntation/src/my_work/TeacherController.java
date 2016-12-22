package my_work;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TeacherController {
	
	public teacher teach;
    public ArrayList<game> listOfgame = new ArrayList<game>();
    public int index;
    public int option;
    public game curgame;
    

    public TeacherController() {
      teach  = new teacher();
      
        curgame = new game();
        index = -1;
    }

    public void showlistOfgame() {
        System.out.println("-------------------The listOfgameList-------------------------");
        System.out.println("*********************************************************");
        game g = new game();
        for (int i = 0; i < listOfgame.size(); i++) {
            g = listOfgame.get(i);
            System.out.println("The game Number " + (i + 1) + "is " + g.gameName);
        }
    }
 public void loadGame() throws FileNotFoundException
 {   
	 Data_base db=new Data_base();
	 
	 listOfgame=db.load_game("database.txt");
 }
    public void showlistOfgameOptions() {
        System.out.println("-------------------The listOf Options -------------------------");
        System.out.println("*********************************************************");
        System.out.println("1-creat  game ");
        System.out.println("2-Remove  game ");
        System.out.println("3-play ");
        System.out.println("4-Edite The Game Name");
        System.out.println("5-log out ");

    }

//    public void setcurgame() {
////        System.out.println("you can choose any game by Enter The game Number ");
//        Scanner cin = new Scanner(System.in);
//      
//        index = cin.nextInt();
//        if ((index <= listOfgame.size() && index > 0)) {
//            curgame = listOfgame.get(index - 1);
//        } else {
//            System.out.println("Enter Wrong game Number Try Again :-");
//            setcurgame();
//        }
//
//    }

    public void setOption() throws IOException {
    	while(true){
    		showlistOfgameOptions();
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter your game Option Number  :-");
        option = cin.nextInt();
        if (option == 1) {
            teach.create_Game();
        } else if (option == 2) 
        {
        	 System.out.println("Enter your game Name you want to remove  :-");
            String str=cin.next();
            teach.remove_game(str);
        }
            
        else if (option == 3) {
           teach.tryGame();
        } 
        else if (option == 4) {
        	System.out.println("Enter The Game Name that want to uppdate :");
        	String s=cin.next();
            teach.edit(s);
         } 
        else if (option == 5)
        {
        	break;
        }
        else {
            System.out.println(" you Enter Wrong game Option Number Try Again :-");
            setOption();

        }

    }
    	}

    public void runAccount() throws IOException {
    	//loadGame();
        //showlistOfgame();
        
       
        setOption();
    }

}
