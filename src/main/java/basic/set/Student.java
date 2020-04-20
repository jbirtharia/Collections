package basic.set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import java.util.Objects;

@Getter
@AllArgsConstructor
@ToString
public class Student implements Comparable<Student>,Display<Student>{

    private Integer id;
    private String name;

    // This will sort on the basis of id in ascending order
    public int compareTo(Student student) {
        if(this.getId() > student.id)
            return 1;
        else if(this.getId() < student.getId())
            return -1;
        else
            return 0;
    }

   @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(this.getName(), student.getName()) &&
                Objects.equals(this.getId(), student.getId());
    }

    @Override
    public int hashCode() {
        return this.getId();
    }

    @Override
    public void display() {
        System.out.println(this.toString());
    }
}
