package basic.set;

import java.util.HashSet;
import java.util.TreeSet;

public class Test {

    public static void main1(String[] args) {

        HashSet<Student> students = new HashSet<>();
        students.add(new Student(2,"Sachin"));
        students.add(new Student(4,"Sehwag"));

        /* This object will not add in set because hashCode() and equals() method
         * is overridden on Student class.*/
        students.add(new Student(4,"Sehwag"));

        students.add(new Student(1,"MS"));
        students.add(new Student(3,"Virat"));

        System.out.println("Students : "+students);
    }

    public static void main2(String[] args) {
        TreeSet set = new TreeSet();
        set.add("B");
        set.add("a");
        set.add("A");
        set.add("Z");
        set.add("P");

        /* Class Cast Exception because in TreeSet each element is add by comparing with other element
         * to maintain sorting order so JVM will try to convert Integer to String
         * to sort between two String, hence JVM will throw Class Cast Exception*/
        //set.add(new Integer(10));

        //JVM will throw NullPointerException. After Java 1.7 null is not allowed in TreeSet.
        //set.add(null);

        System.out.println("Set : "+set);
    }

    public static void main3(String[] args) {

        TreeSet set = new TreeSet();

        /* TreeSet uses Comparable interface to implement default sorting behaviour in TreeSet. So if we
         * are adding any object in TreeSet then that class must implement Comparable interface otherwise
         * JVM will throw ClassCastException.
         * String has already implemented Comparable interface so by adding String class object JVM will ot throw any Exception.
         * But StringBuffer class has not implemented Comparable interface so JVM will throw ClassCastException.
         * So if we want to by default sorting order then in TreeSet only homogenous element must be added and the class
         * which we are adding must implement Comparable Interface.
         * String class and all Wrapper classes by default is implemented Comparable interface.*/
        set.add(new StringBuffer("B"));
        set.add(new StringBuffer("A"));

        System.out.println("Set : "+set);
    }

    public static void main4(String[] args) {

        TreeSet<Student> students = new TreeSet<>();
        students.add(new Student(2,"Sachin"));
        students.add(new Student(4,"Sehwag"));
        students.add(new Student(4,"Sehwag"));
        students.add(new Student(1,"MS"));
        students.add(new Student(3,"Virat"));

        students.stream().forEach(Student::display);

    }

    public static void main5(String[] args) {

        //Passing Comparator interface to TreeSet constructor
        //Since Comparator interface is functional interface so using lambda expression
        TreeSet<Employee> employees = new TreeSet<>((emp1,emp2)->{
            if(emp1.getId()>emp2.getId())
                return 1;
            else if(emp1.getId() < emp2.getId())
                return -1;
            else
                return 0;
        });

        employees.add(new Employee(2,"Sachin"));
        employees.add(new Employee(4,"Sehwag"));
        employees.add(new Employee(4,"Sehwag"));
        employees.add(new Employee(1,"MS"));
        employees.add(new Employee(3,"Virat"));

        employees.stream().forEach(Employee::display);
    }

    public static void main6(String[] args) {

        //Creating a set in which names is stored in descending order by alphabetically
        TreeSet<String> names = new TreeSet<>((s1, s2) -> s2.compareTo(s1) );
        names.add("MS");
        names.add("Virat");
        names.add("Ishant");
        names.add("Sachin");
        names.add("Sehwag");
        names.stream().forEach(System.out::println);
    }

    public static void main7(String[] args) {

        //Creating a set in which names is stored in ascending order by length of names
        TreeSet<String> names = new TreeSet<>((s1, s2) -> new Integer(s1.length()).compareTo(s2.length()));
        names.add("MS");
        names.add("Virat");
        names.add("Ishant");
        names.add("Sachin");
        names.add("Murlidharan");
        names.stream().forEach(System.out::println);
    }

    public static void main8(String[] args) {

        //Creating a set in which names is stored in descending order by length of names
        TreeSet<String> names = new TreeSet<>((s1, s2) -> -(new Integer(s1.length()).compareTo(s2.length())));
        names.add("MS");
        names.add("Virat");
        names.add("Ishant");
        names.add("Sachin");
        names.add("Murlidharan");
        names.stream().forEach(System.out::println);
    }

    public static void main9(String[] args) {
        //Default nature sorting with StringBuffer
        TreeSet<StringBuffer> names = new TreeSet<>((s1, s2) -> s1.toString().compareTo(s2.toString()));
        names.add(new StringBuffer("MS"));
        names.add(new StringBuffer("Virat"));
        names.add(new StringBuffer("Ishant"));
        names.add(new StringBuffer("Sachin"));
        names.add(new StringBuffer("Murlidharan"));
        names.stream().forEach(System.out::println);
    }

    public static void main(String[] args) {

        /* Creating a set in which names is stored in ascending order by length of names anf if lenght is equal then
        *  sort on the basis of alphabetically. */
        TreeSet names = new TreeSet((s1, s2) ->{
            if (s1.toString().length() > s2.toString().length())
                return 1;
            else if (s1.toString().length() < s2.toString().length())
                return -1;
            else
             return s1.toString().compareTo(s2.toString());
        });
        names.add("MS");
        names.add(new StringBuffer("Virat"));
        names.add("Ishant");
        names.add("Sachin");
        names.add(new StringBuffer("Sachin"));
        names.add(new StringBuffer("Murlidharan"));
        names.stream().forEach(System.out::println);
    }
}
