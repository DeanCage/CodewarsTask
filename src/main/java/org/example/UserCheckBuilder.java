package org.example;

public class UserCheckBuilder {
    private String name;
    private int numberCheck;
    private String login;
    private char password;

    public UserCheckBuilder(java.lang.String name, int numberCheck, java.lang.String login, char password) {
        this.name = name;
        this.numberCheck = numberCheck;
        this.login = login;
        this.password = password;
    }

    public UserCheckBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public UserCheckBuilder setNumberCheck(int numberCheck) {
        this.numberCheck = numberCheck;
        return this;
    }

    public UserCheckBuilder setLogin(String login) {
        this.login = login;
        return this;
    }

    public UserCheckBuilder setPassword(char password) {
        this.password = password;
        return this;
    }


}