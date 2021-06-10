package actions.player;

import enemies.Enemy;
import player.Player;

public class AggressiveActions implements PlayerActions {

    public void borkAttack(Player player, Enemy enemy) {
        System.out.println(player.getPlayerName() + " borks at " + enemy.getEnemyType() + "! ATK: " + player.getAttackDamage());

    }

    //public void evadeAttack
}
