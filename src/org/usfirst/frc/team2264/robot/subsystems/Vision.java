package org.usfirst.frc.team2264.robot.subsystems;

	import org.usfirst.frc.team2264.controls.controls;

import com.ni.vision.NIVision;
	import com.ni.vision.NIVision.Image;
	import com.ni.vision.NIVision.ImageType;

	import edu.wpi.first.wpilibj.CameraServer;
	

	/**
	 * Manages the camera, for display to the driver.
	 *
	 */
	public class Vision implements Subsystem {
		private Image frame;
		int cameraHandle;

		/**
		 * Constructs a vision instance based on a camera's name.
		 * @param cameraName The name of the camera.
		 */
		public Vision(String cameraName) {
			this.frame = NIVision.imaqCreateImage(ImageType.IMAGE_RGB, 0);
			this.cameraHandle = NIVision.IMAQdxOpenCamera(cameraName, NIVision.IMAQdxCameraControlMode.CameraControlModeController);
			NIVision.IMAQdxConfigureGrab(cameraHandle);
		}

		/**
		 * Retrieves a single frame from the camera and sends it to the
		 * SmartDashboard.
		 */
		@Override
		public void control(controls controls) {
			NIVision.IMAQdxGrab(this.cameraHandle, this.frame, 1);
			CameraServer.getInstance().setImage(this.frame);
		}
	}

