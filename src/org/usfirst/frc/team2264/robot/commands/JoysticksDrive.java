
package org.usfirst.frc.team2264.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team2264.robot.OI;
import org.usfirst.frc.team2264.robot.Robot;
import org.usfirst.frc.team2264.robot.subsystems.DriveTrain;

/**
 * @author preetipidatala
 *
 */
public class JoysticksDrive extends Command {
	int x=0;
	DriveTrain drive= new DriveTrain();
	OI driveStation= new OI();
	public JoysticksDrive() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.DriveTrain);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		boolean inDebug= true;
		String xMsg= "exec ";

		drive.takeJoystickInputs(driveStation.getRightJoystick(),driveStation.getLeftJoystick());

		if(inDebug){

			for(int i=0; i<=x;i++){
				xMsg+="x";
			}

			x++;
			if(x==10){
				x=0;
			}
			SmartDashboard.putString("debug", xMsg);
		}

	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	protected void end() {
		drive.stop();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
		end();
	}
}
