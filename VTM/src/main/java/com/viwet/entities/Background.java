package com.viwet.entities;


import java.util.Set;

public class Background {
    private int backgroundId;
    private String title;
    private String description;

    private Set<CharacterSheet> characterSheets;

    public int getBackgroundId() {
        return backgroundId;
    }

    public void setBackgroundId(int backgroundId) {
        this.backgroundId = backgroundId;
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
