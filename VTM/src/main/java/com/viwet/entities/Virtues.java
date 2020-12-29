package com.viwet.entities;

import javax.persistence.*;

public class Virtues {
    private int characterID;
    private int conscienceConviction; //      Сознательность
    private int selfControlInstinct; //     Самоконтроль
    private int courage; //         Смелость
    CharacterSheet characterSheet;

    public int getCharacterID() {
        return characterID;
    }

    public void setCharacterID(int characterID) {
        this.characterID = characterID;
    }

    public int getConscienceConviction() {
        return conscienceConviction;
    }

    public void setConscienceConviction(int conscienceConviction) {
        this.conscienceConviction = conscienceConviction;
    }

    public int getSelfControlInstinct() {
        return selfControlInstinct;
    }

    public void setSelfControlInstinct(int selfControlInstinct) {
        this.selfControlInstinct = selfControlInstinct;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public CharacterSheet getCharacterSheet() {
        return characterSheet;
    }

    public void setCharacterSheet(CharacterSheet characterSheet) {
        this.characterSheet = characterSheet;
    }
}
