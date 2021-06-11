package enemies;

import misc.DiceRoller;
import treasureitems.*;

import java.util.Random;

public abstract class Enemy {

    Random random = new Random();
    protected String enemyType;
    protected String enemySubType;
    protected int hp;
    protected int attackDamage;
    protected TreasureItem setReward;


    public abstract void greetPlayer();

    public Enemy() {
        setReward(DiceRoller.generateReward());
    }
    public void setEnemyType(String enemyType) { this.enemyType = enemyType; }
    public void setEnemySubType(String enemySubType) { this.enemySubType = enemySubType; }
    public void setHp(int hp){
        this.hp = hp;
    }
    public void setAttackDamage(int attackDamage) { this.attackDamage = attackDamage; }
    public void setReward(TreasureItem reward) { this.setReward = reward;}

    public String getEnemyType() { return enemyType; }
    public String getEnemySubType() { return this.enemySubType; }
    public int getAttackDamage() { return this.attackDamage; }
    public int getHp() { return this.hp; }

    public void showHp() {
        System.out.println(getEnemySubType() + " " + getEnemyType() + " is now " + hp + " HP!");
    }

    public boolean isDefeated() {
        if(hp <= 0) {
            return true;
        }
        return false;
    }

    public TreasureItem dropReward() {
        System.out.println(getEnemySubType() + " " + getEnemyType() + " has dropped " + setReward.getTreasureType() + "!");
        System.out.println("Item description: " + setReward.getTreasureDescription());
        return setReward;
    }

}
