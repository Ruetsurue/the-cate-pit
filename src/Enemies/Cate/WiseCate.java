package Enemies.Cate;

public class WiseCate extends Cate {

    public WiseCate(){
        setHp(10);
        setEnemySubType("WISE");
    }

    @Override
    public void doAction() {
        System.out.println("Cate makes you a riddle! Very cunning, much intelligent");
    }

}