package basic.map;

import java.util.*;
import java.util.stream.IntStream;

public class Test {

    public static void main1(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        // If key is same then put method will return old value
        Object obj1 = map.put(101,"Sachin");
        Object obj2 = map.put(102,"MS");
        Object obj3 = map.put(101,"Virat");

        System.out.println("obj 1 : "+obj1+" obj 2 : "+obj2+" obj 3 : "+obj3);
        map.forEach((k, v) -> {
            System.out.print("Key : " + k);
            System.out.println("\tValue : "+v);
        });
    }

    public static void main2(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(101,"Sachin");
        map.put(102,"MS");
        map.put(103,"Virat");

        for (Map.Entry<Integer,String> entry: map.entrySet()){
            System.out.print("Key : " + entry.getKey());
            System.out.println("\tValue : "+entry.getValue());
        }
    }

    public static void main3(String[] args) {

        HashMap<Student, String> students = new HashMap();

        Student student = new Student(2,"Sachin");
        students.put(student,student.getName());

        student = new Student(4,"Raina");
        students.put(student,student.getName());

        /* This object will not add in set because equals() method
         * is overridden in Student class.
         * HashMap uses equals() method to check whether two object is equal or not. */
        student = new Student(4,"Raina");
        students.put(student,student.getName());

        student = new Student(1,"MS");
        students.put(student,student.getName());

        student = new Student(3,"Virat");
        students.put(student,student.getName());

        students.forEach((k, v) -> {
            System.out.print("Student id : " + k.getId());
            System.out.println("\tStudent name : "+k.getName());
        });
    }

    public static void main(String[] args) {

        IdentityHashMap<Student, String> students = new IdentityHashMap();

        Student student = new Student(2,"Sachin");
        students.put(student,student.getName());

        student = new Student(4,"Sehwag");
        System.out.println("Student : "+student.hashCode());
        students.put(student,student.getName());

        /* This object will not add in set because hashcode() method
         * is overridden in Student class.
         * HashMap uses == operator to check whether two object is equal or not. */
        student = new Student(4,"Raina");
        System.out.println("Student : "+student.hashCode());
        students.put(student,student.getName());

        student = new Student(1,"MS");
        students.put(student,student.getName());

        student = new Student(3,"Virat");
        students.put(student,student.getName());

        students.forEach((k, v) -> {
            System.out.print("Student id : " + k.getId());
            System.out.println("\tStudent name : "+k.getName());
        });
    }
}
