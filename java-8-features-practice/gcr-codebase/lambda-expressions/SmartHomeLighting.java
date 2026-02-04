package lambda_expressions;

public class SmartHomeLighting {

	@FunctionalInterface
	interface LightAction {
		void activate();
	}

	public static void main(String[] args) {
		LightAction motionTrigger = () -> System.out.println("Motion detected! Bright white lights ON.");

		LightAction timeTrigger = () -> System.out.println("It's evening! Warm dim lights ON.");

		LightAction voiceTrigger = () -> System.out.println("Voice command received! Custom lighting activated.");

		motionTrigger.activate();
		timeTrigger.activate();
		voiceTrigger.activate();
	}
}
