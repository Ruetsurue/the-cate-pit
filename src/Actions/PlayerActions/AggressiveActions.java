package Actions.PlayerActions;

import Enemies.Enemy;
import Player.Player;

public class AggressiveActions implements PlayerActions {

    public void borkAttack(Player player, Enemy enemy) {
        System.out.println(player.getPlayerName() + " borks at " + enemy.getEnemyType() + "! ATK: " + player.getAttackDamage());

    }

    //public void evadeAttack
}
