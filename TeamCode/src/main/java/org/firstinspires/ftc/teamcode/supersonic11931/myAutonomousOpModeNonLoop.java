package org.firstinspires.ftc.teamcode.supersonic11931;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.util.ElapsedTime;
import java.lang.InterruptedException;


/**
 * This IS an opmode.
 * THIS IS THE MAIN CLASS FOR TEAM SUPERSONIC'S AUTONOMOUS MODE
 *
 **/
@Autonomous(name="Supersonic Autonomous Mode (Non-Loop)", group ="Supersonic")
// @Disabled
public class myAutonomousOpModeNonLoop extends LinearOpMode {

    private SupersonicRuckusRobot myRobot;
    private ElapsedTime runtime = new ElapsedTime(); // timer
    private final int AUTONOMOUS_DURATION = 30;

    @Override public void runOpMode() throws InterruptedException {

        telemetry.addData("Status", "Ruckus Robot starting...");
        telemetry.update();

        myRobot = new SupersonicRuckusRobot(this.hardwareMap); // instantiate robot object
        telemetry.addData("Status", "Ruckus Robot successfully INITIALIZED; waiting for start");
        telemetry.update();

        this.waitForStart(); // Wait for driver to press PLAY from driver station
        runtime.reset(); // start the timer
        telemetry.addData("Status", "Ruckus Robot RUNNING in Autonomous Mode");
        telemetry.update();


        //When play is pressed, run motor to lower robot to ground
        //Robot.land.lowerFromLander();
        //sleep(3000);

        myRobot.drive.driveManual(0.5f, 0.0f, 0.0f);
        sleep(2000);

        myRobot.drive.driveManual(0.0f, 0.4f, 0.4f);
        sleep(1000);

        myRobot.drive.driveManual(0.5f, 0.0f, 0.0f);
        sleep(4000);




        myRobot.drive.driveManual(0.0f, 0.0f, 0.0f);

        myRobot.shutDown();
        telemetry.addData("Status", "Ruckus Robot successfully SHUT DOWN");
        telemetry.update();
    }


}
