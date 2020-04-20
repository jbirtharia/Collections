package basic.set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Comparator;

@AllArgsConstructor
@Getter
@ToString
public class Teacher implements Comparator<Teacher>,Display<Teacher> {

    private Integer id;
    private String name;

    @Override
    public int compare(Teacher teacher1, Teacher teacher2) {
        if(teacher1.getId() > teacher2.getId())
            return 1;
        else if(teacher1.getId() < teacher2.getId())
            return -1;
        else
            return 0;
    }

    @Override
    public void display() {
        System.out.println(this.toString());
    }
}
