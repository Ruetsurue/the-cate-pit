package TreasureItems;

import Player.Player;

public class WisdomBone extends TreasureItem{

    public WisdomBone(){
        setTreasureType("WISDOM BONE");
        setTreasureDescription("Once consumed, increases Intelligence by 1. No Cate can ever fool a smart " + Player.getPlayerName() + ".");
        setConsumeMessage("%s feels wiser than before! No wise cate can outsmart " + Player.getPlayerName() + " now.");
        setBoostStatBy(1);
    }

}
