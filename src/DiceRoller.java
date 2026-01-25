import java.util.ArrayList;
import java.util.Random;

public class DiceRoller {



    public static int oneRoll (int diceType){
        Random random = new Random();
        int roll;

        if(diceType == 4){
            roll = random.nextInt(1,5);
        }else if(diceType == 6){
            roll = random.nextInt(1, 7);
        }else if(diceType == 8){
            roll = random.nextInt(1, 9);
        }else if(diceType == 10){
            roll = random.nextInt(1,11);
        }else if(diceType == 12){
            roll = random.nextInt(1,13);
        }else if(diceType == 20){
            roll = random.nextInt(1,21);
        }else if(diceType == 100){
            roll = random.nextInt(1,101);
        }else{
            roll = -1;
        }

        return roll;
    }


    public static void mainResult (ArrayList<String> lista){
        int ampSum = 0;
        int dicesSum = 0;
        for (String s : lista){
            if (DiceDecoder.syntaxCorrectness(s)){
                int numberOfDices = DiceDecoder.numberOfDices(s);
                int diceType = DiceDecoder.diceType(s);

                dicesSum =  SumOfAllDices.sumOfRolls(numberOfDices, diceType);
            }else if(DiceDecoder.isItDamageAmplifierCorrect(s)){
                ampSum += DiceDecoder.isItDamageAmplifier(s);
            }
        }
        System.out.println("All rolls -> " + SumOfAllDices.list + " Sum = " + dicesSum);
        System.out.println("AMP -> " + ampSum);

        System.out.println("Final output -> " + SumOfAllDices.list + " + " + ampSum
                + " = " + (dicesSum + ampSum) );
    }
}
