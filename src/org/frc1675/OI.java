
package org.frc1675;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.DigitalIOButton;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    
    public static final int A_BUTTON = 1;
    public static final int B_BUTTON = 2;
    public static final int X_BUTTON = 3;
    public static final int Y_BUTTON = 4;
    public static final int LEFT_BUMPER = 5;
    public static final int RIGHT_BUMPER = 6;
    
    public Joystick driverController = new Joystick(RobotMap.DRIVER_CONTROLLER);
    public Joystick operatController = new Joystick(RobotMap.OPERATOR_CONTROLLER);
    
    private Button driverLBumper = new JoystickButton(driverController, LEFT_BUMPER);
    private Button driverRBumper = new JoystickButton(driverController, RIGHT_BUMPER);
    private Button driverYButton = new JoystickButton(driverController, Y_BUTTON);
    private Button driverAButton = new JoystickButton(driverController, A_BUTTON);
    private Button driverXButton = new JoystickButton(driverController, X_BUTTON);
    private Button driverBButton = new JoystickButton(driverController, B_BUTTON);
    
    private Button operatYButton = new JoystickButton(operatController, Y_BUTTON);
    private Button operatAButton = new JoystickButton(operatController, A_BUTTON);
    private Button operatXButton = new JoystickButton(operatController, X_BUTTON);
    private Button operatBButton = new JoystickButton(operatController, B_BUTTON);
    private Button operatLBumper = new JoystickButton(operatController, LEFT_BUMPER);
    private Button operatRBumper = new JoystickButton(operatController, RIGHT_BUMPER);
    
    
    
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // Another type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand()); lolz
}

