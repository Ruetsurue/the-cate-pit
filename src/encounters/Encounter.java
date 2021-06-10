package encounters;

import actions.player.AggressiveActions;
import enemies.Enemy;
import player.Player;
import treasureitems.TreasureItem;
import misc.InputValidator;

import java.util.Locale;
import java.util.Scanner;

public class Encounter {

    Scanner input = new Scanner(System.in);

    public void initiateEncounter(Player player, Enemy enemy) {
        System.out.println("----------------------------------");
        System.out.println(player.getPlayerName() + " encounters: "+ enemy.getEnemySubType() + " " + enemy.getEnemyType() + "!");
        showEncounterOptions(player);
        int choice = chooseEncounterOption(player);

        switch(choice) {
            case 1:
                initiateAggressiveEncounter(player);
                break;
        }

    }

    public void initiateAggressiveEncounter(Player player, Enemy enemy){
        System.out.println("So you choose death, Cate. Or rather, I chose it for you.");
        player.setPlayerActions(new AggressiveActions());

    }

    public void showEncounterOptions(Player player) {
        System.out.println("Boo, whatcha gonna do?");
        System.out.println("Actions:");
        System.out.println("1) BARK AT CATE, FIGHT CATE!!!!! (ATK: " + player.getAttackDamage() + ")");
        System.out.println("2) Try being diplomatic (INT: " + player.getAgility() + ")");
        System.out.println("3) Wait and see what Cate's up to");
        System.out.println("4) RUN LIKE THERE'S NO TOMORROW!! (AGL: " + player.getAgility() + ")");
    }

    public int chooseEncounterOption(Player player) {
        int choice = input.nextInt();

        while(!InputValidator.isValidChoice(choice, 1, 4)){
            InputValidator.invalidInput(choice);
            choice = input.nextInt();
            showEncounterOptions(player);
            }
        return choice;
        }

    public void battle(Player player, Enemy enemy) {

        System.out.println("Bring it on, Cate!");
        enemy.showHp();


        if(enemy.isDefeated()) {
            postBattle(player, enemy);
        }
    }

    public void postBattle(Player player, Enemy enemy) {
        TreasureItem reward = enemy.dropReward();
        System.out.print("Would you like to pick it up? y/n:");
        String playerResponse = input.nextLine();
        playerResponse = playerResponse.toLowerCase(Locale.ROOT);

        if(InputValidator.isAffirmative(playerResponse)){
            player.pickUpItem(reward);
        } else if(InputValidator.isNegative(playerResponse)) {
            System.out.println("Item discarded: " + reward.getTreasureType());
            System.out.println(Player.getPlayerName() + "  no needs such junk from no cate!");
        } else {
            InputValidator.invalidInput(playerResponse);
        }

        System.out.println("----------------------------------");
    }

}

