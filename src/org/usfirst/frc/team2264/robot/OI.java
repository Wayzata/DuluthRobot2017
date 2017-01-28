package org.usfirst.frc.team2264.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    Joystick rightStick = new Joystick(RobotMap.rightStickPort);
    Joystick leftStick = new Joystick(RobotMap.leftStickPort);
    
    Button RtopRightButt = new JoystickButton(rightStick, RobotMap.RightStickButtons.RtopRightButtNumber);
    Button RtopMidTopButt = new JoystickButton(rightStick, RobotMap.RightStickButtons.RtopMidTopButtNumber);
    Button RtopBottomButt = new JoystickButton(rightStick, RobotMap.RightStickButtons.RtopBottomButtNumber);
    Button RtopLeftButt = new JoystickButton(rightStick, RobotMap.RightStickButtons.RtopLeftButtNumber);
    Button RbackButt = new JoystickButton(rightStick, RobotMap.RightStickButtons.RbackButtNumber);
    Button RbottomLeftBottomButt = new JoystickButton(rightStick, RobotMap.RightStickButtons.RbottomLeftBottomButtNumber);
    Button RbottomLeftTopButt = new JoystickButton(rightStick, RobotMap.RightStickButtons.RbottomLeftTopButtNumber);
    Button RbottomRightBottomButt = new JoystickButton(rightStick, RobotMap.RightStickButtons.RbottomRightBottomButtNumber);
    Button RbottomRightTopButt = new JoystickButton(rightStick, RobotMap.RightStickButtons.RbottomRightTopButtNumber);
    Button RbottomLeftButt = new JoystickButton(rightStick, RobotMap.RightStickButtons.RbottomLeftButtNumber);
    Button RbottomRightButt = new JoystickButton(rightStick, RobotMap.RightStickButtons.RbottomRightButtNumber);
    
    Button LtopRightButt = new JoystickButton(leftStick, RobotMap.LeftStickButtons.LtopRightButtNumber);
    Button LtopMidTopButt = new JoystickButton(leftStick, RobotMap.LeftStickButtons.LtopMidTopButtNumber);
    Button LtopBottomButt = new JoystickButton(leftStick, RobotMap.LeftStickButtons.LtopBottomButtNumber);
    Button LtopLeftButt = new JoystickButton(leftStick, RobotMap.LeftStickButtons.LtopLeftButtNumber);
    Button LbackButt = new JoystickButton(leftStick, RobotMap.LeftStickButtons.LbackButtNumber);
    Button LbottomLeftBottomButt = new JoystickButton(leftStick, RobotMap.LeftStickButtons.LbottomLeftBottomButtNumber);
    Button LbottomLeftTopButt = new JoystickButton(leftStick, RobotMap.LeftStickButtons.LbottomLeftTopButtNumber);
    Button LbottomRightBottomButt = new JoystickButton(leftStick, RobotMap.LeftStickButtons.LbottomRightBottomButtNumber);
    Button LbottomRightTopButt = new JoystickButton(leftStick, RobotMap.LeftStickButtons.LbottomRightTopButtNumber);
    Button LbottomLeftButt = new JoystickButton(leftStick, RobotMap.LeftStickButtons.LbottomLeftButtNumber);
    Button LbottomRightButt = new JoystickButton(leftStick, RobotMap.LeftStickButtons.LbottomRightButtNumber);
    
    public double getLeftStick(){
    	return leftStick.getY(GenericHID.Hand.kLeft);
    }
    
    public double getRightStick(){
    	return rightStick.getY(GenericHID.Hand.kRight);
    }


    // Button button = new JoystickButton(stick, buttonNumber);
    
		// TODO Auto-generated method stub
		
		public double getLeftJoystick(){
	        return leftStick.getY();
	        }
	        public double getRightJoystick(){
	      return rightStick.getY();
	        }
}

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


