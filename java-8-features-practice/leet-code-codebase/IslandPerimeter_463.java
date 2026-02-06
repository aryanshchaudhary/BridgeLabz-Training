package week_6;

public class IslandPerimeter_463 {
	public int islandPerimeter(int[][] grid) {
		int perimeter = 0;
		int rows = grid.length;
		int cols = grid[0].length;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (grid[i][j] == 1) {
					perimeter += 4;

					if (i > 0 && grid[i - 1][j] == 1) {
						perimeter -= 2;
					}
					if (j > 0 && grid[i][j - 1] == 1) {
						perimeter -= 2;
					}
				}
			}
		}

		return perimeter;
	}

	public static void main(String[] args) {
		IslandPerimeter_463 ip = new IslandPerimeter_463();
		int[][] grid = { { 0, 1, 0, 0 }, { 1, 1, 1, 0 }, { 0, 1, 0, 0 }, { 1, 1, 0, 0 } };
		int result = ip.islandPerimeter(grid);
		System.out.println(result);
	}
}
