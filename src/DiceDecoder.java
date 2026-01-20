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
            String dice = kockice.split("\\+")[0];
            System.out.println("this is dice one " + dice);
            String rest = kockice.split("\\+")[1];
            System.out.println("this is rest " + rest);

            DiceRoller.initiationOfProcess(dice, rest);

//            ostalo je da se radi sada za vise kockica, idemo do 7 kockica, toliko opcija ima poyy
        }else{
            System.out.println("nemaju plus");
            DiceRoller.initiationOfProcess(kockice);
        }
    }

    public static boolean isItDamageAmplifierCorrect(String amp){
        if (amp.matches("[0-9]*")){
            return true;
        }
        return false;
    }

    public static int isItDamageAmplifier(String amp){
        return  Integer.parseInt(amp);
    }

}
