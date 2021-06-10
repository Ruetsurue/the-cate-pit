package treasureitems;

public class StrengthBone extends TreasureItem{

    public StrengthBone(){
        setTreasureType("STRENGTH BONE");
        setTreasureDescription("Once consumed, increases Attack Damage by 2. A Strength Bone a day makes your Cate bork away.");
        setConsumeMessage("%s feels empowered! His bork will send 'em Cate fleeing!");
        setBoostStatBy(2);
    }

}
