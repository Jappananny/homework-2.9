import java.util.*;

public class MapList {

    private static final Random RANDOM = new Random();

    private final Map<String, List<Integer>> mapList = new HashMap<>();

    public MapList() {
        for (int i = 0; i < 5; i++) {
            mapList.put(String.valueOf(i), integerList());

        }
    }

    public Set<Map.Entry<String, List<Integer>>> keysAndValues() {
        return mapList.entrySet();
    }

    public Map<String, Integer> convertCollection() {
        Map<String, Integer> result = new HashMap<>();
        for (Map.Entry<String, List<Integer>> entry :mapList.entrySet()) {
            int sum = 0;
            for (Integer number : entry.getValue()) {
                sum += number;
            }
            result.put(entry.getKey(), sum);

        }
        return result;
    }

    private List<Integer> integerList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(RANDOM.nextInt(1001));

        }
        return list;
    }
}