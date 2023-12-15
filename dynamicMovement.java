package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@Autonomous(name = "CloseAutom", preselectTeleOp = "Starter Bot 2024")
public class CloseAutom extends LinearOpMode {

  private DcMotor leftDrive;
  private DcMotor rightDrive;
  private DcMotor armLeft = null;
  private DcMotor armRight = null;
  private Servo gripper = null;
  private Servo wrist = null;
  private Servo launch = null;
  private Servo latch = null;

  int singleSQ = 652;
  int turnSingle = 380;
  int scorePosition = 1123;
  int homePosition = 0;
  int RB = 1;

  double power = 0.3;

  private void OHST() {
    leftDrive.setPower(power);
    rightDrive.setPower(power);
    leftDrive.setTargetPosition(-turnSingle / 2);
    rightDrive.setTargetPosition(turnSingle / 2);

    leftDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    rightDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);

    sleep(3000);
    leftDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    rightDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    leftDrive.setPower(0);
    rightDrive.setPower(0);
  }

  private void HST() {
    leftDrive.setPower(power);
    rightDrive.setPower(power);
    leftDrive.setTargetPosition(turnSingle / 2);
    rightDrive.setTargetPosition(-turnSingle / 2);

    leftDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    rightDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);

    sleep(3000);
    leftDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    rightDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    leftDrive.setPower(0);
    rightDrive.setPower(0);
  }

  private void OST() {
    leftDrive.setPower(power);
    rightDrive.setPower(power);
    leftDrive.setTargetPosition(-turnSingle);
    rightDrive.setTargetPosition(turnSingle);

    leftDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    rightDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);

    sleep(3000);
    leftDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    rightDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    leftDrive.setPower(0);
    rightDrive.setPower(0);
  }

  private void ST() {
    leftDrive.setPower(power);
    rightDrive.setPower(power);
    leftDrive.setTargetPosition(turnSingle);
    rightDrive.setTargetPosition(-turnSingle);

    leftDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    rightDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);

    sleep(3000);
    leftDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    rightDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    leftDrive.setPower(0);
    rightDrive.setPower(0);
  }

  private void HHQ() {
    leftDrive.setPower(power);
    rightDrive.setPower(power);
    leftDrive.setTargetPosition(singleSQ / 4);
    rightDrive.setTargetPosition(singleSQ / 4);

    leftDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    rightDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);

    sleep(3000);
    leftDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    rightDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    leftDrive.setPower(0);
    rightDrive.setPower(0);
  }

  private void OHHQ() {
    leftDrive.setPower(power);
    rightDrive.setPower(power);
    leftDrive.setTargetPosition((-singleSQ / 4) - 12);
    rightDrive.setTargetPosition((-singleSQ / 4) - 12);

    leftDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    rightDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);

    sleep(3000);
    leftDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    rightDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    leftDrive.setPower(0);
    rightDrive.setPower(0);
  }

  private void OEQ() {
    leftDrive.setPower(power);
    rightDrive.setPower(power);
    leftDrive.setTargetPosition((-singleSQ / 8) - 12);
    rightDrive.setTargetPosition((-singleSQ / 8) - 12);

    leftDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    rightDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);

    sleep(3000);
    leftDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    rightDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    leftDrive.setPower(0);
    rightDrive.setPower(0);
  }

  private void OHQ() {
    leftDrive.setPower(power);
    rightDrive.setPower(power);
    leftDrive.setTargetPosition(-singleSQ / 2);
    rightDrive.setTargetPosition(-singleSQ / 2);

    leftDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    rightDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);

    sleep(3000);
    leftDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    rightDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    leftDrive.setPower(0);
    rightDrive.setPower(0);
  }

  private void HQ() {
    leftDrive.setPower(power);
    rightDrive.setPower(power);
    leftDrive.setTargetPosition(singleSQ / 2);
    rightDrive.setTargetPosition(singleSQ / 2);

    leftDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    rightDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);

    sleep(3000);
    leftDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    rightDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    leftDrive.setPower(0);
    rightDrive.setPower(0);
  }

  private void OSQ() {
    leftDrive.setPower(power);
    rightDrive.setPower(power);
    leftDrive.setTargetPosition(-singleSQ);
    rightDrive.setTargetPosition(-singleSQ);

    leftDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    rightDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);

    sleep(3000);
    leftDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    rightDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    leftDrive.setPower(0);
    rightDrive.setPower(0);
  }

  private void SQ() {
    leftDrive.setPower(power);
    rightDrive.setPower(power);
    leftDrive.setTargetPosition(singleSQ);
    rightDrive.setTargetPosition(singleSQ);

    leftDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    rightDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);

    sleep(3000);
    leftDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    rightDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    leftDrive.setPower(0);
    rightDrive.setPower(0);
  }

  private void Score() {
    armRight.setPower(power);
    armLeft.setPower(power);
    armRight.setTargetPosition(scorePosition);
    armLeft.setTargetPosition(scorePosition);

    armRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    armLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    sleep(2500);
    armRight.setPower(0);
    armLeft.setPower(0);
  }

  private void Reset() {
    armRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    armLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    leftDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    rightDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
  }

  private void leftTurn(int amount) {
    leftDrive.setPower(power);
    rightDrive.setPower(power);
    leftDrive.setTargetPosition(amount);
    rightDrive.setTargetPosition(-amount);
    finish();
  }

  private void rightTurn(int amount) {
    leftDrive.setPower(power);
    rightDrive.setPower(power);
    leftDrive.setTargetPosition(-amount);
    rightDrive.setTargetPosition(amount);
    finish();
  }

  private void move(int amount) {
    leftDrive.setPower(power);
    rightDrive.setPower(power);
    leftDrive.setTargetPosition(amount);
    rightDrive.setTargetPosition(amount);
    finish();
  }

  private void finish() {
    leftDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    rightDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);

    sleep(3000);
    leftDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    rightDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    leftDrive.setPower(0);
    rightDrive.setPower(0);
  }

  private final double gripperClosedPosition = 1.0;
  private final double gripperOpenPosition = 0.5;
  private final double wristUpPosition = 1.0;
  private final double wristDownPosition = 0.2;

  /**
   * This function is executed when this OpMode is selected from the Driver Station.
   */
  @Override
  public void runOpMode() {
    leftDrive = hardwareMap.get(DcMotor.class, "leftDrive");
    rightDrive = hardwareMap.get(DcMotor.class, "rightDrive");
    armLeft = hardwareMap.get(DcMotor.class, "armleft");
    armRight = hardwareMap.get(DcMotor.class, "armright");
    gripper = hardwareMap.get(Servo.class, "gripper");
    wrist = hardwareMap.get(Servo.class, "wrist");
    launch = hardwareMap.get(Servo.class, "launch");
    latch = hardwareMap.get(Servo.class, "latch");

    leftDrive.setDirection(DcMotor.Direction.REVERSE);
    rightDrive.setDirection(DcMotor.Direction.FORWARD);
    leftDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    rightDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    leftDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    rightDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    leftDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
    rightDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);

    armLeft.setDirection(DcMotor.Direction.FORWARD);
    armRight.setDirection(DcMotor.Direction.FORWARD);
    armLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    armRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    armLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    armRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    armLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    armRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    armLeft.setPower(0.0);
    armRight.setPower(0.0);
    leftDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    rightDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    //camera

    waitForStart();
    if (opModeIsActive()) {
      //position 2
      gripper.setPosition(gripperOpenPosition);
      sleep(2000);

      int armPosition = armRight.getCurrentPosition();
      int leftPosition = leftDrive.getCurrentPosition();

      telemetry.addData("rightArmPosition", armPosition);
      telemetry.addData("leftEncoder", leftPosition);
      telemetry.update();

      double power = 0.5;

      // SQ();
      // OHHQ();
      // OST();
      // OSQ();
      // OHHQ();
      // SQ();
      // OHHQ();
      // OST();
      // OSQ();
      // OHHQ();
      move(singleSQ - 16);
      move(-singleSQ / 6);
      rightTurn(turnSingle-18);
      sleep(1000);
      move(-singleSQ - singleSQ / 4);
      sleep(1000);
      Score();

      gripper.setPosition(gripperClosedPosition);
      sleep(800);
      //position 2
      /*gripper.setPosition(gripperOpenPosition);
   leftDrive.setPower(0.5);
   rightDrive.setPower(0.5);
   sleep(single);
   leftDrive.setPower(-0.5);
   rightDrive.setPower(-0.5);
   sleep(720);
   leftDrive.setPower(0.6 * RB);
   rightDrive.setPower(-0.6 * RB);
   sleep(turnS);
   leftDrive.setPower(0.5);
   rightDrive.setPower(0.5);
   sleep(single);
   gripper.setPosition(gripperClosedPosition);
   leftDrive.setPower(0);
   rightDrive.setPower(0);*/

    }
  }
}
