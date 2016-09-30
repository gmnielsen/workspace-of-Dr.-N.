// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5265.RoboSim;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveTrainSpeedController1;
    public static SpeedController driveTrainSpeedController2;
    public static RobotDrive driveTrainRobotDrive21;
    public static CANTalon driveTrainback_right_motor;
    public static CANTalon driveTrainfront_right_motor;
    public static CANTalon driveTrainback_left_motor;
    public static CANTalon driveTrainfront_left_motor;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainSpeedController1 = new Talon(0);
        LiveWindow.addActuator("DriveTrain", "Speed Controller 1", (Talon) driveTrainSpeedController1);
        
        driveTrainSpeedController2 = new Talon(1);
        LiveWindow.addActuator("DriveTrain", "Speed Controller 2", (Talon) driveTrainSpeedController2);
        
        driveTrainRobotDrive21 = new RobotDrive(driveTrainSpeedController1, driveTrainSpeedController2);
        
        driveTrainRobotDrive21.setSafetyEnabled(true);
        driveTrainRobotDrive21.setExpiration(0.1);
        driveTrainRobotDrive21.setSensitivity(0.5);
        driveTrainRobotDrive21.setMaxOutput(1.0);
        driveTrainRobotDrive21.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
        driveTrainback_right_motor = new CANTalon(4);
        LiveWindow.addActuator("DriveTrain", "back_right_motor", driveTrainback_right_motor);
        
        driveTrainfront_right_motor = new CANTalon(3);
        LiveWindow.addActuator("DriveTrain", "front_right_motor", driveTrainfront_right_motor);
        
        driveTrainback_left_motor = new CANTalon(2);
        LiveWindow.addActuator("DriveTrain", "back_left_motor", driveTrainback_left_motor);
        
        driveTrainfront_left_motor = new CANTalon(1);
        LiveWindow.addActuator("DriveTrain", "front_left_motor", driveTrainfront_left_motor);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}