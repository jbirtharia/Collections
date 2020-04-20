package basic.set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Employee implements Display<Employee>{

    private Integer id;
    private String name;

    @Override
    public void display() {
        System.out.println(this.toString());
    }
}
