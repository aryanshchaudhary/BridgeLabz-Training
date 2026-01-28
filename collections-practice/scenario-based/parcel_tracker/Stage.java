package parcel_tracker;

public class Stage {
	String stageName;
	Stage next;
	
	public Stage(String stageName) {
		this.stageName = stageName;
		this.next = null;
	}
}
