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
import org.usfirst.frc5265.Phoenix.Robot;
import org.usfirst.frc5265.Phoenix.RobotMap;
//import org.usfirst.frc5265.Phoenix.subsystems.StagBase;

/**
 *
 */
public class driveByDistance extends Command {
	private double leftSpeed;
	private double rightSpeed;
	private double dist;
	
	public driveByDistance(double lsp,double rsp, double dt) {
		leftSpeed = lsp;
		rightSpeed = rsp;
		dist = dt;
		requires(Robot.stagBase);
	}

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.stagBase.zeroEncoderValue();
    	Robot.stagBase.setEncoderDistance(dist);    
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	RobotMap.stagBaseStagMotor.tankDrive(leftSpeed, rightSpeed);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return (Math.abs(dist - Robot.stagBase.returnEncoderValue())<10);
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
