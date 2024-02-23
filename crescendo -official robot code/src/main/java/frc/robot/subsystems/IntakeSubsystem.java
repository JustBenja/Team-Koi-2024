// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase {
  private CANSparkMax intakeMotor;
  /** Creates a new IntakeSubsystem. */
  public IntakeSubsystem() {
    this.intakeMotor = new CANSparkMax(13, MotorType.kBrushless);

  }

  public void intake()
  {
    intakeMotor.set(-1);
  }

  public void outake()
  {
    intakeMotor.set(1);

  }

  public void stop()
  {
    intakeMotor.set(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}