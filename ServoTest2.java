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
    
    @Override
    public void runOpMode() {
        a = hardwareMap.get(CRServo.class, "servo");
      
        waitForStart();
        
        a.setDirection(DcMotor.Direction.REVERSE);

        if (opModeIsActive()) {
            a.setPower(0);

            while(opModeIsActive()) {
                telemetry.addData("Left stick up/down position", gamepad1.left_stick_y);
                telemetry.update();
                a.setPower(gamepad1.left_stick_y);
            }
        }
    }
}    