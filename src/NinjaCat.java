import java.awt.*;

public class NinjaCat extends Critter {
    public NinjaCat() {
    }

    public Color getColor() {
        return Color.MAGENTA;
    }

    public String toString() {
        return "Mew";
    }

    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.frontThreat()) {
            return Action.RIGHT;
        } else if (info.leftThreat()) {
            return Action.RIGHT;
        } else if (info.rightThreat()) {
            return Action.LEFT;
        } else if (info.getFront() == Neighbor.EMPTY) {
            return Action.HOP;
        } else {
            return Action.LEFT;
        }
    }
}