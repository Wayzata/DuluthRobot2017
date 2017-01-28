
package org.usfirst.frc.team2264.robot;

import java.util.Set; 

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SampleRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team2264.robot.subsystems.*;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 * 
 * @author preetipidatala
 *
 */
public class Robot extends IterativeRobot {
	public static DriveTrain driveTrain;
	public static RobotMap robotMap;
	public static OI oi;
	    RobotDrive myRobot;  // class that handles basic drive operations
	 Joystick leftStick;  // set to ID 1 in DriverStation
	    Joystick rightStick; // set to ID 2 in DriverStation
	  private CameraServer cameraServer;
	   public Command tankDrive;	    
	    public Robot() {
	        myRobot = new RobotDrive(RobotMap.leftDriveMotor, RobotMap.rightDriveMotor);
	        myRobot.setExpiration(0.1);
	        leftStick = new Joystick(RobotMap.leftStickPort);
	        rightStick = new Joystick(RobotMap.rightStickPort);
	        cameraServer = CameraServer.getInstance();
	        cameraServer.setQuality(50);
	        cameraServer.startAutomaticCapture("cam0");

	
	    }
		
	
	     
	   	    
	    /**
	     * Runs the motors with tank steering.
	     */
	    public void operatorControl() {
	        myRobot.setSafetyEnabled(true);
	        while (isOperatorControl() && isEnabled()) {
	        	myRobot.tankDrive(leftStick, rightStick);
	            Timer.delay(0.005);		// wait for a motor update time
	        }
	    }


	
	
	public static final Subsystem DriveTrain= new org.usfirst.frc.team2264.robot.subsystems.DriveTrain();

    Command autonomousCommand;
    SendableChooser chooser;

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
		oi = new OI();
        chooser = new SendableChooser();
        chooser.addDefault("Default Auto", new org.usfirst.frc.team2264.robot.subsystems.DriveTrain());
//        chooser.addObject("My Auto", new MyAutoCommand());
        SmartDashboard.putData("Auto mode", chooser);
        driveTrain= new DriveTrain();
        robotMap= new RobotMap();
    }
		/**
     * This function is called once each time the robot enters Disabled mode.
     * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
     */
    public void disabledInit(){

    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select between different autonomous modes
	 * using the dashboard. The sendable chooser code works with the Java SmartDashboard. If you prefer the LabVIEW
	 * Dashboard, remove all of the chooser code and uncomment the getString code to get the auto name from the text box
	 * below the Gyro
	 *
	 * You can add additional auto modes by adding additional commands to the chooser code above (like the commented example)
	 * or additional comparisons to the switch structure below with additional strings & commands.
	 */
    public void autonomousInit() {
        autonomousCommand = (Command) chooser.getSelected();
        
		/* String autoSelected = SmartDashboard.getString("Auto Selector", "Default");
		switch(autoSelected) {
		case "My Auto":
			autonomousCommand = new MyAutoCommand();
			break;
		case "Default Auto":
		default:
			autonomousCommand = new ExampleCommand();
			break;
		} */
    	
    	// schedule the autonomous command (example)
        if (autonomousCommand != null) autonomousCommand.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
		// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null) autonomousCommand.cancel();
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
