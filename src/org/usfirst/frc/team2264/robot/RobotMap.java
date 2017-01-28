package org.usfirst.frc.team2264.robot;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    public static final int shooterMotor = 0;
    public static final int collectorMotor = 0;
    public static final int leftDriveMotor = 2;
    public static final int rightDriveMotor = 1;
    public static final int ropeMotorLeft = 0;
    public static final int ropeMotorRight = 0;
    
    public static final int rightStickPort = 0;
    public static final int leftStickPort = 1;
//    public static final int gamepadNumber = 2;
    public static final int XboxController = 2; 
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
public class RightStickButtons {
//	public static final int RXAxis = 0;
	public static final int RYAxis = 1;
//	public static final int RZAxis = 2;
//	public static final int RZRotate =3;
	

	
    public static final int RtopRightButtNumber = 4;
    public static final int RtopMidTopButtNumber = 2;
    public static final int RtopBottomButtNumber = 1;
    public static final int RtopLeftButtNumber = 3;
    public static final int RbackButtNumber = 0;
    public static final int RbottomLeftBottomButtNumber = 6;
    public static final int RbottomLeftTopButtNumber = 5;
    public static final int RbottomRightBottomButtNumber = 9;
    public static final int RbottomRightTopButtNumber = 10;
    public static final int RbottomLeftButtNumber = 7;
    public static final int RbottomRightButtNumber = 8;
	
	
}
public class LeftStickButtons {
//	public static final int LXAxis = 0;
	public static final int LYAxis = 1;
//	public static final int LZRotate = 2;
//	public static final int LSlider = 3;
	
    public static final int LtopRightButtNumber = 4;
    public static final int LtopMidTopButtNumber = 2;
    public static final int LtopBottomButtNumber = 1;
    public static final int LtopLeftButtNumber = 3;
    public static final int LbackButtNumber = 0;
    public static final int LbottomLeftBottomButtNumber = 6;
    public static final int LbottomLeftTopButtNumber = 5;
    public static final int LbottomRightBottomButtNumber = 9;
    public static final int LbottomRightTopButtNumber = 10;
    public static final int LbottomLeftButtNumber = 7;
    public static final int LbottomRightButtNumber = 8;
	
}
// can comment out gamepad if we don't use it
/** public class GamepadButtons {
	public static final int LXAxisNumbers = 0;
	public static final int LYAxisNumber = 1;
	public static final int LTriggerNumber = 2;
	public static final int RTriggerNumber = 3;
	public static final int RXAxisNumber = 4;
	public static final int RYAxisNumber = 5;
	
	public static final int AButtNumber = 0;
	public static final int BButtNumber = 1;
	public static final int XButtNumber = 2;
	public static final int YButtNumber = 3;
	public static final int 
	
	
	
**/	
	
}



