package Enemies;

import Actions.EnemyActions.EnemyActions;
import TreasureItems.*;

import java.util.Random;

public abstract class Enemy {

    Random random = new Random();
    protected String enemyType;
    protected String enemySubType;
    protected int hp;
    protected int attackDamage;
    protected TreasureItem reward;
    protected EnemyActions enemyActions;


    public abstract void doAction();

    public Enemy() {
        generateReward();
    }
    public void setEnemyType(String enemyType) { this.enemyType = enemyType; }
    public void setEnemySubType(String enemySubType) { this.enemySubType = enemySubType; }
    public void setHp(int hp){
        this.hp = hp;
    }
    public void setAttackDamage(int attackDamage) { this.attackDamage = attackDamage; }
    public void setEnemyActions(EnemyActions enemyActions) { this.enemyActions = enemyActions; }

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
        System.out.println(getEnemySubType() + " " + getEnemyType() + " has dropped " + reward.getTreasureType() + "!");
        System.out.println("Item description: " + reward.getTreasureDescription());
        return reward;
    }

    private void generateReward() {
        int rewardTypeRoll = random.nextInt(4);

        switch(rewardTypeRoll) {
            case 0:
                reward = new StrengthBone();
                break;
            case 1:
                reward = new WisdomBone();
                break;
            case 2:
                reward = new AgilityBone();
                break;
            case 3:
                reward = new VitalityBone();
                break;
        }
    }

    public void evadeAttack(int incomingAttackDamage) {

    }

}
