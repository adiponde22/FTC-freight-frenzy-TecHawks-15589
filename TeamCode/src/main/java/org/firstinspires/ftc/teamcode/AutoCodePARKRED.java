package org.firstinspires.ftc.teamcode;

import com.qualcomm.hardware.modernrobotics.ModernRoboticsI2cGyro;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;

@Autonomous (name = "AUTO_PARK_RED")
public class AutoCodePARKRED extends LinearOpMode{

    /* Declare OpMode members. */
    HardwareMapCode         robot   = new HardwareMapCode();   // Use a Pushbot's hardware
    private ElapsedTime     runtime = new ElapsedTime();


    static final double     COUNTS_PER_MOTOR_REV    = 1120 ;    // eg: TETRIX Motor Encoder
    static final double     DRIVE_GEAR_REDUCTION    = 1.0 ;     // This is < 1.0 if geared UP
    static final double     WHEEL_DIAMETER_INCHES   = 4.0 ;     // For figuring circumference
    static final double     COUNTS_PER_INCH         = (COUNTS_PER_MOTOR_REV * DRIVE_GEAR_REDUCTION) /
            (WHEEL_DIAMETER_INCHES * 3.1415);




    @Override
    public void runOpMode() {

        /*
         * Initialize the standard drive system variables.
         * The init() method of the hardware class does most of the work here
         */
        robot.init(hardwareMap);

        telemetry.update();

        // Ensure the robot is stationary, then reset the encoders and calibrate the gyro.
        robot.frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        robot.frontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        robot.backRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        robot.backLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        // Send telemetry message to alert driver that we are calibrating;
        telemetry.addData(">", "Calibrating Gyro");    //
        telemetry.update();

        telemetry.addData(">", "Robot Ready.");    //
        telemetry.update();

        robot.frontLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        robot.frontRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        robot.backRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        robot.backLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        waitForStart();
        sleep(1000);
        side();
        sleep(2000);
    }


    public void side ( ) {


        // Ensure that the opmode is still active
        if (opModeIsActive()) {

           driveBackwards(0.5, 500);


        }
    }
    public void driveForward(double x, int y)
    {
        for (long timeA = System.currentTimeMillis() + y; System.currentTimeMillis() < timeA;)
        {
            robot.frontLeft.setPower(x);
            robot.frontRight.setPower(x);
            robot.backLeft.setPower(x);
            robot.backRight.setPower(x);
        }


    }

    public void straifLeft(double x, int y)
    {

        for (long timeA = System.currentTimeMillis() + y; System.currentTimeMillis() < timeA;)
        {
            robot.frontLeft.setPower(-x);
            robot.frontRight.setPower(x);
            robot.backLeft.setPower(x);
            robot.backRight.setPower(-x);
        }

    }
    public void straifRight(double x, int y)
    {

        for (long timeA = System.currentTimeMillis() + y; System.currentTimeMillis() < timeA;)
        {
            robot.frontLeft.setPower(x);
            robot.frontRight.setPower(-x);
            robot.backLeft.setPower(-x);
            robot.backRight.setPower(x);
        }

    }
    public void driveBackwards(double x, int y)
    {

        for (long timeA = System.currentTimeMillis() + y; System.currentTimeMillis() < timeA;)
        {
            robot.frontLeft.setPower(-x);
            robot.frontRight.setPower(-x - 0.005 );
            robot.backLeft.setPower(-x);
            robot.backRight.setPower(-x - 0.005 );
        }

    }
    public void zeroPow(int y)
    {

        for (long timeA = System.currentTimeMillis() + y; System.currentTimeMillis() < timeA;)
        {

            robot.frontLeft.setPower(0);
            robot.frontRight.setPower(0);
            robot.backLeft.setPower(0);
            robot.backRight.setPower(0);
        }
    }

    public void duckSpinner(double x, int y)
    {
        for (long timeA = System.currentTimeMillis() + y; System.currentTimeMillis() < timeA;)
        {
            robot.duckSpin.setPower(x);
        }
    }


}
