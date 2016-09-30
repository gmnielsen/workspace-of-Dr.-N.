// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5265.Phoenix.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc5265.Phoenix.Robot;
import org.usfirst.frc5265.Phoenix.RobotMap;
import org.usfirst.frc5265.Phoenix.subsystems.StagValues;

/**
 *
 */
public class Rampart extends Command {
	boolean rampartState = true;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public Rampart() {

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.stagBase);
        requires(Robot.stagIntake);
        setTimeout(StagValues.btnRampartTime);
        		//SmartDashboard.getNumber("rampartTime"));

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	// are we running just the right wheels, then turn them off or turn them on
    	//rampartState = Robot.stagIntake.rampartStateToggle();
    	// test brushstate and either turn the brush motor on or off
    	if (rampartState){
    		//RobotMap.stagBaseStagMotor.tankDrive(0, 1.0);
    		new driveByTime(0.0, 1.0,StagValues.btnRampartTime);
    		} else {
    			RobotMap.stagBaseStagMotor.tankDrive(0, 0);    	}
    	System.out.println("rampartState " + rampartState);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}