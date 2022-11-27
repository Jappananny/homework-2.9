import lombok.Setter;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Setter
public class Phonebook {
    private final Map<FullName, String> book1 = new HashMap<>();
    public void addPhone(FullName fullName, String number){
        book1.put(fullName, number);
    }
    public Set<Map.Entry<FullName, String>> getPrhone() {
        return book1.entrySet();

    }
}
