package com.company;

public class Mage extends Character implements FightingMoves{
    public Mage(String characterName) {
        super(characterName);
    }

    @Override
    public boolean hasWon() {
        return false;
    }

    @Override
    public void highAttack() {

    }

    @Override
    public void lowAttack() {

    }

    @Override
    public void distanceAttack() {
        System.out.println(this.getCharacterName() + " waves her wand in the air and performs a healing spell for the High Elf");
    }

    @Override
    public void shortRangeAttack() {

    }
}
