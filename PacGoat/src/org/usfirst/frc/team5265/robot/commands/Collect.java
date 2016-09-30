package org.usfirst.frc.team5265.robot.commands;

import org.usfirst.frc.team5265.robot.subsystems.Collector;
import org.usfirst.frc.team5265.robot.subsystems.Pivot;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * Get the robot set to collect balls.
 */
public class Collect extends CommandGroup {
    public Collect() {
    	addSequential(new SetCollectionSpeed(Collector.FORWARD));
    	addParallel(new CloseClaw());
    	addSequential(new SetPivotSetpoint(Pivot.COLLECT));
    	addSequential(new WaitForBall());
    }
}
