import java.util.Scanner;

public class RollerLogic {

//    public static void mainProcessLoop(String firstRoll){
//
//        DiceDecoder.validateAndInitializeDiceRoll(firstRoll);
//        System.out.println("#####################################################");
//        while (true){
//            Scanner myObj = new Scanner(System.in);
//            System.out.println("Enter dice");
//            String dicesToRoll = myObj.nextLine();
//
//            if (dicesToRoll.contains("q")){
//                System.out.println("Process is terminated!");
//                break;
//            }
//            SumOfAllDices.list.clear();
//            DiceDecoder.validateAndInitializeDiceRoll(dicesToRoll);
//            System.out.println("#####################################################");
//        }
//    }  // ovo je loop, treba fa srediti jos

    public static void mainProcessLoop(String firstRoll, Dev dev, Scanner scanner) {
        SumOfAllDices.list.clear();
        DiceDecoder.validateAndInitializeDiceRoll(firstRoll, dev);
        System.out.println("#####################################################");

        while (true) {
            System.out.println("Enter dice (or 'q' to quit)");
            String dicesToRoll = scanner.nextLine();

            if (dicesToRoll.contains("q")) {
                System.out.println("Process is terminated!");
                break;
            }

            SumOfAllDices.list.clear();
            DiceDecoder.validateAndInitializeDiceRoll(dicesToRoll, dev);
            System.out.println("#####################################################");
        }
    }
}
