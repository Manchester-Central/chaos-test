package org.usfirst.frc.team131.robot;

import edu.wpi.first.wpilibj.Talon;

public class DriveBase {
	final Talon frontLeft = new Talon(0);
	final Talon frontRight = new Talon(2);
	final Talon backLeft = new Talon(1);
	final Talon backRight = new Talon(3);
	
	public void setDriveSpeed(double left, double right){
		this.frontLeft.set(-getMaxSpeed(left));
		this.frontRight.set(getMaxSpeed(right));
		this.backLeft.set(-getMaxSpeed(left));
		this.backRight.set(getMaxSpeed(right));	
	}
	private double getMaxSpeed(double value) {
		return (Math.abs(value)/value) * Math.min(Math.abs(value), 0.1);
	}
	
}
