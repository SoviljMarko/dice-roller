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

    public static void initiationOfProcess (String dicesToRoll){
        if(DiceDecoder.syntaxCorrectness(dicesToRoll)){

            int numberOfDices = DiceDecoder.numberOfDices(dicesToRoll);
            int diceType = DiceDecoder.diceType(dicesToRoll);

            int finalSum = SumOfAllDices.sumOfRolls(numberOfDices, diceType);

//            System.out.println("Roll of all dices = " + finalSum);
            System.out.println(SumOfAllDices.list + " = "
                    + finalSum);

        } else {
            System.out.println("Wrong syntax");
        }
    }

    public static void initiationOfProcess (String dicesToRoll,String diceOrAmplifier){
        if(DiceDecoder.syntaxCorrectness(dicesToRoll)){

            int amplifierToInt;

            int numberOfDices = DiceDecoder.numberOfDices(dicesToRoll);
            int diceType = DiceDecoder.diceType(dicesToRoll);
            int firstDice = SumOfAllDices.sumOfRolls(numberOfDices, diceType);
            System.out.println(firstDice);
            if (DiceDecoder.syntaxCorrectness(diceOrAmplifier)){
                int numberOfDicesSecond = DiceDecoder.numberOfDices(diceOrAmplifier);
                int diceTypeSecond = DiceDecoder.diceType(diceOrAmplifier);
                int secondDice = SumOfAllDices.sumOfRolls(numberOfDicesSecond, diceTypeSecond);
                System.out.println("List of two dices -> "+ SumOfAllDices.list +
                        " Sum of two dices = " + (firstDice + secondDice));
            }else{
                amplifierToInt = Integer.parseInt(diceOrAmplifier);
                System.out.println(SumOfAllDices.list +" + "+ amplifierToInt + " = "
                        + (firstDice + amplifierToInt));
            }
            System.out.println(SumOfAllDices.list);
        } else {
            System.out.println("Wrong syntax");
        }
    }

    // ovo je dodato kao lakse resenje, treba ga izmeniti da postane
    // validan i za DMG AMP, a ne samo za kockice
    public static void simplifiedInitiationOfProcess (ArrayList<String> lista){
        for (String s : lista) {
            System.out.println(s);

            if (DiceDecoder.syntaxCorrectness(s)) {

                int numberOfDices = DiceDecoder.numberOfDices(s);
                int diceType = DiceDecoder.diceType(s);

                int finalSum = SumOfAllDices.sumOfRolls(numberOfDices, diceType);

                System.out.println(SumOfAllDices.list + " = "
                        + finalSum);

            } else {
                System.out.println("Wrong syntax");
            }
        }
    }

    public static void testZaPravuVerziju (ArrayList<String> lista){
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
        System.out.println(SumOfAllDices.list + " = " + dicesSum);
        System.out.println(ampSum);
    }
}
