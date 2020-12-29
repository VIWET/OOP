package com.viwet.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

public class Player {
    private int playerId;
    private String login;
    private String name;
    private int passwordHash;
    private Set<CharacterSheet> characterSheets = new HashSet<>();

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public int getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(int passwordHash) {
        this.passwordHash = passwordHash;
    }

    public int getPlayerID() {
        return playerId;
    }

    public void setPlayerID(int playerId) {
        this.playerId = playerId;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<CharacterSheet> getCharacterSheets() {
        return characterSheets;
    }

    public void setCharacterSheets(Set<CharacterSheet> characterSheets) {
        this.characterSheets = characterSheets;
    }
}
