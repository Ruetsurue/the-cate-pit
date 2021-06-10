package enemies.cate;

public class FriendlyCate extends Cate{

    public FriendlyCate(){
        setHp(12);
        setEnemySubType("FRIENDLY");
    }

    @Override
    public void doAction() {
        System.out.println("Cate gives you a gift! Much wow, such love");
    }

}
