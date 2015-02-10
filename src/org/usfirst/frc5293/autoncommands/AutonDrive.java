// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package org.usfirst.frc5293.autoncommands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc5293.util.IParsable;
import org.usfirst.frc5293.Robot;

public class AutonDrive extends Command implements IParsable {
	private double xstrafe, ystrafe, rrotation, t;
  
	public AutonDrive() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);

        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	setTimeout(t);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.drivetrain.autondrive(xstrafe, ystrafe, rrotation);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.drivetrain.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }

    //The the parser checks the input string, the letter returned here will
    //denote that this command is to be added to the list.
    //This must return a single letter.
    public String getIdentifier() {
        return "D";
    }

    //The parser will set the arguments here, each one will be a string and
    //must be parsed accordingly.
    public void setArguments(String[] args) {
        xstrafe = Double.parseDouble(args[0]);
        ystrafe = Double.parseDouble(args[1]);
        rrotation = Double.parseDouble(args[2]);
        t = Double.parseDouble(args[3]);
    }
}
