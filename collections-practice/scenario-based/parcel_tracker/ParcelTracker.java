package parcel_tracker;

public class ParcelTracker {
	private Stage head;

    public void addStage(String stageName) {
        Stage newNode = new Stage(stageName);

        if (head == null) {
            head = newNode;
            return;
        }

        Stage temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void addCheckpoint(String afterStage, String newStage) {
        Stage temp = head;

        while (temp != null && !temp.stageName.equals(afterStage)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Stage not found: " + afterStage);
            return;
        }

        Stage newNode = new Stage(newStage);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void trackParcel() {
        if (head == null) {
            System.out.println("Parcel lost: No tracking data available");
            return;
        }

        Stage temp = head;
        System.out.println("Parcel Tracking Status:");

        while (temp != null) {
            System.out.print(temp.stageName);
            if (temp.next != null) {
                System.out.print(" → ");
            }
            temp = temp.next;
        }
        System.out.println();
    }
}
