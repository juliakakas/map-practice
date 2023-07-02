import java.util.HashMap;
import java.util.Map;

public class Height {
    public static void main(String[] args) {
        Map<String,Integer> heightMap = new HashMap<>();
        heightMap.put("Lia", 172);
        heightMap.put("Zoli", 173);
        heightMap.put("Eszter", 165);
        heightMap.put("Tamás", 182);

        for (Integer actual: heightMap.values()) {
            System.out.println(actual);
        }

        int max = Integer.MIN_VALUE;
        for (Integer actual : heightMap.values()) {
            if (actual >= max){
                max = actual;
            }
        }
        System.out.println(max);

        for (var actual : heightMap.entrySet()) {
            if (max == actual.getValue()){
                System.out.println(actual.getKey());
            }
        }

        int min = Integer.MAX_VALUE;
        for (Integer actual : heightMap.values()) {
            if (actual <= min){
                min = actual;
            }
        }
        for (var actual : heightMap.entrySet()) {
            if (min == actual.getValue()){
                System.out.println(actual.getKey());
            }
        }

    }
}
