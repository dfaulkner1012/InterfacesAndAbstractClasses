package com.company;

public abstract class Character {
    private String characterName;
    public int numberOfWins = 0;
    public int numberOfLosses = 0;

    public Character(String characterName) {
        this.characterName = characterName;
    }

    public abstract boolean hasWon();

    public String getCharacterName() {
        return characterName;
    }
}
