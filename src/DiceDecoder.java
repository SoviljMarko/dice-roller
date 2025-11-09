public class DiceDecoder {

    public static String diceType (String input){
        String diceType = input.toLowerCase().split("d")[1];
        System.out.println("Type of Dice = " + diceType);
        return diceType;
    }

    public static String numberOfDices (String input){
        String numberOfDices = input.toLowerCase().split("d")[0];
        System.out.println("Number of Dices = " + numberOfDices);
        return numberOfDices;
    }

    public static boolean syntaxCorrectness (String input) {
        if (input.toLowerCase().contains("d")){
            return true;
        }else{
            return false;
        }
    }

}
