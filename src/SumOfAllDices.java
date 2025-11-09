public class SumOfAllDices {

    public static int sumOfRolls (String numberOfDices, String diceType){
        int numberOfDicesInt = Integer.parseInt(numberOfDices);
        int sum = 0;
        for (int i = 0; i < numberOfDicesInt; i++){
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
