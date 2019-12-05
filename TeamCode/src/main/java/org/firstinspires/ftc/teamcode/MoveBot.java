package org.firstinspires.ftc.teamcode;

public class MoveBot {
HardwareRobot robot = null;

public Movement(HardwareRobot arobot) {
robot = arobot;
}

  public double motorPower(double speed) {
    double power = 1*speed;
    return power;
  }
 
  public void drive (double power, double time) {
   leftDrive.setPower(.power);
   rightDrive.setPower(-power);
   sleep(time);
 }
  
}
