package com.viwet.entities;

import javax.persistence.*;

public class VariableAttributes {
    private int characterId;
    private int humanityPath;
    private int willpower;
    private int bloodpool;
    private CharacterSheet characterSheet;

    public int getCharacterId() {
        return characterId;
    }

    public void setCharacterId(int characterId) {
        this.characterId = characterId;
    }

    public int getHumanityPath() {
        return humanityPath;
    }

    public void setHumanityPath(int humanityPath) {
        this.humanityPath = humanityPath;
    }

    public int getWillpower() {
        return willpower;
    }

    public void setWillpower(int willpower) {
        this.willpower = willpower;
    }

    public int getBloodpool() {
        return bloodpool;
    }

    public void setBloodpool(int bloodpool) {
        this.bloodpool = bloodpool;
    }

    public CharacterSheet getCharacterSheet() {
        return characterSheet;
    }

    public void setCharacterSheet(CharacterSheet characterSheet) {
        this.characterSheet = characterSheet;
    }
}
