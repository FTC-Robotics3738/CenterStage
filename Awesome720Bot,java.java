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
    
    frontRight.setDirection(DcMotor.Direction.REVERSE);
    backRight.setDirection(DcMotor.Direction.REVERSE);
    
    waitForStart();
    if (opModeIsActive()) {
      // Put run blocks here.
      warmWrist.setPosition(0);
      sleep(600);
      coolWrist.setPosition(0);
      
      while (opModeIsActive()) {
        // Put loop blocks here.

        telemetry.update();
        telemetry.addData("warmPosition", warmArm.getCurrentPosition());
        telemetry.addData("coolPosition", coolArm.getCurrentPosition());
        if(gamepad2.left_bumper){
          
          if(warmArm.getCurrentPosition()>=-1900){
            while(warmArm.getCurrentPosition()>=-2200){
              warmWrist.setPosition(0.7);
              warmArm.setTargetPosition(-2200);
              warmArm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
              warmArm.setPower(0.5);
            }
          }else if(warmArm.getCurrentPosition()<=-650 && warmArm.getCurrentPosition() > -300){
            while(warmArm.getCurrentPosition()<= -500 && warmArm.getCurrentPosition() > -300){
              warmWrist.setPosition(0.7);
              warmArm.setTargetPosition(-500);
              warmArm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
              warmArm.setPower(-0.5);
              warmWrist.setPosition(0);
            }
          }
        }
        
        if(gamepad2.right_bumper){
          
          if(coolArm.getCurrentPosition()<=1800){
            while(coolArm.getCurrentPosition()<=2000){
              coolWrist.setPosition(0.7);
              coolArm.setTargetPosition(2000);
              coolArm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
              coolArm.setPower(-0.5);
            }
          }else if(coolArm.getCurrentPosition()>=550){
            while(coolArm.getCurrentPosition()>= 0){
              coolWrist.setPosition(0.7);
              coolArm.setTargetPosition(0);
              coolArm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
              coolArm.setPower(0.5);
              coolWrist.setPosition(0);
            }
          }
        }

          turret.setPower(gamepad2.left_stick_x);
          turret.setPower(gamepad2.right_stick_x);


        if (gamepad1.y){
          launch.setPosition(0.7);
        }
        
        while (gamepad1.a){
          lift.setPower(1);
        }
        lift.setPower(0);
        
        while (gamepad1.b){
          lift.setPower(-1);
        }
        lift.setPower(0);
        
        while (gamepad2.y){
          warmArm.setPower(0.3);
        }
        warmArm.setPower(0);    

        while (gamepad2.x){
          coolArm.setPower(-0.3);
        }
        coolArm.setPower(0);

        if(gamepad2.a){
          coolArm.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        }

        if(gamepad2.b){
          warmArm.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        }
        
       while (gamepad1.x){
          coolClaw.setPosition(1.0);
        }
        coolClaw.setPosition(0.1);
    
        
        while (gamepad1.x) {
          warmClaw.setPosition(1.0);
        }
        warmClaw.setPosition(0.1);

        
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
