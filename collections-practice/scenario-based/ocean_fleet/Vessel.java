package ocean_fleet;

public class Vessel {
	String vesselId;
	String vesselName;
	double averageSpeed;
	String vesselType;

	public Vessel() {
	}

	public Vessel(String vesselId, String vesselName, double averageSpeed, String vesselType) {
		this.vesselId = vesselId;
		this.vesselName = vesselName;
		this.averageSpeed = averageSpeed;
		this.vesselType = vesselType;
	}

	public String getVesselId() {
		return vesselId;
	}

	public String getVesselName() {
		return vesselName;
	}

	public double getAverageSpeed() {
		return averageSpeed;
	}

	public String getVesselType() {
		return vesselType;
	}

	public void setVesselId(String id) {
		this.vesselId = id;
	}

	public void setVesselName(String name) {
		this.vesselName = name;
	}

	public void setAverageSpeed(double speed) {
		this.averageSpeed = speed;
	}

	public void setVesselType(String type) {
		this.vesselType = type;
	}
}
