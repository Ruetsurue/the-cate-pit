package enemies.cate;

public class FriendlyCate extends Cate{

    public FriendlyCate(){
        setHp(12);
        setEnemySubType("FRIENDLY");
    }

    @Override
    public void greetPlayer() {

        System.out.println("This Cate does not seek violence, o Doge.");
        System.out.println("This Cate seeks but peace.");
        System.out.println("Meow <3 :3");
    }

}
