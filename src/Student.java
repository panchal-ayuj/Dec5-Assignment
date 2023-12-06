import java.util.Objects;

public class Student {
    String name;
    int val;
    Student(String name, int val){
        this.name = name;
        this.val = val;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return val == student.val && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, val);
    }
}
