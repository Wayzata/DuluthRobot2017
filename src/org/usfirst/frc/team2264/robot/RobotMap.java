package org.usfirst.frc.team2264.robot;
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
    
    public static final int rightStick = 0;
    public static final int leftStick = 1;
    public static final int gamepad = 2;
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
public class RightStickButtons {
//	public static final int RXAxis = 0;
	public static final int RYAxis = 1;
//	public static final int RZAxis = 2;
//	public static final int RZRotate =3;
	
	public static final int RtopRightButt = 3;
	public static final int RmidRightButt = 5;
	public static final int RbottomButt = 1;
	public static final int RmidLeftButt = 4;
	public static final int RtopLeftButt = 2;
	public static final int RbackButt = 0;
	public static final int RbackBottomButt = 6;
	
	
}
public class LeftStickButtons {
//	public static final int LXAxis = 0;
	public static final int LYAxis = 1;
//	public static final int LZRotate = 2;
//	public static final int LSlider = 3;
}
// can comment out gamepad if we don't use it
public class GamepadButtons {
	public static final int LXAxis = 0;
	public static final int LYAxis = 1;
	public static final int LTrigger = 2;
	public static final int RTrigger = 3;
	public static final int RXAxis = 4;
	public static final int RYAxis = 5;
	
	
	
	
	
}
}


