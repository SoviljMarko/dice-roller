public class DiceDecoder {

    public static int diceType (String input){
        String diceType = input.toLowerCase().split("d")[1];
        int diceTypeToInt = Integer.parseInt(diceType);
        System.out.println("Type of Dice = " + diceTypeToInt);
        return diceTypeToInt;
    }

    public static int numberOfDices (String input){
        String numberOfDices = input.toLowerCase().split("d")[0];
        int numberOfDicesToInt = Integer.parseInt(numberOfDices);
        System.out.println("Number of Dices = " + numberOfDicesToInt);
        return numberOfDicesToInt;
    }

    public static boolean syntaxCorrectness (String input) {
        if (input.toLowerCase().contains("d")){
            return true;
        }else{
            return false;
        }
    }

    public static void numberOfDicesLimit (int numberOfDices){
        if(numberOfDices > 100 || numberOfDices <= 0){
            System.out.println("Invalid number of dices");
        }
    }
}
