
package org.usfirst.frc.team4000.limitswitches.commands;

import org.usfirst.frc.team4000.limitswitches.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ExampleCommand extends Command {

	public ExampleCommand() {
		requires(Robot.exampleSubsystem);
	}

	@Override
	protected void end() {
	}

	@Override
	protected void execute() {
	}

	@Override
	protected void initialize() {
	}

	@Override
	protected void interrupted() {
	}

	@Override
	protected boolean isFinished() {
		return false;
	}
}
