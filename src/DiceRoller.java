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

}
