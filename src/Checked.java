import lombok.Getter;

import java.util.HashMap;
import java.util.Map;
@Getter
public class Checked {
    public static Map<String, Integer> checked = new HashMap<>();

    public static void addMap(String string, Integer integer){
        if (checked.containsKey(string)){
            if (integer.equals(checked.get(string))){
                throw new RuntimeException("Такой обьект уже есть");
            } else {
                checked.put(string,integer);
            }
            return;
        }
        checked.put(string,integer);
        System.out.println(checked);

    }

    @Override
    public String toString() {
        return "Checked{}";
    }
}
