package ru.sapteh.model;

import lombok.Getter;

@Getter
public class Sex {
    public static final Sex FEMALE = new Sex("FEMALE");
    public static final Sex MALE = new Sex("MALE");

    private final String gender;

    public Sex(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString(){
        return String.format("%s", getGender());
    }

}
