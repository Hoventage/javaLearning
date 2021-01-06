import java.util.Objects;

public class ClassToCheckOutObject {
    int a = 10;
    boolean bool = false;

    @Override
    public String toString() {
        return "ClassToCheckOutObject{" +
                "a=" + a +
                ", bool= " + bool +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassToCheckOutObject that = (ClassToCheckOutObject) o;
        return a == that.a && bool == that.bool;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, bool);
    }
}
