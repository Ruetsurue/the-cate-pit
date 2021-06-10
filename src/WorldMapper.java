import enemies.cate.*;
import enemies.Enemy;

import java.util.ArrayList;
import java.util.Random;

public class WorldMapper {

    private int mapSize;
    private ArrayList<Enemy> worldMap = new ArrayList<>();
    private Random random = new Random();
    private Cate cate;

    WorldMapper() {
        this(10);
    }

    WorldMapper(int mapSize) {
        this.mapSize = mapSize;
        for(int i = 0; i < mapSize; i++) {
            worldMap.add(generateCate());
        }

    }

    private Enemy generateCate() {
        int cateTypeRoll = random.nextInt(10);
        switch(cateTypeRoll) {
            case 0,1,2,3,4:
                cate = new AggressiveCate();
                break;
            case 5,6,7:
                cate = new WiseCate();
                break;
            case 8,9:
                cate = new FriendlyCate();
                break;
        }

        return cate;
    }

    public void printWorldMap() {
        for(Enemy enemy : worldMap) {
            System.out.println(enemy.getEnemyType());
            enemy.doAction();
        }
    }

    public ArrayList<Enemy> getWorldMap () {
        return worldMap;
    }
}
