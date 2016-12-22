
package my_work;

import java.util.ArrayList;
import java.util.Scanner;


public class StudentAccount extends Account{
    public  ArrayList <Achevement> achevements = new ArrayList<Achevement>();
   
//    public void rategame(game g){
//        Scanner cin = new Scanner(System.in);
//        System.out.println("enter the rate of the game (from 1 to 5)");
//        int h=cin.nextInt();
//       // Rate r=new Rate();
//        r.RateVal=h;
//        r.StudenName=userName;
//        g.addRat(r);
//        
//    }

    public void playgame( game g){
        g.playGame();
        int y=g.score;
      Achevement a=new Achevement();
       a.gameName=g.gameName;
       a.score=y;
       
       achevements.add(a);
      
    }
    public void writeComment(game g){
         Scanner cin = new Scanner(System.in);
        System.out.println("enter the comment of the game ");
        String com=cin.nextLine();
        Comment c=new Comment();
        c.StudenComment=com;
        c.StudenName=userName;
       // g.addComment(c);
    }
    public void showAchevement(game g){
        Achevement a=new Achevement();
        boolean found=false;
       for(int i=0;i<achevements.size();i++){
              a=achevements.get(i);
              if(a.gameName.equals(g.gameName)){
                  found=true;
                  System.out.println("your Achevement in this game is "+a.score);
                  break;
              }
       }
       if(!found){
           System.out.println("you have not Achevement in this game ");
       }
    }
    public void help(game g){
        g.help();
    }

    public StudentAccount() {
        
    }
    
    
}
