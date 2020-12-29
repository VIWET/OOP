package com.viwet.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


public class Discipline {
    private int disciplineId;
    private String title;
    private String description;

    private Set<CharacterSheet> characterSheets;

    public int getDisciplineId() {
        return disciplineId;
    }

    public void setDisciplineId(int disciplineId) {
        this.disciplineId = disciplineId;
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
