package player;

import enemies.Enemy;
import treasureitems.TreasureItem;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Player {

    Scanner input = new Scanner(System.in);

    private final int DEFAULT_HP = 30;
    private final int DEFAULT_MAX_INTELLIGENCE = 5;
    private final int DEFAULT_MAX_AGILITY = 5;
    private final int DEFAULT_MAX_ATTACK_DAMAGE = 10;

    private static String playerName = "Doge";
    private int attackDamage;
    private int hp = DEFAULT_HP;
    private int intelligence;
    private int agility;
    private ArrayList<TreasureItem> inventory;

    public Player() {
        this(5, 1, 1);
    }

    public Player(int attackDamage, int intelligence, int agility) {
        this.attackDamage = attackDamage;
        this.intelligence = intelligence;
        this.agility = agility;

    }

    public static String getPlayerName(){ return playerName; }
    public int getAttackDamage(){ return attackDamage; }
    public int getIntelligence(){ return intelligence; }
    public int getAgility(){ return agility; }

    public void showPlayerStats() {
        System.out.println("-------------------------------");
        System.out.println(getPlayerName().toUpperCase(Locale.ROOT) + " STATS:");
        System.out.println("ATTACK DAMAGE: " + attackDamage);
        System.out.println("HP: " + hp);
        System.out.println("INTELLIGENCE: " + intelligence);
        System.out.println("AGILITY: " + agility);

        System.out.println("\nSuch wow, much progress!~");
        System.out.println("-------------------------------");
    }

    public void restoreHP() {
        hp = DEFAULT_HP;
    }

    public void pickUpItem(TreasureItem treasureItem) {
        System.out.print("Would you like to consume " + treasureItem.getTreasureType() + "? Otherwise it'll be stashed in the inventory. y/n:");

        inventory.add(treasureItem);
    }

    public void increaseAttackDamage(int increaseBy) {
        if(attackDamage + increaseBy < DEFAULT_MAX_ATTACK_DAMAGE) {
            attackDamage += increaseBy;
        } else {
            attackDamage = DEFAULT_MAX_ATTACK_DAMAGE;
        }

    }

    public void increaseIntelligence(int increaseBy) {
        if(intelligence + increaseBy <= DEFAULT_MAX_INTELLIGENCE) {
            intelligence += increaseBy;
        } else {
            intelligence = DEFAULT_MAX_INTELLIGENCE;
        }

    }

    public void increaseAgility(int increaseBy) {
        if(agility + increaseBy <= DEFAULT_MAX_AGILITY) {
            agility += increaseBy;
        } else {
            agility = DEFAULT_MAX_AGILITY;
        }

    }

    public void consumeItem(TreasureItem treasureItem) {
        switch (treasureItem.getTreasureType()) {
            case "STRENGTH BONE":
                increaseAttackDamage(treasureItem.getBoostStatBy());
                break;

            case "WISDOM BONE":
                increaseIntelligence(treasureItem.getBoostStatBy());
                break;

            case "AGILITY BONE":
                increaseAgility(treasureItem.getBoostStatBy());
                break;

            case "VITALITY BONE":
                restoreHP();
                break;
        }

        System.out.printf("%s has consumed " + treasureItem.getTreasureType() + "!\n", getPlayerName());
        System.out.printf(treasureItem.getConsumeMessage() + "\n", getPlayerName());
        showPlayerStats();

    }

    public void dealDamage(Enemy enemy) {
        System.out.println("\n-------------------------------------");
        System.out.println(getPlayerName() + " deals " + attackDamage + " damage!");
        //enemy.takeDamage(attackDamage);
        System.out.println("-------------------------------------\n");
    }

    public void takeDamage(int damage) {
        hp -= damage;
        showHp();
    }

    public void showHp() {
        System.out.println(playerName + " is now " + hp + " HP!");
    }

}
