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
    
    public static final int joystick = 0;
    public static final int gamepad = 1;
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
public class JoystickButtons {
	public static final int XAxis = 0;
	public static final int YAxis = 1;
	public static final int ZAxis = 2;
	public static final int ZRotate =3;
	
	public static final int topRightButt = 3;
	public static final int midRightButt = 5;
	public static final int bottomButt = 1;
	public static final int midLeftButt = 4;
	public static final int topLeftButt = 2;
	public static final int backButt = 0;
	public static final int backBottomButt = 6;
	
	
}

public class GamepadButtons {
	public static final int LXAxis = 0;
	public static final int LYAxis = 1;
	public static final int LTrigger = 2;
	public static final int RTrigger = 3;
	public static final int RXAxis = 4;
	public static final int RYAxis = 5;
	
	
	
}
}


