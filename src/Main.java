import io.javalin.Javalin;
import java.sql.SQLException;
public class Main {

    public static void main(String[] args) {
        try {
            Dev dev = new Dev();

            Javalin app = Javalin.create(config -> {
                config.bundledPlugins.enableCors(cors -> {
                    cors.addRule(rule -> {
                        rule.anyHost();
                    });
                });
            }).start(8080);

            app.get("/roll", ctx -> {
                SumOfAllDices.list.clear();
                String dice = ctx.queryParam("dice");
                RollResult result = DiceDecoder.validateAndInitializeDiceRoll(dice, dev);
                if (result == null) {
                    ctx.status(400).result("Invalid input!");
                    return;
                }
                ctx.json(result);
            });

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }

//    public static void main(String[] args) {
//        try {
//            Dev dev = new Dev();
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Enter dice");
//            String firstRoll = scanner.nextLine();
//            RollerLogic.mainProcessLoop(firstRoll, dev, scanner);
//            dev.close();
//        } catch (SQLException e) {
//            System.out.println("Database error: " + e.getMessage());
//        }
//    }


}