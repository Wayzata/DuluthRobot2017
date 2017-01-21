
package org.usfirst.frc.team2264.robot.subsystems;

import org.usfirst.frc.team2264.robot.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
   private RobotDrive robotDrive2;
	private CANTalon leftMotor;
	private CANTalon rightMotor;
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void takeJoystickInputs(double left, double right){
    	robotDrive2.tankDrive(left,right);
    }
    public void stop(){
    	robotDrive2.drive(0,0);
    }
}

