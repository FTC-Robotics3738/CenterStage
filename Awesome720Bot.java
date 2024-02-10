package Centerstage;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "Awesome720Bot")
public class Awesome720Bot extends LinearOpMode {

  private DcMotor frontLeft;
  private DcMotor backLeft;
  private DcMotor frontRight;
  private DcMotor backRight;
  private DcMotor warmArm;
  private DcMotor coolArm;
  private DcMotor turret;
  private DistanceSensor distance;
  private DcMotor lift;
  private Servo warmClaw;
  private Servo coolClaw;
  private Servo warmWrist;
  private Servo coolWrist;
  private Servo launch;

  /**
   * This function is executed when this OpMode is selected from the Driver Station.
   */
  @Override
  public void runOpMode() {
    launch = hardwareMap.get(Servo.class, "launch");
    coolClaw = hardwareMap.get(Servo.class, "coolClaw");
    warmClaw = hardwareMap.get(Servo.class, "warmClaw");
    warmWrist = hardwareMap.get(Servo.class, "warmWrist");
    coolWrist = hardwareMap.get(Servo.class, "coolWrist");
    warmArm = hardwareMap.get(DcMotor.class, "warmArm");
    coolArm = hardwareMap.get(DcMotor.class, "coolArm");
    frontLeft = hardwareMap.get(DcMotor.class, "frontLeft");
    backLeft= hardwareMap.get(DcMotor.class, "backLeft");
    frontRight = hardwareMap.get(DcMotor.class, "frontRight");
    backRight = hardwareMap.get(DcMotor.class, "backRight");
    turret = hardwareMap.get(DcMotor.class, "turret");
    distance = hardwareMap.get(DistanceSensor.class, "Distance");
    lift = hardwareMap.get(DcMotor.class, "lift");


    // Put initialization blocks here.
    
    //warmArm.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    //coolArm.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    
    frontLeft.setDirection(DcMotor.Direction.REVERSE);
    backLeft.setDirection(DcMotor.Direction.REVERSE);
    
    waitForStart();
    if (opModeIsActive()) {
      // Put run blocks here.
      while (opModeIsActive()) {
        // Put loop blocks here.

        telemetry.update();
        telemetry.addData("warmPosition", warmArm.getCurrentPosition());
        telemetry.addData("coolPosition", coolArm.getCurrentPosition());

        if(gamepad1.left_bumper){
          
          if(warmArm.getCurrentPosition()>=-1900){
            while(warmArm.getCurrentPosition()>=-2200){
              warmWrist.setPosition(0.7);
              warmArm.setTargetPosition(-2200);
              warmArm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
              warmArm.setPower(0.5);
            }
          }else if(warmArm.getCurrentPosition()<=-650){
            while(warmArm.getCurrentPosition()<= -500){
              warmWrist.setPosition(0.7);
              warmArm.setTargetPosition(-500);
              warmArm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
              warmArm.setPower(-0.5);
            }
          }
        }
        
        if(gamepad1.right_bumper){
          
          if(coolArm.getCurrentPosition()>=-1900){
            while(coolArm.getCurrentPosition()>=-2200){
              coolWrist.setPosition(0.7);
              coolArm.setTargetPosition(-2200);
              coolArm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
              coolArm.setPower(0.5);
            }
          }else if(coolArm.getCurrentPosition()<=-650){
            while(coolArm.getCurrentPosition()<= -500){
              coolWrist.setPosition(0.7);
              coolArm.setTargetPosition(-500);
              coolArm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
              coolArm.setPower(-0.5);
            }
          }
        }
        
        while (gamepad1.a){
          turret.setPower(1);
        }
        turret.setPower(0);

        while (gamepad1.b){
          turret.setPower(-1);
        }
        turret.setPower(0);

        while (gamepad1.y){
          warmArm.setPower(0.3);
        }
        warmArm.setPower(0);    

        while (gamepad1.x){
          coolArm.setPower(0.3);
        }
        coolArm.setPower(0);

        if(gamepad1.right_trigger){
          coolArm.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER)
        }

        if(gamepad1.right_trigger){
          warmArm.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        }
        
        // Forwards and Back on Left Stick using the Y-axis
        frontLeft.setPower(gamepad1.left_stick_y);
        backLeft.setPower(gamepad1.left_stick_y);
        frontRight.setPower(-gamepad1.left_stick_y);
        backRight.setPower(-gamepad1.left_stick_y);
        // Strafing on Right Stick using the X-axis
        // Move the stick right and left for the robot to slide right and left
        frontLeft.setPower(-gamepad1.left_stick_x);
        backLeft.setPower(gamepad1.left_stick_x);
        frontRight.setPower(-gamepad1.left_stick_x);
        backRight.setPower(gamepad1.left_stick_x);
        // Turning on Left Joystick using X-Axis
        frontLeft.setPower(gamepad1.right_stick_x);
        backLeft.setPower(gamepad1.right_stick_x);
        frontRight.setPower(gamepad1.right_stick_x);
        backRight.setPower(gamepad1.right_stick_x);
      }
    }
  }
}
