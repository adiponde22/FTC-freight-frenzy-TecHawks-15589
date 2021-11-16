package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Hardware;

public class HardwareMapCode {
    //create motors
    public DcMotor frontLeft = null;
    public DcMotor frontRight = null;
    public DcMotor backLeft = null;
    public DcMotor backRight = null;
    public DcMotor duckSpin = null;

    //additional variables
    HardwareMap hardwareMap = null;
    public ElapsedTime runtime = new ElapsedTime();


    public HardwareMapCode(HardwareMap hwMap) {
        initialize(hwMap);

    }

    private void initialize(HardwareMap hwMap)
    {
        hardwareMap = hwMap;

        //Motor initialization
        frontLeft = hardwareMap.get(DcMotor.class, "fontLeft");
        frontRight = hardwareMap.get(DcMotor.class, "frontRight");
        backLeft = hardwareMap.get(DcMotor.class, "backLeft");
        backRight = hardwareMap.get(DcMotor.class, "backRight");
        duckSpin = hardwareMap.get(DcMotor.class, "duckSpin");

        //Set motor directions for movement
        frontLeft.setDirection(DcMotorSimple.Direction.FORWARD);
        frontRight.setDirection(DcMotorSimple.Direction.REVERSE);
        backLeft.setDirection(DcMotorSimple.Direction.FORWARD);
        backRight.setDirection(DcMotorSimple.Direction.REVERSE);
        duckSpin.setDirection(DcMotorSimple.Direction.REVERSE);


        // Set motor modes, don't use encoders yet so run without encoders
        //encoders for tracking motor position
        frontLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        frontRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        backLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        backRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        duckSpin.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        //set ZERO power behavior
        frontLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        frontRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        duckSpin.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        //set motors to use no power
        frontLeft.setPower(0);
        frontRight.setPower(0);
        backLeft.setPower(0);
        backRight.setPower(0);
        duckSpin.setPower(0);

    }


}
