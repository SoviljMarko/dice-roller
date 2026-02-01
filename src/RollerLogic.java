import java.util.Scanner;

public class RollerLogic {

    public static void mainProcessLoop(String firstRoll){

        DiceDecoder.validateAndInitializeDiceRoll(firstRoll);
        System.out.println("#####################################################");
        while (true){
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter dice");
            String dicesToRoll = myObj.nextLine();

            if (dicesToRoll.contains("q")){
                System.out.println("Process is terminated!");
                break;
            }
            SumOfAllDices.list.clear();
            DiceDecoder.validateAndInitializeDiceRoll(dicesToRoll);
            System.out.println("#####################################################");
        }
    }  // ovo je loop, treba fa srediti jos
}
