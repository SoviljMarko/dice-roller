import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Enter dice");
        String dicesToRoll = myObj.nextLine();

//        DiceRoller.initiationOfProcess(dicesToRoll);

        DiceDecoder.prepoznavanjeKockia(dicesToRoll);

        // prepraviti da ranije prekine program, da ne vrti sve

    }

    public static void damageAmplifier (String dicePlusAmp){
        if (dicePlusAmp.contains("+")){
            // sada npraviti filozofiju za Amplifier
        }
    }
}