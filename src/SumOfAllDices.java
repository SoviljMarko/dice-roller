import java.util.ArrayList;

public class SumOfAllDices {

    public static ArrayList<Integer> list = new ArrayList<>();

    public static int sumOfRolls (int numberOfDices, int diceType){
        int sum = 0;
        for (int i = 0; i < numberOfDices; i++){
            int roll = DiceRoller.oneRoll(diceType);

            if(roll > 0) {
                System.out.println(i + 1 + ". Roll je " + roll);
                arrayOfRolls(roll);
                sum += roll;
                System.out.println("through process sum is = " + sum);
                System.out.println("*************************************");
            }else {
                System.out.println("Invalid Dice");
                break;
            }
        }
        return sum;
    }

    public static void arrayOfRolls (int roll){
        list.add(roll);
//        System.out.println(list);
    }

    public static void convertArrayToNumbersWithPluses(){
        for (int i = 0; i < list.size(); i++){

        }
    }

}
