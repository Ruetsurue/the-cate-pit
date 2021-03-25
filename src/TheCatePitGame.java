import Encounters.Encounter;
import Enemies.Enemy;
import Player.Player;

public class TheCatePitGame {
    public static void main(String[] args) {
        launchGame();
    }

    public static void launchGame() {
        WorldMapper worldMapper = new WorldMapper();
        Player player = new Player();

        //worldMapper.printWorldMap();


        for(Enemy enemy : worldMapper.getWorldMap()) {

            Encounter encounter = new Encounter();
            encounter.initiateEncounter(player, enemy);


        }


    }
}
