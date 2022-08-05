package com.example;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {

        if      (name.length() >= 3
                && name.length() <= 19
                && name.contains(" ")
                && !name.startsWith(" ")
                && !name.endsWith(" ")
        )
        {
            System.out.println("Entered valid name: " + name + ".");
            return true;
        }
        else {
            System.out.println("Entered invalid name: " + name + ". Please enter a valid name.");
            return false;
        }

    }
}
