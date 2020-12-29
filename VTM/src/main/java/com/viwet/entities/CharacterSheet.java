package com.viwet.entities;


import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

public class CharacterSheet {
    private int characterId;
    private String name;
    private int generation; // Поколение
    private int experience; // Опыт персонажа
    private Player player;
    private Abilities abilities;
    private Attributes attributes;
    private Set<Background> backgrounds;
    private MaskNature nature;
    private MaskNature mask;
    private Clan clan;
    private Virtues virtues;
    private Set<Discipline> disciplines;
    private Health health;
    private VariableAttributes variableAttributes;

    public int getCharacterId() {
        return characterId;
    }

    public void setCharacterId(int characterId) {
        this.characterId = characterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Abilities getAbilities() {
        return abilities;
    }

    public void setAbilities(Abilities abilities) {
        this.abilities = abilities;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public Set<Background> getBackgrounds() {
        return backgrounds;
    }

    public void setBackgrounds(Set<Background> backgrounds) {
        this.backgrounds = backgrounds;
    }

    public MaskNature getNature() {
        return nature;
    }

    public void setNature(MaskNature nature) {
        this.nature = nature;
    }

    public MaskNature getMask() {
        return mask;
    }

    public void setMask(MaskNature mask) {
        this.mask = mask;
    }

    public Clan getClan() {
        return clan;
    }

    public void setClan(Clan clan) {
        this.clan = clan;
    }

    public Virtues getVirtues() {
        return virtues;
    }

    public void setVirtues(Virtues virtues) {
        this.virtues = virtues;
    }

    public Set<Discipline> getDisciplines() {
        return disciplines;
    }

    public void setDisciplines(Set<Discipline> disciplines) {
        this.disciplines = disciplines;
    }

    public void setDiscipline(Discipline discipline) {
        if (disciplines == null) disciplines = new HashSet<>();
        disciplines.add(discipline);
    }

    public Health getHealth() {
        return health;
    }

    public void setHealth(Health health) {
        this.health = health;
    }

    public VariableAttributes getVariableAttributes() {
        return variableAttributes;
    }

    public void setVariableAttributes(VariableAttributes variableAttributes) {
        this.variableAttributes = variableAttributes;
    }

}
