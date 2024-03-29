package S191220144.task2;
import S191220144.task2.Sub;
import java.util.List;

public class Geezer {

    private static Geezer theGeezer;

    public static Geezer getTheGeezer() {
        if (theGeezer == null) {
            theGeezer = new Geezer();
        }
        return theGeezer;
    }

    private Geezer() {

    }
    private static List<Sub> subs;
    private Sorter sorter;

    public void setSorter(Sorter sorter) {
        this.sorter = sorter;
    }

    public static void setSubs(List<Sub> l){
        Geezer.subs=l;
    }

    public String lineUp(Line line) {

        String log = new String();

        if (sorter == null) {
            return null;
        }

        Linable[] linables = line.toArray();
        int[] ranks = new int[linables.length];

        for (int i = 0; i < linables.length; i++) {
            ranks[i] = linables[i].getValue();
        }

        sorter.load(ranks);
        sorter.sort();

        String[] sortSteps = this.parsePlan(sorter.getPlan());

        for (String step : sortSteps) {
            this.execute(step);
            System.out.println(line.toString());
            log += line.toString();
            log += "\n[frame]\n";
        }

        return log;

    }

    private String[] parsePlan(String plan) {
        return plan.split("\n");
    }

    private void execute(String step) {
        String[] couple = step.split("<->");
        Geezer.getSubByRank(Integer.parseInt(couple[0]))
                .swapPosition(Geezer.getSubByRank(Integer.parseInt(couple[1])));
    }
    public static Sub getSubByRank(int rank) {

        for (Sub Sub : subs) {
            if (Sub.rank() == rank) {
                return Sub;
            }
        }
        return null;

    }
}
