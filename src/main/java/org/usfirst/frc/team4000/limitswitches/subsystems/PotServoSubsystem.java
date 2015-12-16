package org.usfirst.frc.team4000.limitswitches.subsystems;

import org.usfirst.frc.team4000.limitswitches.RobotMap;
import org.usfirst.frc.team4000.limitswitches.commands.PotServoControl;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.interfaces.Potentiometer;

public class PotServoSubsystem extends Subsystem {

	private Potentiometer pot = RobotMap.pot;
	
	private Servo servo = RobotMap.exampleServo;
	
    @Override
    public void initDefaultCommand()
    {
    	setDefaultCommand(new PotServoControl());
    }
    
    public double readPot()
    {
    	return pot.get();
    }
    
    public void setServo(double deg)
    {
    	servo.set(deg);
    }
    
}
