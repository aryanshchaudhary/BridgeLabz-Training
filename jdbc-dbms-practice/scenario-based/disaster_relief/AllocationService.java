package disaster_relief;
//
//import AreaRequest;
//import ReliefCenter;
//import InsufficientResourceException;

import java.util.*;

public class AllocationService {

    private Map<String, ReliefCenter> centers;
    private Queue<AreaRequest> requestQueue = new LinkedList<>();

    public AllocationService(Map<String, ReliefCenter> centers) {
        this.centers = centers;
    }

    public void addRequest(AreaRequest request) {
        requestQueue.offer(request); // FIFO
    }

    public void processRequests() {

        while (!requestQueue.isEmpty()) {
            AreaRequest request = requestQueue.poll();

            System.out.println("Processing request for: " + request.getAreaName());

            for (ReliefCenter center : centers.values()) {
                try {
                    allocate(center, request);
                    System.out.println("Allocated from: " + center.getCenterName());
                    break;
                } catch (InsufficientResourceException e) {
                    System.out.println("Not enough resources at "
                            + center.getCenterName());
                }
            }
        }
    }

    private void allocate(ReliefCenter center, AreaRequest request)
            throws InsufficientResourceException {

        for (Map.Entry<String, Integer> entry :
                request.getRequestedItems().entrySet()) {

            String item = entry.getKey();
            int quantity = entry.getValue();

            int available = center.getResources()
                    .getOrDefault(item, 0);

            if (available < quantity) {
                throw new InsufficientResourceException(
                        "Insufficient " + item);
            }

            center.getResources().put(item, available - quantity);
        }
    }
}
