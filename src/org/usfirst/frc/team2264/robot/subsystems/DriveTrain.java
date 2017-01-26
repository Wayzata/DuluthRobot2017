
package org.usfirst.frc.team2264.robot.subsystems;

import org.usfirst.frc.team2264.controls.Axes;
import org.usfirst.frc.team2264.controls.controls;
import org.usfirst.frc.team2264.robot.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 * @author preetipidatala
 *
 */
public class DriveTrain extends Subsystem {
   private RobotDrive robotDrive2;
	private CANTalon leftMotor;
	private CANTalon rightMotor;
	//private controls drive;
	private Axes drive;
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
       //setDefaultCommand
    }
    public void takeJoystickInputs(double left, double right){
    	robotDrive2.tankDrive(left,right);
    }
    public void stop(){
    	robotDrive2.drive(0,0);
    }
    public void drive(Axes axes) {
		this.drive(axes.y);
	}
    public void drive(double speed) {
		SmartDashboard.putBoolean("driveTrain.brakes", false);
		SmartDashboard.putNumber("driveTrain.speed", speed);
    }
    public void control(controls controls) {
		if(controls.drive.isZero(0.2)) this.stop();
		else this.drive(controls.drive);
	}
}

