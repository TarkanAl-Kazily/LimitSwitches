package org.usfirst.frc.team4000.limitswitches;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.interfaces.Potentiometer;

public class RobotMap {

    private static final int POT_CHANNEL = 0;
	private static final int SERVO_CHANNEL = 0;
	private static final int TALON_CHANNEL = 0;
	
	private static final double POT_SCALE = 360;

	private static final double POT_OFFSET = 30;

	public static DigitalInput limitSwitch;

    public static Potentiometer pot;
    
    public static Servo exampleServo;
    
    //public static Talon exampleTalon = new Talon(TALON_CHANNEL);
    
    public static void init() {
        limitSwitch = new DigitalInput(1);
        
        pot = new AnalogPotentiometer(POT_CHANNEL, POT_SCALE, POT_OFFSET);
        
        exampleServo = new Servo(SERVO_CHANNEL);
    }
}
