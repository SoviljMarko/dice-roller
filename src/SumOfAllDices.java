public class SumOfAllDices {

    public static int sumOfRolls (int numberOfDices, int diceType){
        int sum = 0;
        for (int i = 0; i < numberOfDices; i++){
            int roll = DiceRoller.oneRoll(diceType);

            if(roll > 0) {
                System.out.println(i + 1 + ". Roll je " + roll);
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

}
