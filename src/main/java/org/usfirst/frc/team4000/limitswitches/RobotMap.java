package org.usfirst.frc.team4000.limitswitches;

import edu.wpi.first.wpilibj.DigitalInput;

public class RobotMap {
	
    public static DigitalInput limitSwitch;
	
	public static void init() {
	    limitSwitch = new DigitalInput(1);
	}
}
