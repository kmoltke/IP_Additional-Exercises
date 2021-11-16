package Minions;

public class Minion {
    private String name;
    private boolean minionStatus;
    private int minionPoints;

    public Minion(String name) {
        this.name = name;
        minionPoints = 1;
        minionStatus = true;
    }

    public String getName() {
        return name;
    }

    public int getMinionPoints() {
        return minionPoints;
    }
}
