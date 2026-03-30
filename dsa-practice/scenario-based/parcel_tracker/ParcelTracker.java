package parcel_tracker;

class ParcelTracker {
	Parcel head;
	
	void addStage(String stage) {
		Parcel newParcel = new Parcel(stage);
		if(head == null) {
			head = newParcel;
			return;
		}
		Parcel current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newParcel;
	}
	
	void addCheckPoint(String afterStage, String newStage) {
		Parcel temp = head;
		while (temp != null && !temp.stage.equals(afterStage)) {
			temp = temp.next;
		}
		if (temp == null) {
			System.out.println("Stage not found.");
			return;
		}
		Parcel newParcel = new Parcel(newStage);
		newParcel.next = temp.next;
		temp.next = newParcel;
	}
	
	void trackParce() {
		Parcel temp = head;
		if (temp == null) {
			System.out.println("No stages available.");
			return;
		}
		while (temp != null) {
			System.out.println(temp.stage);
			temp = temp.next;
		}
		System.out.println("Delivery Completed.");
	}
}
