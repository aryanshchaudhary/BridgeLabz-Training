package factory_robot_hazard_analyzer;

@SuppressWarnings("serial")
public class RobotSafetyException extends Exception{
	RobotSafetyException(String message){
		super(message);
	}
}
