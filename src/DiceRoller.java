import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;

public class DiceRoller {

    private static final Random random = new Random();

//    public static int oneRoll (int diceType){
//        int roll;
//
//        if(diceType == 4){
//            roll = random.nextInt(1,5);
//        }else if(diceType == 6){
//            roll = random.nextInt(1, 7);
//        }else if(diceType == 8){
//            roll = random.nextInt(1, 9);
//        }else if(diceType == 10){
//            roll = random.nextInt(1,11);
//        }else if(diceType == 12){
//            roll = random.nextInt(1,13);
//        }else if(diceType == 20){
//            roll = random.nextInt(1,21);
//        }else if(diceType == 100){
//            roll = random.nextInt(1,101);
//        }else{
//            roll = -1;
//        }
//
//        return roll;
//    }
//
//    public static void mainResult (ArrayList<String> lista){
//        int ampSum = 0;
//        int dicesSum = 0;
//        for (String s : lista){
//            if (DiceDecoder.syntaxCorrectness(s)){
//                int numberOfDices = DiceDecoder.numberOfDices(s);
//                int diceType = DiceDecoder.diceType(s);
//
//                dicesSum =  SumOfAllDices.sumOfRolls(numberOfDices, diceType);
//            }else if(DiceDecoder.isItDamageAmplifierCorrect(s)){
//                ampSum += DiceDecoder.isItDamageAmplifier(s);
//            }
//        }
//        System.out.println("All rolls -> " + SumOfAllDices.list + " Sum = " + dicesSum);
//        System.out.println("AMP -> " + ampSum);
//
//        System.out.println("Final output -> " + SumOfAllDices.list + " + " + ampSum
//                + " = " + (dicesSum + ampSum) );
//    }


    public static void mainResult(ArrayList<String> lista, String originalInput, Dev dev) {
        int ampSum = 0;
        int dicesSum = 0;

        for (String s : lista) {
            if (DiceDecoder.syntaxCorrectness(s)) {
                int numberOfDices = DiceDecoder.numberOfDices(s);
                int diceType = DiceDecoder.diceType(s);
                dicesSum += SumOfAllDices.sumOfRolls(numberOfDices, diceType); // ← bio bug, sad je +=
            } else if (DiceDecoder.isItDamageAmplifierCorrect(s)) {
                ampSum += DiceDecoder.isItDamageAmplifier(s);
            }
        }

        int total = dicesSum + ampSum;

        System.out.println("All rolls -> " + SumOfAllDices.list + " Sum = " + dicesSum);
        System.out.println("AMP -> " + ampSum);
        System.out.println("Final output -> " + SumOfAllDices.list + " + " + ampSum + " = " + total);

        // Čuvanje u bazu
        try {
            dev.saveRoll(originalInput, SumOfAllDices.list.toString(), ampSum, total);
            System.out.println("✔ Roll saved to database.");
        } catch (SQLException e) {
            System.out.println("Failed to save roll: " + e.getMessage());
        }
    }

    public static int oneRoll(int diceType) {
        // Podržani tipovi kockica
        int[] validTypes = {4, 6, 8, 10, 12, 20, 100};
        for (int t : validTypes) {
            if (diceType == t) return random.nextInt(1, diceType + 1);
        }
        return -1; // nepoznat tip kockice
    }
}
