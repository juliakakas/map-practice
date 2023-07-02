import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BackToSchool {
    public static void main(String[] args) {
        Map< String, List<Integer>> grades = new HashMap<>();
        grades.put("Lia", Arrays.asList(5,2,4));
        grades.put("Zoli", Arrays.asList(3,2,3));
        System.out.println(grades);
        grades.put("Charlie", Arrays.asList(1,1,1));
        
    }
}
