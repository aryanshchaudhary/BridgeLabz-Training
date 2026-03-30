package stream_buzz;
import java.util.ArrayList;
import java.util.List;

public class CreatorStats {
	public String creatorName;
	public double[] weeklyLikes;
	
	public static List<CreatorStats> EngagementBoard = new ArrayList<>();
	
	public String getCreatorName(){
		return creatorName;
	}
	
	public void setCreatorName(String name) {
		creatorName = name;
	}
	
	public double[] getWeeklyLikes() {
		return weeklyLikes;
	}
	
	public void setWeeklyLikes(double[] likes) {
		weeklyLikes = likes;
	}
}
