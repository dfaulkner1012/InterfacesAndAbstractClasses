package com.company;

public class Warrior extends Character implements FightingMoves{
    public Warrior(String characterName) {
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
