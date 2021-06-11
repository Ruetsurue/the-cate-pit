import enemies.Enemy;
import player.Player;

public class TheCatePitGame {
    public static void main(String[] args) {
        launchGame();
    }

    public static void launchGame() {
        WorldMapper worldMapper = new WorldMapper();
        Player player = new Player();

        //worldMapper.printWorldMap();


        for(Enemy enemy : worldMapper.getWorldMap()) {



        }


    }
}
