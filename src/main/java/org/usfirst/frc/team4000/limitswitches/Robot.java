package org.usfirst.frc.team4000.limitswitches;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import org.usfirst.frc.team4000.limitswitches.commands.ExampleCommand;
import org.usfirst.frc.team4000.limitswitches.subsystems.PotServoSubsystem;

public class Robot extends IterativeRobot {

    public static PotServoSubsystem potServo = null;
    
    public static OI oi;

    Command autonomousCommand;

    @Override
    public void autonomousInit() {
        if (autonomousCommand != null) {
            autonomousCommand.start();
        }
    }

    @Override
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    @Override
    public void disabledInit() {

    }

    @Override
    public void disabledPeriodic() {
        Scheduler.getInstance().run();
    }

    @Override
    public void robotInit() {
        oi = new OI();
        RobotMap.init();
        //autonomousCommand = new ExampleCommand();
        potServo = new PotServoSubsystem();
    }

    @Override
    public void teleopInit() {
        if (autonomousCommand != null) {
            autonomousCommand.cancel();
        }
    }

    @Override
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }

    @Override
    public void testPeriodic() {
        LiveWindow.run();
    }
}
