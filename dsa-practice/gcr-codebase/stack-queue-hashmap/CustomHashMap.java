package stack_queue_hashmap;

public class CustomHashMap {
	private int[] map;

	public CustomHashMap() {
		map = new int[1000];
		for (int i = 0; i < map.length; i++) {
			map[i] = -1;
		}
	}
	public void put(int key, int value) {
		map[key] = value;
	}
	public int get(int key) {
		return map[key];
	}
	public void remove(int key) {
		map[key] = -1;
	}
	public static void main(String[] args) {
		CustomHashMap customMap = new CustomHashMap();
		customMap.put(1, 100);
		System.out.println(customMap.get(1));
		customMap.remove(1);
		System.out.println(customMap.get(1));
	}
}
