import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> ovodaiJelek = new HashMap<>();
        ovodaiJelek.put("Zámbó Jimmy", "korona");
        ovodaiJelek.put("Lia", "cseresznye");
        ovodaiJelek.put("Zoli", "létra");
        ovodaiJelek.put("Andris","ház");
        ovodaiJelek.put("Lili", "szilva");
        ovodaiJelek.put("Ági", "szivecske");
        ovodaiJelek.put("Gábor", "ház");
        System.out.println(ovodaiJelek);
        ovodaiJelek.remove("Gábor");
        System.out.println(ovodaiJelek);
        System.out.println(ovodaiJelek.get("Zoli"));
        System.out.println(ovodaiJelek.keySet());
        System.out.println(ovodaiJelek.values());
        System.out.println(ovodaiJelek.entrySet());
        System.out.println(ovodaiJelek.get("Eva"));
        ovodaiJelek.replace("Lia", "masni");
        System.out.println(ovodaiJelek.get("Lia"));


    }

}
