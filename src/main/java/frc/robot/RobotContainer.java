// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;


public class RobotContainer {

    // Constants for Axes
    public static final int LeftStickX = 0;
    public static final int LeftStickY = 1;
    public static final int LeftTrigger = 2;
    public static final int RightTrigger = 3;
    public static final int RightStickX = 4;
    public static final int RightStickY = 5;

    // Constants for buttons
    public static final int ButtonA = 1;
    public static final int ButtonB = 2;
    public static final int ButtonX = 3;
    public static final int ButtonY = 4;
    public static final int LeftBumper = 5;
    public static final int RightBumper = 6;
    public static final int BackButton = 7;
    public static final int StartButton = 8;
    public static final int LeftStick = 9;
    public static final int RightStick = 10;

    public static final double ForwardAxisAttenuation = -0.5;
    public static final double LateralAxisAttenuation = 0.5;
    public static final double YawAxisAttenuation = 0.5;

    /* Subsystems */
    
    
    /* Commands */
    
    
    /* Controllers */
    Joystick controller; // Joystick 1

    /* Buttons */
    private JoystickButton spinMotor; // right bumper (driver controller)


    public RobotContainer() {
        configureButtonBindings();
        setupInstrumentation();
        buildAutoOptions();
    }

    private void configureButtonBindings() {
        /* Setting Controller Ports */
        if (controller == null) {
            System.out.println("Null driver controller, using joystick 1");
            controller = new Joystick(1);
        }

        /* Setting Buttons on Controllers */
        spinMotor = new JoystickButton(controller, ButtonB);

        /* Setting Commands of Buttons */
        shooterButton.onTrue(startShooterCmd).onFalse(stopShooterCmd);
    }
}
