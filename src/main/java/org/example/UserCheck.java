package org.example;

public class UserCheck {
    private final String name;
    private final int numberCheck;
    private String login;
    private char password;

    public UserCheck(String name, int numberCheck) {
        this.name = name;
        this.numberCheck = numberCheck;
    }


    public String getName() {
        return name;
    }

    public int getNumberCheck() {
        return numberCheck;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public char getPassword() {
        return password;
    }

    public void setPassword(char password) {
        this.password = password;
    }
}
