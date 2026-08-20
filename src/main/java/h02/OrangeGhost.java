package h02;

import org.tudalgo.algoutils.student.annotation.StudentImplementationRequired;

import fopbot.Robot;
import h02.template.Families;
import h02.template.Ghost;
import h02.template.TickBased;
import h02.template.Util;

/**
 * {@link OrangeGhost} is a {@link Robot} that looks like an orange ghost.
 * It tries to move in a straight line and alternates between turning left and
 * right.
 */
public class OrangeGhost extends Robot implements Ghost, TickBased {
    /**
     * Creates a new {@link OrangeGhost} at the given position.
     *
     * @param x the x-coordinate
     * @param y the y-coordinate
     */
    public OrangeGhost(int x, int y) {
        super(x, y, Families.GHOST_ORANGE);
    }

    /**
     * If the front is clear, it moves forward.
     * Otherwise, it generates a random boolean value. If the value is true, it
     * turns left, otherwise it turns right.
     *
     * After that, it generates a random integer value between 0 and 2627.
     * If the value is divisible by 4 and the front is clear, it moves forward.
     */
    @Override
    @StudentImplementationRequired("H2.2.3")
    public void doMove() {
        // TODO: H2.2.3
        org.tudalgo.algoutils.student.Student.crash("H2.2.3 - Remove if implemented");
    } 
}
