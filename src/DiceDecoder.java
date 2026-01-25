import java.util.ArrayList;

public class DiceDecoder {

    public static void validateAndInitializeDiceRoll(String input) {
        ArrayList<String> list = new ArrayList<>();

        input = input.replaceAll("\\s+", "").toLowerCase();

        if (!input.matches("[0-9Dd+]+")) {
            System.out.println("invalid input");
            return;
        }

        if (input.contains("+")) {
            String[] parts = input.split("\\+");
            for (String part : parts) {
                if (!part.isEmpty()) {
                    list.add(part);
                }
            }
        } else {
            // jedan tip kockice (npr. 3d20)
            list.add(input);
        }

        System.out.println(list);
        DiceRoller.mainResult(list);
    }

    public static int diceType (String input){
        String diceType = input.toLowerCase().split("d")[1];
        return Integer.parseInt(diceType);
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
