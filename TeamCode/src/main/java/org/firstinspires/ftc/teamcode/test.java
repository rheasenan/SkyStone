package org.firstinspires.ftc.teamcode;

@Autonomous(name="Test")
public class Test extends LinearOpMode {
private DcMotor leftDrive, rightDrive;
double power= 0.5;

@Override
public void runOpMode()
{
leftDrive= hardwareMap.get(DcMotor.class, "left_Drive");
leftDrive= hardwareMap.get(DcMotor.class, "right_Drive");

waitForStart();
  
  drive(motorPower(0.4),1000);
  drive(motorPower(0.2),300);
  drive(motorPower(-0.3),100);

}
  public double motorPower(double speed) {
    double power = 1*speed;
    return power;
  }
 
  public void drive (double power, double time) {
   leftDrive.setPower(.power);
   rightDrive.setPower(-power);
   sleep(1000);
 }
  
}
