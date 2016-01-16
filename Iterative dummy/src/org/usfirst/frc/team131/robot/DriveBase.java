package org.usfirst.frc.team131.robot;

import edu.wpi.first.wpilibj.Talon;

public class DriveBase {
	final Talon frontLeft = new Talon(1);
	final Talon frontRight = new Talon(2);
	final Talon backLeft = new Talon(3);
	final Talon backRight = new Talon(4);
	
	public void setDriveSpeed(double left, double right){
		this.frontLeft.set(left);
		this.frontRight.set(right);
		this.backLeft.set(left);
		this.backRight.set(right);	
	}
	
}
