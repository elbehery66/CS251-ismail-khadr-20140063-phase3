package my_work;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudenContoraller {

    public StudentAccount student;
    public ArrayList<game> listOfgame = new ArrayList<game>();
    public int index;
    public int option;
    public game curgame;
    

    public StudenContoraller() {
        student = new StudentAccount();
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
        System.out.println("-------------------The listOfgame Options List-------------------------");
        System.out.println("*********************************************************");
        System.out.println("1-Play This game ");
        System.out.println("2-Rate This game ");
        System.out.println("3-Write Comment To This game ");
        System.out.println("4-You Want To Know How To Play This game ");
        System.out.println("5-log out ");

    }

    public void setcurgame() {
        System.out.println("you can choose any game by Enter The game Number ");
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter  game Number  :-");
        index = cin.nextInt();
        if ((index <= listOfgame.size() && index > 0)) {
            curgame = listOfgame.get(index - 1);
        } else {
            System.out.println("Enter Wrong game Number Try Again :-");
            setcurgame();
        }

    }

    public void setOption() {
    	while(true){
    		 showlistOfgame();
    	        setcurgame();
    	        showlistOfgameOptions();
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter your game Option Number  :-");
        option = cin.nextInt();
        if (option == 1) {
            student.playgame(curgame);
        } else if (option == 2) {
            //student.rategame(curgame);
        } else if (option == 3) {
        	String str=cin.nextLine();
        	System.out.println("your coment is saved");
            //student.writeComment(curgame);
        } else if (option == 4) {
            student.help(curgame);
            
        }
    	else if (option == 5) {
            break;
    	}
        
        else {
            System.out.println(" you Enter Wrong game Option Number Try Again :-");
            setOption();

        }
    	}

    }

    public void runAccount() throws FileNotFoundException {
    	loadGame();
       
        setOption();
       
    }
}
