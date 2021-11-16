package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp
public class TeleOpCode extends OpMode
{
    DcMotor frontLeft;
    DcMotor frontRight;
    DcMotor backLeft;
    DcMotor backRight;
    DcMotor duckSpin;

    public  void moveDriveTrain()
    {
        double vertical;
        double horizontal;
        double pivot;
        double cSpinner;
        vertical = gamepad1.left_stick_y;
        horizontal = gamepad1.left_stick_x;
        pivot = gamepad1.right_stick_x;
        cSpinner = gamepad1.right_trigger;

        frontLeft.setPower(pivot + (- vertical - horizontal));
        backLeft.setPower(pivot + (- vertical + horizontal));
        frontRight.setPower(pivot + (- vertical + horizontal));
        backRight.setPower(pivot + (- vertical - horizontal));

        frontLeft.setDirection(DcMotorSimple.Direction.FORWARD);
        frontRight.setDirection(DcMotorSimple.Direction.REVERSE);
        backLeft.setDirection(DcMotorSimple.Direction.FORWARD);
        backRight.setDirection(DcMotorSimple.Direction.REVERSE);
    }
    @Override
    public void init()
    {
        frontLeft = hardwareMap.get(DcMotor.class, "fontLeft");
        frontRight = hardwareMap.get(DcMotor.class, "frontRight");
        backLeft = hardwareMap.get(DcMotor.class, "backLeft");
        backRight = hardwareMap.get(DcMotor.class, "backRight");
        duckSpin = hardwareMap.get(DcMotor.class, "duckSpin");
    }

    @Override
    public void init_loop()
    {

    }


    @Override
    public void loop()
    {

    }
}
