package com.viwet.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


public class MaskNature {
    int maskNatureId;
    String title;
    String description;
    Set<CharacterSheet> characterSheetNature = new HashSet<>();
    Set<CharacterSheet> characterSheetMask = new HashSet<>();

    public int getMaskNatureId() {
        return maskNatureId;
    }

    public void setMaskNatureId(int maskNatureId) {
        this.maskNatureId = maskNatureId;
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

    public Set<CharacterSheet> getCharacterSheetNature() {
        return characterSheetNature;
    }

    public void setCharacterSheetNature(Set<CharacterSheet> characterSheetNature) {
        this.characterSheetNature = characterSheetNature;
    }

    public Set<CharacterSheet> getCharacterSheetMask() {
        return characterSheetMask;
    }

    public void setCharacterSheetMask(Set<CharacterSheet> characterSheetMask) {
        this.characterSheetMask = characterSheetMask;
    }
}
