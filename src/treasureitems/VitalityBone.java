package treasureitems;

import player.Player;

public class VitalityBone extends TreasureItem{

    public VitalityBone(){
        setTreasureType("VITALITY BONE");
        setTreasureDescription("Once consumed, fully restores HP. Your claws ain't nothing to a " + Player.getPlayerName() + " like this, Cate.");
        setConsumeMessage("%s feels refreshed and ready to battle more Cate!");
        setBoostStatBy(1);
    }

}
