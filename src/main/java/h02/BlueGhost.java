package h02;

import org.tudalgo.algoutils.student.annotation.StudentImplementationRequired;

import fopbot.Robot;
import h02.template.Families;
import h02.template.Ghost;
import h02.template.TickBased;

/**
 * The {@link BlueGhost} is a {@link Robot} that looks like a blue ghost.
 * It tries to move in a circle.
 */
public class BlueGhost extends Robot implements Ghost, TickBased {
    /**
     * Creates a new {@link BlueGhost} at the given position.
     *
     * @param x the x-coordinate
     * @param y the y-coordinate
     */
    public BlueGhost(int x, int y) {
        super(x, y, Families.GHOST_BLUE);
    }

    /**
     * Turns the robot to the left. If the front is not clear, it turns to the right
     * until the front is clear and then moves forward.
     */
    @Override
    @StudentImplementationRequired("H2.2.1")
    public void doMove() {
        // TODO: H2.2.1
        org.tudalgo.algoutils.student.Student.crash("H2.2.1 - Remove if implemented");
    }
}
