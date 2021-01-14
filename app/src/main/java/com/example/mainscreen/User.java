package com.example.mainscreen;

public class User {
    private String name;
    private String cisternSize;

    User(String name, String cisternSize){
        this.name = name;
        this.cisternSize = cisternSize;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", cisternSize='" + cisternSize + '\'' +
                '}';
    }
}
