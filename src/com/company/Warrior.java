package com.company;

public class Warrior extends Character implements FightingMoves{
    public Warrior(String characterName) {
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
        System.out.println(this.getCharacterName() + " throws an even larger paint brush for an high attack against Glitter Queen");
    }

    @Override
    public void lowAttack() {
        System.out.println(this.getCharacterName() + " evades the attack and counters with a paint brush throw");
    }

    @Override
    public void distanceAttack() {

    }

    @Override
    public void shortRangeAttack() {
        System.out.println(this.getCharacterName() + " evades the attack once again and escapes to higher ground");
    }
}
