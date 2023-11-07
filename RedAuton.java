package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name = "Redautom", preselectTeleOp = "Starter Bot 2024")
public class Redautom extends LinearOpMode{

  private DcMotor leftDrive;
  private DcMotor rightDrive;

  /**
   * This function is executed when this OpMode is selected from the Driver Station.
   */
  @Override
  public void runOpMode() {
    leftDrive = hardwareMap.get(DcMotor.class, "leftDrive");
    rightDrive = hardwareMap.get(DcMotor.class, "rightDrive");
    waitForStart();
    if (opModeIsActive()) {
      //position 2
      leftDrive.setPower(-0.5);
      rightDrive.setPower(0.5);
      sleep(800);
      leftDrive.setPower(0.5);
      rightDrive.setPower(-0.5);
      sleep(600);
      leftDrive.setPower(-0.5);
      rightDrive.setPower(-0.5);
      sleep(1300);
      leftDrive.setPower(-0.5);
      rightDrive.setPower(0.5);
      sleep(500);
      
      /*
      //position 3?
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
      leftDrive.setPower(-0.5);
      rightDrive.setPower(-0.5);
      sleep(1300);
      leftDrive.setPower(-0.5);
      rightDrive.setPower(0.5);
      sleep(500);
      */
      
      
      /*
      //position 1?
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
      leftDrive.setPower(-0.5);
      rightDrive.setPower(-0.5);
      sleep(1300);
      leftDrive.setPower(-0.5);
      rightDrive.setPower(0.5);
      sleep(500);
      */
    }
}
}