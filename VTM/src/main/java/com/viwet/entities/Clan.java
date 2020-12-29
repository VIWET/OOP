package com.viwet.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


public class Clan {
    int clanId;
    String title;
    String description;
    Set<CharacterSheet> characterSheets = new HashSet<>();

    public int getClanId() {
        return clanId;
    }

    public void setClanId(int clanId) {
        this.clanId = clanId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<CharacterSheet> getCharacterSheets() {
        return characterSheets;
    }

    public void setCharacterSheets(Set<CharacterSheet> characterSheets) {
        this.characterSheets = characterSheets;
    }
}
