package org.usfirst.frc.team4000.limitswitches.commands;

import org.usfirst.frc.team4000.limitswitches.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class PotServoControl extends Command {

	public PotServoControl()
	{
		requires(Robot.potServo);
	}
	
	private double potValue;
	
	@Override
	protected void initialize() {
		potValue = 0;
		System.out.println("Starting PotServoControl Command");
	}

	@Override
	protected void execute() {
		potValue = Robot.potServo.readPot();
		System.out.println(potValue);
		Robot.potServo.setServo(potValue);
	}

	@Override
	protected boolean isFinished() {
		//Shouldn't finish
		return false;
	}

	@Override
	protected void end() {
		System.out.println("Ending PotServoControl Command");
	}

	@Override
	protected void interrupted() {
		System.out.println("Interrupting PotServoControl Command");
	}

}
