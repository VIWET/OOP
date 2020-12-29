package com.viwet.entities;

import javax.persistence.*;


public class Attributes {
    private int characterID;
    //  Физические
    private int strength;
    private int dexterity;
    private int stamina;
    //  Социальные
    private int charisma;
    private int manipulation;
    private int appearance;
    //  Умственные
    private int perception;
    private int intelligence;
    private int wits;

    private CharacterSheet characterSheet;

    public Attributes() {}

    public Attributes(int strength, int dexterity, int stamina, int charisma, int manipulation, int appearance, int perception, int intelligence, int wits, CharacterSheet characterSheet) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.stamina = stamina;
        this.charisma = charisma;
        this.manipulation = manipulation;
        this.appearance = appearance;
        this.perception = perception;
        this.intelligence = intelligence;
        this.wits = wits;
        this.characterSheet = characterSheet;
    }

    public int getCharacterID() {
        return characterID;
    }

    public void setCharacterID(int characterID) {
        this.characterID = characterID;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int getManipulation() {
        return manipulation;
    }

    public void setManipulation(int manipulation) {
        this.manipulation = manipulation;
    }

    public int getAppearance() {
        return appearance;
    }

    public void setAppearance(int appearance) {
        this.appearance = appearance;
    }

    public int getPerception() {
        return perception;
    }

    public void setPerception(int perception) {
        this.perception = perception;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWits() {
        return wits;
    }

    public void setWits(int wits) {
        this.wits = wits;
    }

    public CharacterSheet getCharacterSheet() {
        return characterSheet;
    }

    public void setCharacterSheet(CharacterSheet characterSheet) {
        this.characterSheet = characterSheet;
    }
}
