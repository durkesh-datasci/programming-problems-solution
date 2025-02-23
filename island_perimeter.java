import java.util.Scanner;

public class island_perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt(); // Rows
        int C = sc.nextInt(); // Columns
        int[][] grid = new int[R][C];

        // Input the grid
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        // Arrays for four directions
        int[] dx = {-1, 0, 1, 0}; // Up, Left, Down, Right
        int[] dy = {0, -1, 0, 1};

        int perimeter = 0;

        // Loop through each cell in the grid
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (grid[i][j] == 1) { // If it's land
                    perimeter += 4; // Assume full 4 sides

                    // Check 4 directions
                    for (int d = 0; d < 4; d++) {
                        int ni = i + dx[d]; // New row index
                        int nj = j + dy[d]; // New column index

                        // If the neighbor exists and is also land, subtract 1
                        if (ni >= 0 && ni < R && nj >= 0 && nj < C && grid[ni][nj] == 1) {
                            perimeter--;
                        }
                    }
                }
            }
        }

        System.out.println(perimeter);
        sc.close();
    }
}
