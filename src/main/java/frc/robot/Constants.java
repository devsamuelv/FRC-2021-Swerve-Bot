// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean constants. This class should not be used for any other
 * purpose. All constants should be declared globally (i.e. public static). Do
 * not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static final int frontLeftMotorCANID = 0;
  public static final int frontRightMotorCANID = 4;
  public static final int backLeftMotorCANID = 5;
  public static final int backRightMotorCANID = 3;

  public static final int frontLeftAngleCANID = 6;
  public static final int frontRightAngleCANID = 2;
  public static final int backLeftAngleCANID = 1;
  public static final int backRightAngleCANID = 8;

  public static final int CANCoderFrontLeftID = 20;
  public static final int CANCoderFrontRightID = 21;
  public static final int CANCoderBackLeftID = 22;
  public static final int CANCoderBackRightID = 23;

  public static final int baseJoystickID = 0;

  public static final double motorSpeed = 0.5;
  public static final double WIDTH = 0;
  public static final double HIGHT = 1;

  public static final double kI = 0;
  public static final double kP = 1;
  public static final double kB = 0;
}
