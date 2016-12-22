package my_work;



public class Achevement {
      public String gameName;
      public int score;
       public Achevement() {
           gameName=" ";
           score=0;
    }

    public Achevement(String gameName, int score) {
        this.gameName = gameName;
        this.score = score;
    }

    public String getGameName() {
        return gameName;
    }

    public int getScore() {
        return score;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public void setScore(int score) {
        this.score = score;
    }
       
}
