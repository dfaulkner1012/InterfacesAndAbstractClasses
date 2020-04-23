package com.company;

public class Elf extends Character implements FightingMoves{
    public Elf(String characterName) {
        super(characterName);
    }

    @Override
    public boolean hasWon() {
        if (hasWon()) {
            numberOfWins++;
        } else {
            numberOfLosses++;
        }
        return hasWon();
    }

    @Override
    public void highAttack() {
        System.out.println(this.getCharacterName() + " slashes arrow at opponent's face");
    }

    @Override
    public void lowAttack() {

    }

    @Override
    public void distanceAttack() {
        System.out.println(this.getCharacterName() + " shoots his arrows one last time to take out Bob Ross");
    }

    @Override
    public void shortRangeAttack() {

    }
}
