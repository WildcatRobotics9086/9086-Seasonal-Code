package frc.robot.subsystems;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.commands.Auto;


public class AutoSubsystem extends SubsystemBase {
    public void runAuto() {
        new InstantCommand(() -> SmartDashboard.putString("Auto Status", "0.2 Auto Command Recieved"));
        // Commands.print("Test.");
    }
}
