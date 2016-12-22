
package my_work;

import java.io.IOException;

public class accountcontlorel {
    public accountDB data;
    public accountcontlorel() {
        data=new accountDB();
    }
     public  void addAccount(Account acc){
         data.addAccount(acc);
      }
      public boolean matchAccount(Account acc){
         boolean tag;
         tag=data.matchAccount(acc);
         return tag;
      }
      public Account getAccount(String name){
            Account temp=new Account();
           temp=data.getAccount(name);
           return temp;
          
      }
      public void loadAccount() throws IOException
      {
      
        data.loadAccount("Account_DB.txt");
      
      
      }
      public void saveAccount() throws IOException
      {
         data.saveAccount("Account_DB.txt");
      
      }
}
