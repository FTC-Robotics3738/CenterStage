// hello world

package Centerstage;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "ServoTest2") 
public class ServoTest2 extends LinearOpMode {

    private CRServo a;
	boolean clockwise;
	double limit;
    
    @Override
    public void runOpMode() {
        a = hardwareMap.get(CRServo.class, "servo");
      
        waitForStart();

		// initialization goes here, ex. reverse motor direction

        a.setDirection(DcMotor.Direction.REVERSE);
		clockwise = true;
		gamepad1.RumbleEffect = 0;

        if (opModeIsActive()) {
            a.setPower(0);

            while(opModeIsActive()) {
                telemetry.addData("Left stick up/down position", gamepad1.left_stick_y);
				telemetry.addData("Clockwise", clockwise);
				telemetry.addData("Limit", limit);
                telemetry.update();
                a.setPower(gamepad1.left_stick_y);
				limit = (gamepad1.RumbleEffect);

				if (gamepad1.b) {
					a.setDirection(DcMotor.Direction.FORWARD);
					clockwise = false;
				}

				if (gamepad1.a) {
					a.setDirection(DcMotor.Direction.REVERSE);
					clockwise = true;
				}

				if (gamepad1.y) {
					if (a.getPower >= 0 && a.getPower <= 1);
						a.setPower(getPower -= 0.1);
						limit -= 0.1;
				}

				if (gamepad1.x) {
					if (a.getPower >= 0 && a.getPower <= 1);
						a.setPower(getPower += 0.1);
						limit += 0.1;
				}
				
				if (gamepad1.right_bumper) {
					(gamepad1.RumbleEffect) = 0;
				}

				if (gamepad1.left_bumper) {
					limit = (gamepad1.RumbleEffect);
				}

            }

        }
    }
}    