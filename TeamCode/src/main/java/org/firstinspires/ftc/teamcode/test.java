package org.firstinspires.ftc.teamcode;

@Autonomous(name="Test")
public class Test extends LinearOpMode {

 HardwareRobot robot = new HardwareRobot ();
  MoveBot move = new MoveBot(robot);
  
@Override
public void runOpMode()
{
robot.init(hardwareMap);{
}

waitForStart();
  
  move.drive(move.motorPower(0.4),1000);
  move.drive(move.motorPower(0.2),300);
  move.drive(move.motorPower(-0.3),100);

}
  
  
}
