package parcel_tracker;

class Parcel {
	String stage;
	Parcel next;
	
	Parcel(String stage){
		this.stage = stage;
		this.next = null;
	}
}
