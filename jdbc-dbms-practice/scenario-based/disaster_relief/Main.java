package disaster_relief;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        ReliefCenter center1 = new ReliefCenter("Center-A");
        center1.addResource("Food", 100);
        center1.addResource("Water", 200);
        center1.addResource("MedicalKit", 50);

        ReliefCenter center2 = new ReliefCenter("Center-B");
        center2.addResource("Food", 50);
        center2.addResource("Water", 100);
        center2.addResource("MedicalKit", 30);

        Map<String, ReliefCenter> centerMap = new HashMap<>();
        centerMap.put(center1.getCenterName(), center1);
        centerMap.put(center2.getCenterName(), center2);

        AllocationService service = new AllocationService(centerMap);

        Map<String, Integer> request1Items = new HashMap<>();
        request1Items.put("Food", 40);
        request1Items.put("Water", 50);

        Map<String, Integer> request2Items = new HashMap<>();
        request2Items.put("Food", 120);  
        request2Items.put("MedicalKit", 20);

        Map<String, Integer> request3Items = new HashMap<>();
        request3Items.put("Water", 80);
        request3Items.put("MedicalKit", 10);

        AreaRequest area1 = new AreaRequest("Area-1", request1Items);
        AreaRequest area2 = new AreaRequest("Area-2", request2Items);
        AreaRequest area3 = new AreaRequest("Area-3", request3Items);

        service.addRequest(area1);
        service.addRequest(area2);
        service.addRequest(area3);

        service.processRequests();

        System.out.println("\nFINAL RESOURCE STATUS");
        for (ReliefCenter center : centerMap.values()) {
            System.out.println("Center: " + center.getCenterName());
            center.getResources().forEach((item, qty) ->
                    System.out.println(item + " : " + qty));
            System.out.println();
        }
    }
}
