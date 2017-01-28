package org.usfirst.frc.team2264.robot.subsystems;

import java.util.function.Consumer;

import org.usfirst.frc.team2264.controls.Axes;

//import xyz.remexre.robotics.frc2016.controls.Controls;

//import xyz.remexre.robotics.frc2016.controls.Axes;

public class JoystickTank {

	public Axes drive;

	public JoystickTank (){
		drive = new Axes(0, 0);
	}
	
	/**
	 * Maps the state of the drive axes to a function that mutates the controls
	 * object.
	 * @param driveAxes The drive axes.
	 * @return The mutating function.
	 */
	//public Consumer<Controls> mapDriveAxes(Axes driveAxes) { return (c) -> {}; }

	
}
