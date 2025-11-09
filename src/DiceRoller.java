import java.util.Random;

public class DiceRoller {

    public static int oneRoll (String diceType){
        Random random = new Random();
        int roll;

        if(diceType.equals("4")){
            roll = random.nextInt(1,5);
        }else if(diceType.equals("6")){
            roll = random.nextInt(1, 7);
        }else if(diceType.equals("8")){
            roll = random.nextInt(1, 9);
        }else if(diceType.equals("10")){
            roll = random.nextInt(1,11);
        }else if(diceType.equals("12")){
            roll = random.nextInt(1,13);
        }else if(diceType.equals("20")){
            roll = random.nextInt(1,21);
        }else if(diceType.equals("100")){
            roll = random.nextInt(1,101);
        }else{
            roll = -1;
        }

        return roll;
    }
}
