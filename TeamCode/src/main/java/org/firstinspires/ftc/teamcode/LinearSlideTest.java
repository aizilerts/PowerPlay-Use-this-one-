package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class LinearSlideTest extends LinearOpMode {

    private DcMotor linearSlideMotor;

    @Override
    public void runOpMode() throws InterruptedException {

        linearSlideMotor = hardwareMap.get(DcMotor.class, "linearSlideMotor");
        linearSlideMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        waitForStart();

        while (opModeIsActive()) {
            if (gamepad1.dpad_up) {
                linearSlideMotor.setPower(0.1);
            } else if (gamepad1.dpad_down) {
                linearSlideMotor.setPower(-0.1);
            } else {
                linearSlideMotor.setPower(0);
            }
        }
    }
}
