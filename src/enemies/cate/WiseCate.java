package enemies.cate;

public class WiseCate extends Cate {

    public WiseCate(){
        setHp(10);
        setEnemySubType("SPHYNX");
    }

    @Override
    public void greetPlayer() {
        System.out.println("Behold'n'behave, silly young Doge! For I, the elder Cate Sphynx, got a test of wit for you.");
        System.out.println("Should you answer my riddle correctly, I shall grant you passage of this chamber.");
        System.out.println("Should you fail miserably, I shall call the Hellcat to fight you.");
    }

}