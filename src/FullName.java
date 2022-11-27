import java.util.Objects;

public class FullName {
    private final String name;
    private final String secondName;

    public FullName(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FullName fullName = (FullName) o;
        return Objects.equals(name, fullName.name) && Objects.equals(secondName, fullName.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, secondName);
    }

    @Override
    public String toString() {
        return name + " " + secondName;
    }
}