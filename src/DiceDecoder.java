public class DiceDecoder {

    public static int diceType (String input){
        String diceType = input.toLowerCase().split("d")[1];
        int diceTypeToInt = Integer.parseInt(diceType);
//        System.out.println("Type of Dice = " + diceTypeToInt);
        return diceTypeToInt;
    }

    public static boolean syntaxCorrectness (String input) {
        if (input.toLowerCase().contains("d")){
            return true;
        }else{
            return false;
        }
    }

    public static int numberOfDices (String input){
        String numberOfDices = input.toLowerCase().split("d")[0];
        int numberOfDicesToInt = Integer.parseInt(numberOfDices);

        if(numberOfDicesLimit(numberOfDicesToInt)){
//           System.out.println("Number of Dices = " + numberOfDicesToInt);
           return numberOfDicesToInt;
       }

        return -1;

    }

    public static boolean numberOfDicesLimit (int numberOfDices){
        if(numberOfDices > 100 || numberOfDices <= 0){
            System.out.println("Invalid number of Dices");
            return false;
        }else{
            return true;
        }
    }

    public static void prepoznavanjeKockia(String kockice){
        if(kockice.contains("+")){
            System.out.println("imaju plus");

        }else{
            System.out.println("nemaju plus");
            DiceRoller.initiationOfProcess(kockice);
        }
    }

    public static void isItAmplifier(){

    }

}
