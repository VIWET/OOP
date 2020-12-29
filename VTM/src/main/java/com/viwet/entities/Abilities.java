package com.viwet.entities;



import javax.persistence.*;

public class Abilities {

    private int characterId;
    //  Таланты
    private int alertness; //       Бдительность/Внимательность
    private int athletic; //        Атлетика
    private int brawl; //           Рукопашный бой
    private int dodge; //           Уклонение
    private int empathy; //         Эмпатия
    private int expression; //      Экспрессия
    private int intimidation; //    Запугивание
    private int leadership; //      Лидерство
    private int streetwise; //      Знание улиц
    private int subterfuge; //      Хитрость
    //  Навыки
    private int animalKen; //       Знание животных
    private int crafts; //          Ремесла
    private int drive; //           Вождение
    private int etiquette; //       Этикет
    private int firearms; //        Огнестрельное оружие
    private int melee; //           Фехтование
    private int performance; //     Выступление
    private int larceny; //        Безопасность
    private int stealth; //         Скрытность
    private int survival; //        Выживание
    //  Познания
    private int academics; //       Академичсекие знания
    private int computer; //        Компьютеры
    private int finance; //         Финансы
    private int investigation; //   Расследование
    private int law; //             Закон
    private int linguistic; //      Лингвистика
    private int medicine; //        Медицина
    private int occult; //          Оккультизм
    private int politics; //        Политика
    private int science; //         Наука

    private CharacterSheet characterSheet;

    public Abilities() {

    }

    public Abilities(int alertness, int athletic, int brawl, int dodge, int empathy, int expression, int intimidation, int leadership, int streetwise, int subterfuge, int animalKen, int crafts, int drive, int etiquette, int firearms, int melee, int performance, int larceny, int stealth, int survival, int academics, int computer, int finance, int investigation, int law, int linguistic, int medicine, int occult, int politics, int science, CharacterSheet characterSheet) {
        this.alertness = alertness;
        this.athletic = athletic;
        this.brawl = brawl;
        this.dodge = dodge;
        this.empathy = empathy;
        this.expression = expression;
        this.intimidation = intimidation;
        this.leadership = leadership;
        this.streetwise = streetwise;
        this.subterfuge = subterfuge;
        this.animalKen = animalKen;
        this.crafts = crafts;
        this.drive = drive;
        this.etiquette = etiquette;
        this.firearms = firearms;
        this.melee = melee;
        this.performance = performance;
        this.larceny = larceny;
        this.stealth = stealth;
        this.survival = survival;
        this.academics = academics;
        this.computer = computer;
        this.finance = finance;
        this.investigation = investigation;
        this.law = law;
        this.linguistic = linguistic;
        this.medicine = medicine;
        this.occult = occult;
        this.politics = politics;
        this.science = science;
        this.characterSheet = characterSheet;
    }

    public int getCharacterId() {
        return characterId;
    }

    public void setCharacterId(int characterId) {
        this.characterId = characterId;
    }

    public int getAlertness() {
        return alertness;
    }

    public void setAlertness(int alertness) {
        this.alertness = alertness;
    }

    public int getAthletic() {
        return athletic;
    }

    public void setAthletic(int athletic) {
        this.athletic = athletic;
    }

    public int getBrawl() {
        return brawl;
    }

    public void setBrawl(int brawl) {
        this.brawl = brawl;
    }

    public int getDodge() {
        return dodge;
    }

    public void setDodge(int dodge) {
        this.dodge = dodge;
    }

    public int getEmpathy() {
        return empathy;
    }

    public void setEmpathy(int empathy) {
        this.empathy = empathy;
    }

    public int getExpression() {
        return expression;
    }

    public void setExpression(int expression) {
        this.expression = expression;
    }

    public int getIntimidation() {
        return intimidation;
    }

    public void setIntimidation(int intimidation) {
        this.intimidation = intimidation;
    }

    public int getLeadership() {
        return leadership;
    }

    public void setLeadership(int leadership) {
        this.leadership = leadership;
    }

    public int getStreetwise() {
        return streetwise;
    }

    public void setStreetwise(int streetwise) {
        this.streetwise = streetwise;
    }

    public int getSubterfuge() {
        return subterfuge;
    }

    public void setSubterfuge(int subterfuge) {
        this.subterfuge = subterfuge;
    }

    public int getAnimalKen() {
        return animalKen;
    }

    public void setAnimalKen(int animalKen) {
        this.animalKen = animalKen;
    }

    public int getCrafts() {
        return crafts;
    }

    public void setCrafts(int crafts) {
        this.crafts = crafts;
    }

    public int getDrive() {
        return drive;
    }

    public void setDrive(int drive) {
        this.drive = drive;
    }

    public int getEtiquette() {
        return etiquette;
    }

    public void setEtiquette(int etiquette) {
        this.etiquette = etiquette;
    }

    public int getFirearms() {
        return firearms;
    }

    public void setFirearms(int firearms) {
        this.firearms = firearms;
    }

    public int getMelee() {
        return melee;
    }

    public void setMelee(int melee) {
        this.melee = melee;
    }

    public int getPerformance() {
        return performance;
    }

    public void setPerformance(int performance) {
        this.performance = performance;
    }

    public int getLarceny() {
        return larceny;
    }

    public void setLarceny(int larceny) {
        this.larceny = larceny;
    }

    public int getStealth() {
        return stealth;
    }

    public void setStealth(int stealth) {
        this.stealth = stealth;
    }

    public int getSurvival() {
        return survival;
    }

    public void setSurvival(int survival) {
        this.survival = survival;
    }

    public int getAcademics() {
        return academics;
    }

    public void setAcademics(int academics) {
        this.academics = academics;
    }

    public int getComputer() {
        return computer;
    }

    public void setComputer(int computer) {
        this.computer = computer;
    }

    public int getFinance() {
        return finance;
    }

    public void setFinance(int finance) {
        this.finance = finance;
    }

    public int getInvestigation() {
        return investigation;
    }

    public void setInvestigation(int investigation) {
        this.investigation = investigation;
    }

    public int getLaw() {
        return law;
    }

    public void setLaw(int law) {
        this.law = law;
    }

    public int getLinguistic() {
        return linguistic;
    }

    public void setLinguistic(int linguistic) {
        this.linguistic = linguistic;
    }

    public int getMedicine() {
        return medicine;
    }

    public void setMedicine(int medicine) {
        this.medicine = medicine;
    }

    public int getOccult() {
        return occult;
    }

    public void setOccult(int occult) {
        this.occult = occult;
    }

    public int getPolitics() {
        return politics;
    }

    public void setPolitics(int politics) {
        this.politics = politics;
    }

    public int getScience() {
        return science;
    }

    public void setScience(int science) {
        this.science = science;
    }

    public CharacterSheet getCharacterSheet() {
        return characterSheet;
    }

    public void setCharacterSheet(CharacterSheet characterSheet) {
        this.characterSheet = characterSheet;
    }
}
