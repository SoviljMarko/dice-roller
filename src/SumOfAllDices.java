import java.util.ArrayList;

public class SumOfAllDices {

    public static ArrayList<Integer> list = new ArrayList<>();

    public static int sumOfRolls (int numberOfDices, int diceType){

        for (int i = 0; i < numberOfDices; i++){
            int roll = DiceRoller.oneRoll(diceType);

            if(roll > 0) {
//                System.out.println(i + 1 + ". Roll je " + roll);
                arrayOfRolls(roll);
//                System.out.println("*************************************");
            }else {
                System.out.println("Invalid Dice");
                break;
            }
        }
        return sumOfAllFromList(list);
    }

    public static void arrayOfRolls (int roll){
        list.add(roll);
    }

    public static int sumOfAllFromList(ArrayList<Integer> list){
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum;
    }

}
