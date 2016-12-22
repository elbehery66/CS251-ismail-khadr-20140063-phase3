package my_work;

public class Account {

    public String userName;
    public String birthDate;
    public String gender;
    public String Email;
    public String password;
    public String type;

    public Account() {
        userName = " ";
        birthDate = " ";
        gender = " ";
        Email = " ";
        password = "";
    }

    public String getUserName() {
        return userName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return password;
    }

    public Account(String userName, String birthDate, String gender, String Email,String password) {
        this.userName = userName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.Email = Email;
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }
    

    public void setType(String type) {
        this.type = type;
    }
    

}
