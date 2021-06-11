package enemies.cate;

public class AggressiveCate extends Cate{

    public AggressiveCate(){
        setHp(15);
        setEnemySubType("HELLCAT");
        setAttackDamage(10);
    }

    @Override
    public void greetPlayer() {
        System.out.println("SSSSSSSSSHHHHHHHHHHHHHHHH. DOGE IS DISGUSTING. DOGE DOES NOT BELONG HERE. DIE.");
    }

}
