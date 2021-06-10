package enemies.cate;

import actions.enemy.AggressiveActions;

public class AggressiveCate extends Cate{

    public AggressiveCate(){
        setHp(15);
        setEnemySubType("AGGRESSIVE");
        setAttackDamage(10);
        setEnemyActions(new AggressiveActions());
    }

    @Override
    public void doAction() {
        System.out.println("Cate attacks! Not wow. Make bork, not war");
    }

}
