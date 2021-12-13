package org.firstinspires.ftc.teamcode;//package org.firstinspires.ftc.teamcode;
//
//import com.qualcomm.robotcore.eventloop.opmode.OpMode;
//import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
//import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
//import com.qualcomm.robotcore.hardware.DcMotor;
//import com.qualcomm.robotcore.hardware.DcMotorSimple;
//
//@TeleOp
//public class TeleOpCode extends OpMode {
//    DcMotor frontLeft;
//    DcMotor frontRight;
//    DcMotor backLeft;
//    DcMotor backRight;
//    DcMotor duckSpin;
//
//    public void moveDriveTrain() {
//            telemetry.addData("Status", "Running");
//            telemetry.update();
//
//            while ()
//
//            if (gamepad1.left_stick_y == 1)
//        {
//            frontLeft.setPower(1);
//            backLeft.setPower(1);
//            frontRight.setPower(-1);
//            backRight.setPower(-1);
//        }
//
//
//
//
//        frontLeft.setDirection(DcMotorSimple.Direction.FORWARD);
//        frontRight.setDirection(DcMotorSimple.Direction.REVERSE);
//        backLeft.setDirection(DcMotorSimple.Direction.FORWARD);
//        backRight.setDirection(DcMotorSimple.Direction.REVERSE);
//    }
//    @Override
//    public void init()
//    {
//        frontLeft = hardwareMap.get(DcMotor.class, "fontLeft");
//        frontRight = hardwareMap.get(DcMotor.class, "frontRight");
//        backLeft = hardwareMap.get(DcMotor.class, "backLeft");
//        backRight = hardwareMap.get(DcMotor.class, "backRight");
//        duckSpin = hardwareMap.get(DcMotor.class, "duckSpin");
//    }
//
//    @Override
//    public void init_loop()
//    {
//
//    }
//
//
//    @Override
//    public void loop()
//    {
//
//    }
//}
