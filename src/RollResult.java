import java.util.List;

public class RollResult {

    public List<Integer> rolls;
    public int modifier;
    public int total;

    RollResult(List<Integer> rolls, int modifier, int total) {
        this.rolls = rolls;
        this.modifier = modifier;
        this.total = total;
    }
}
