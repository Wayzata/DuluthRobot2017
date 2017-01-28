package org.usfirst.frc.team2264.robot.subsystems;

import org.usfirst.frc.team2264.controls.controls;

public interface Subsystem {


	/**
	 * An interface for any and all modules of the program.
	 * 
	 */
	
		/**
		 * Completes the task the module was designed to fulfill.
		 * @param controls The {@link Controls} object.
		 */
		public void control(controls controls);
		
		/**
		 * Resets the controller.
		 */
		public default void reset() {}
	}

