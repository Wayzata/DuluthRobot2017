package org.usfirst.frc.team2264.controls;

//import xyz.remexre.robotics.frc2016.controls.Axes;

/**
 * @author preetipidatala
 *
 */
public class Axes {
		public double x, y;

		public Axes(double x, double y) {
			this.x = x;
			this.y = y;
		}

		public boolean isZero() { 
		return this.isZero(0.1); 
		}
		public boolean isZero(double cutoff) {
			return Math.abs(this.x) < cutoff && Math.abs(this.y) < cutoff;
		}
		
		public Axes zeroIf(double cutoff) {
			if(this.isZero(cutoff)) return new Axes(0, 0);
			else return this;
		}
}