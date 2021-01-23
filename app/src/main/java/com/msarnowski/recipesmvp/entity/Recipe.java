package com.msarnowski.recipesmvp.domain;

public class Recipe { // Entity
    private String name;
    private String description;
    private Boolean isWithMeat;

    public Recipe(String name, String description, Boolean isWithMeat) {
        this.name = name;
        this.description = description;
        this.isWithMeat = isWithMeat;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getIsWithMeat() {
        return isWithMeat;
    }
}
