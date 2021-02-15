public class Pr3 {

    protected String name;


    protected int score;

    public Pr3(String n, int s) {

        name = n;

        score = s;

    }

    public String getName() { return name; }

    public int getScore() { return score; }

    public String toString() {

        return "(" + name + ", " + score + ")";

    }

}