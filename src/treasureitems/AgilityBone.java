package treasureitems;

import player.Player;

public class AgilityBone extends TreasureItem{

    public AgilityBone(){
        setTreasureType("AGILITY BONE");
        setTreasureDescription("Once consumed, increases Agility by 1. Can't cate me.");
        setConsumeMessage("%s is faster and dodgier than before. No Cate can land a hit on  " + Player.getPlayerName() + "  rolling around at the speed of sound!");
        setBoostStatBy(1);
    }

}
