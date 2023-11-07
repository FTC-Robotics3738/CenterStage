package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name = "Blueautom2(Blocks to Java)", preselectTeleOp = "Starter Bot 2024")
public class Blueautom extends LinearOpMode {

  private DcMotor leftDrive;
  private DcMotor rightDrive;

  /**
   * This function is executed when this OpMode is selected from the Driver Station.
   */
  @Override
  public void runOpMode() {
    leftDrive = hardwareMap.get(DcMotor.class, "leftDrive");
    rightDrive = hardwareMap.get(DcMotor.class, "rightDrive");

    // Put initialization blocks here.
    waitForStart();
    if (opModeIsActive()) {
      //position 2
      leftDrive.setPower(-0.5);
      rightDrive.setPower(0.5);
      sleep(800);
      leftDrive.setPower(0.5);
      rightDrive.setPower(-0.5);
      sleep(600);
      leftDrive.setPower(0.5);
      rightDrive.setPower(0.5);
      sleep(1300);
      leftDrive.setPower(-0.5);
      rightDrive.setPower(0.5);
      sleep(500);
    
      
      //position1
      /*
      leftDrive.setPower(-0.5);
      rightDrive.setPower(0.5);
      sleep(300);
      leftDrive.setPower(-0.5);
      rightDrive.setPower(-0.5);
      sleep(650);
      leftDrive.setPower(-0.5);
      rightDrive.setPower(0.5);
      sleep(300);
      leftDrive.setPower(0.5);
      rightDrive.setPower(-0.5);
      sleep(300);
      leftDrive.setPower(0.5);
      rightDrive.setPower(0.5);
      sleep(650);
      leftDrive.setPower(0.5);
      rightDrive.setPower(-0.5);
      sleep(200);
      leftDrive.setPower(0.5);
      rightDrive.setPower(0.5);
      sleep(1300);
      leftDrive.setPower(-0.5);
      rightDrive.setPower(0.5);
      sleep(500);
      */
      
      
      //position3
      /*
      leftDrive.setPower(-0.5);
      rightDrive.setPower(0.5);
      sleep(300);
      leftDrive.setPower(0.5);
      rightDrive.setPower(0.5);
      sleep(650);
      leftDrive.setPower(-0.5);
      rightDrive.setPower(0.5);
      sleep(300);
      leftDrive.setPower(0.5);
      rightDrive.setPower(-0.5);
      sleep(300);
      leftDrive.setPower(-0.5);
      rightDrive.setPower(-0.5);
      sleep(650);
      leftDrive.setPower(0.5);
      rightDrive.setPower(-0.5);
      sleep(200);
      leftDrive.setPower(0.5);
      rightDrive.setPower(0.5);
      sleep(1300);
      leftDrive.setPower(-0.5);
      rightDrive.setPower(0.5);
      sleep(500);
      */
      
      // Put run blocks here.
      while (opModeIsActive()) {
        // Put loop blocks here.
        telemetry.update();
      }
    }
  }
}
