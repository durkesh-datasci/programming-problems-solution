import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class RankElements {

    public static int[] rankArray(int[] arr) {
        int[] ranks = new int[arr.length];
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        Map<Integer, Integer> rankMap = new LinkedHashMap<>();
        int rank = 1;

        for (int num : sortedArr) {
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank++);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            ranks[i] = rankMap.get(arr[i]);
        }

        return ranks;
    }

    public static void main(String[] args) {
        int[] arr = {1, 23, 4, 50, 50};
        int[] ranks = rankArray(arr);

        for (int r : ranks) {
            System.out.print(r + " "); // Output: 1 3 2 4 4
        }
        System.out.println();
    }
}