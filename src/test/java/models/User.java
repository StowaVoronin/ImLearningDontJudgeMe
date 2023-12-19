package models;

public class User {
    private String login;
    private String password;
    private String name;
    public User(String login, String pwd){
        this.login = login;
        this.password = pwd;
    }
    public String getLogin(){
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }



}
