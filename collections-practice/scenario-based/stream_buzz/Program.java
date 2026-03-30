package stream_buzz;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.List;

public class Program {
	public void registerCreator(CreatorStats record) {
		CreatorStats.EngagementBoard.add(record);
	}
	
	public Dictionary<String, Integer> getTopPostCounts(List<CreatorStats> records, double likeThreshold){
		Dictionary<String, Integer> result = new Hashtable<>();
		for(CreatorStats creator : CreatorStats.EngagementBoard) {
			int count = 0;
			
			for(double like : creator.getWeeklyLikes()) {
				if(like >= likeThreshold) {
					count++;
				}
			}
			if(count > 0) {
				result.put(creator.getCreatorName(), count);
			}
		}
		return result;
	}
	
	public double calculateAverageLikes() {
		double totalLikes = 0;
		int totalWeeks = 0;
		
		for(CreatorStats creator : CreatorStats.EngagementBoard) {
			for(double like : creator.getWeeklyLikes()) {
				totalLikes += like;
				totalWeeks++;
			}
		}
		if(totalWeeks == 0) {
			return 0;
		}
		return totalLikes / totalWeeks;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Program p = new Program();
		int choice;
		
		do {
			System.out.println("1. Register Creator");
			System.out.println("2. Show Top Posts");
            System.out.println("3. Calculate Average Likes");
            System.out.println("4. Exit");
            System.out.println();
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            sc.nextLine();
            
            switch(choice) {
            case 1:
            	System.out.println("Enter Creator Name:");
            	String name = sc.nextLine();
            	
            	double[] likes = new double[4];
            	System.out.println("Enter weekly likes (Week 1 to 4):");
            	for(int i = 0; i < 4; i++) {
            		likes[i] = sc.nextDouble(); 
            	}
            	sc.nextLine();
            	
            	CreatorStats creator = new CreatorStats();
            	creator.setCreatorName(name);
            	creator.setWeeklyLikes(likes);
            	
            	p.registerCreator(creator);
            	System.out.println("Creator registered successfully\n");
            	break;
            	
            case 2:
            	System.out.println("Enter like threshold:");
            	double threshold = sc.nextDouble();
            	
            	Dictionary<String, Integer> result = p.getTopPostCounts(null, threshold);
            	
            	if(result.isEmpty()) {
            		System.out.println("No top-performing posts this week");
            	}else {
            		Enumeration<String> keys = result.keys();
            		while(keys.hasMoreElements()) {
            			String key = keys.nextElement();
            			System.out.println(key + " - " + result.get(key));
            		}
            	}
            	System.out.println();
            	break;
            	
            case 3:
            	double avg = p.calculateAverageLikes();
            	System.out.println("Overall average weekly likes: " + avg + "\n");
            	break;
            	
            case 4:
            	System.out.println("Logging off - Keep Creating with StreamBuzz!");
            	break;
            }
		}while(choice != 4);
		sc.close();
	}
}
