import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String diceType = "";
        String numberOfDices = "";;

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Enter dice");
        String dicesToRoll = myObj.nextLine();

        if(DiceDecoder.syntaxCorrectness(dicesToRoll)){
            numberOfDices = DiceDecoder.numberOfDices(dicesToRoll);
            diceType = DiceDecoder.diceType(dicesToRoll);
        } else {
            System.out.println("Wrong syntax");
        }
        System.out.println("Roll of all dices = " + SumOfAllDices.sumOfRolls(numberOfDices, diceType));

    }

//    public static void testingRandom(int numberOfRolls, String diceType){
//        for (int i = 0; i <= numberOfRolls; i++){
//            System.out.println(mapDiceArray(diceType));
//        }
//    }
}