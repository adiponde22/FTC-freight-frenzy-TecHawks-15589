package org.firstinspires.ftc.teamcode;

import android.os.Handler;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;



@TeleOp(name="Ahen Main2", group="Neha")
// @Disabled
public class TeleopNew extends LinearOpMode {

    final double    CLAW_SPEED      = 0.02 ;                   // sets rate to move servo

    /* Declare OpMode members. */
    HardwareMapCode robot = new HardwareMapCode();   // Use a Redbot's hardware


    private ElapsedTime     runtime = new ElapsedTime();

    @Override
    public void runOpMode() {
        robot.init(hardwareMap);
        /* Initialize the hardware variables.
         * The init() method of the hardware class does all the work here
         */
//        robot.detector.disable();
        // Send telemetry, message to signify robot waiting;
        telemetry.addData("Remember", "\"May the force of Reema, Miki, Neha, Ivan, Aarav, Marc, Albert and Abhi be with you.\" ");
        telemetry.update();

        // Which idiot wrote the documentation for this code? I have no idea what I'm doing - Ihba

        // Wait for the game to start (driver presses PLAY)
        waitForStart();

        // run until the end of the match (driver presses STOP)
        while (opModeIsActive()) {


            // Run wheels in POV mode (note: The joystick goes negative when pushed forwards, so negate it)

            // Convert joysticks to desired motion
            Mecanum.Motion motion = Mecanum.joystickToMotion(
                    gamepad1.left_stick_x, -gamepad1.left_stick_y,
                    gamepad1.right_stick_x, -gamepad1.right_stick_y);

            // Convert desired motion to wheel powers, with power clamping
            Mecanum.Wheels wheels = Mecanum.motionToWheels(motion);
            robot.frontLeft.setPower(wheels.frontLeft);
            robot.frontRight.setPower(wheels.frontRight);
            robot.backLeft.setPower(wheels.backLeft);
            robot.backRight.setPower(wheels.backRight);

            telemetry.addData("Motor speeds", "robot.frontLeft.getPower(), robot.frontRight.getPower(), robot.backLeft.getPower(), robot.backRight.getPower()", robot.backRight.getPower(),robot.backLeft.getPower(), robot.frontRight.getPower(),robot.frontLeft.getPower());
            telemetry.update();




            //set duck spinner motor to stop when buttons A and B are not being pressed
            if (!gamepad1.a && !gamepad1.b)
            {
                robot.duckSpin.setPower(0);
            }
            //spin clockwise
            if (gamepad1.a) {
                robot.duckSpin.setPower(-0.4);
            }
            //spin counter clockwise
            if (gamepad1.b) {
                robot.duckSpin.setPower(0.4);
            }


        }
    }
}

