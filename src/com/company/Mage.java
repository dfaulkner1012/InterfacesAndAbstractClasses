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

    }

    @Override
    public void shortRangeAttack() {

    }
}
