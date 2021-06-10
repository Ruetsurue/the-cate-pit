package misc;

import player.Player;

import java.util.Locale;

public class InputValidator {
    public static Boolean isAffirmative(String input){
        input = input.toLowerCase(Locale.ROOT);
        if(input.equals("yes") || input.equals("y")){
            return true;
        }
        return false;
    }

    public static Boolean isNegative(String input){
        input = input.toLowerCase(Locale.ROOT);
        if(input.equals("no") || input.equals("n")){
            return true;
        }
        return false;
    }

    public static void invalidInput(String input) {
        System.out.println(input + " ain't no country " + Player.getPlayerName() + " heard of! Do they speak English in " + input + "?");
    }

    public static boolean isValidChoice(int number, int lowerBound, int upperBound) {
        if(number >= lowerBound && number <= upperBound){ return true; }
        return false;
    }

    public static void invalidInput(int number) {
        System.out.println(number + " was not a part of the deal, dummy. Try picking an actual option");
    }


}
