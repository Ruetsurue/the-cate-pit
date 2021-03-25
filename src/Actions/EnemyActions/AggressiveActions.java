package Actions.EnemyActions;

import Enemies.Enemy;
import Player.Player;

public class AggressiveActions implements EnemyActions {


    public void takeDamage(Enemy enemy, int damage) {
        enemy.setHp(enemy.getHp() - damage);
        enemy.showHp();
    }

    public void dealDamage(Player player, Enemy enemy) {
        System.out.println("\n-------------------------------------");
        System.out.println(enemy.getEnemySubType() + " " + enemy.getEnemyType() + " deals " + enemy.getAttackDamage() + " damage!");
        player.takeDamage(enemy.getAttackDamage());
        System.out.println("-------------------------------------\n");
    }

    @Override
    public void initiateEncounter() {

    }
}
