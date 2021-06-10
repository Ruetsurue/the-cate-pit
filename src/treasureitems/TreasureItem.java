package treasureitems;

public abstract class TreasureItem {

    private String treasureType;
    private String treasureDescription;
    private String consumeMessage;
    private int boostStatBy;

    public String getTreasureType() { return treasureType; }
    public String getTreasureDescription() {
        return treasureDescription;
    }
    public String getConsumeMessage() { return consumeMessage; }
    public int getBoostStatBy() {
        return boostStatBy;
    }

    public void setTreasureType(String treasureType){
        this.treasureType = treasureType;
    }
    public void setTreasureDescription(String treasureDescription){
        this.treasureDescription = treasureDescription;
    }
    public void setConsumeMessage(String consumeMessage){
        this.consumeMessage = consumeMessage;
    }
    public void setBoostStatBy(int boostStatBy){
        this.boostStatBy = boostStatBy;
    }


}
